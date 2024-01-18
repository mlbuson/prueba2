package com.example.ejercicio2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TasaOperacionController {
    @Autowired
    private TarjetaService tarjetaService;

    @PostMapping ("/tasas-operacion")
    public double obtenerTasaOperacion(@RequestBody TasaOperacionRequest request) {
        double tasa = tarjetaService.obtenerTasaOperacion(request.getMarcaTarjeta(), request.getMonto());
        return tasa;

    }

}
