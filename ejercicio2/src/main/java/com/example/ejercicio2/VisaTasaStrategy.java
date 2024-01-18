package com.example.ejercicio2;
import org.springframework.stereotype.Service;

@Service("VisaTasaStrategy")
public class VisaTasaStrategy implements TarjetaTasaStrategy {
    @Override
    public String getStrategyName() {
        return "visa";
    }

    @Override
    public double calcularTasa(double importe) {
        return (2024.0 / 12);
    }
}
