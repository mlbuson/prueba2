package com.example.ejercicio2;
import org.springframework.stereotype.Service;

@Service("NaraTasaStrategy")
public class NaraTasaStrategy implements TarjetaTasaStrategy {
    @Override
    public String getStrategyName() {
        return "nara";
    }
    @Override
    public double calcularTasa(double importe) {
        return (27 * 0.5);
    }
}
