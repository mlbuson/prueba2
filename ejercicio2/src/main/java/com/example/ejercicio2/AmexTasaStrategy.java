package com.example.ejercicio2;
import org.springframework.stereotype.Service;

@Service("AmexTasaStrategy")
public class AmexTasaStrategy implements TarjetaTasaStrategy {
    @Override
    public String getStrategyName() {
        return "amex";
    }
    @Override
    public double calcularTasa(double importe) {
        return (9 * 0.1);
    }
}
