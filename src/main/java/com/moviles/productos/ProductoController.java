package com.moviles.productos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promos")
public class ProductoController {
	@GetMapping
    public List<Producto> obtenerRecomendados() {
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Pastel Flowers", "Libre de gluten", "Pasteles", 250.0, "https://dulcefina.com.pe/wp-content/uploads/2021/06/WhatsApp-Image-2021-06-26-at-10.42.37-AM-2-416x420.jpg"));
        lista.add(new Producto("Pastel Corazón", "Libre de gluten", "Pasteles", 360.5, "https://dulcefina.com.pe/wp-content/uploads/2021/09/calado-costado-416x416.png"));
        lista.add(new Producto("Cup Mum", "Libre de gluten", "Cupcakes", 80.0, "https://dulcefina.com.pe/wp-content/uploads/2025/04/ESTUCHE-CUPCAKES-X1-416x416.jpg"));
        lista.add(new Producto("Galletas Dog", "Libre de gluten", "Cookies", 40.0, "https://dulcefina.com.pe/wp-content/uploads/2023/05/brissa-4-416x416.jpg"));
        lista.add(new Producto("Pastel Fly", "Libre de gluten", "Pasteles", 180.0, "https://dulcefina.com.pe/wp-content/uploads/2025/02/mariposa_0001_Capa-2-416x416.jpg"));
        
        return lista;
    }

}
