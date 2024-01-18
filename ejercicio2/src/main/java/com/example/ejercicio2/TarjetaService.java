package com.example.ejercicio2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class TarjetaService {

   private TarjetaTasaStrategy tarjetaTasaStrategy;

    public void setTarjetaTasaStrategy(TarjetaTasaStrategy tarjetaTasaStrategy) {
        this.tarjetaTasaStrategy = tarjetaTasaStrategy;
    }

    public boolean esTarjetaValida(Tarjeta tarjeta) {
        return tarjeta.getFechaVencimiento().isAfter(LocalDate.now());
    }

    public boolean sonTarjetasDistintas(Tarjeta tarjeta1, Tarjeta tarjeta2) {
        return !tarjeta1.equals(tarjeta2);
    }

    public double obtenerTasaOperacion(String marca, double importe) {
        try {
            if (marca.isBlank()){
                return 0;
            }else if (marca.equals("visa")) {
                tarjetaTasaStrategy = new VisaTasaStrategy();
            }else if (marca.equals("amex")) {
                tarjetaTasaStrategy = new AmexTasaStrategy();
            }else if (marca.equals("nara")){
                tarjetaTasaStrategy = new NaraTasaStrategy();
            }else {
                return 0;
            }
            return tarjetaTasaStrategy.calcularTasa(importe);

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
