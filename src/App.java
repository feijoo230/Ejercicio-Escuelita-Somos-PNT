import productos.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Producto> productos = CargadorProductos.cargarProductos();
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("=============================");
        Producto max = Collections.max(productos);
        Producto min = Collections.min(productos);
        System.out.println("Producto más caro: " + max.getNombre());
        System.out.println("Producto más barato: " + min.getNombre());
    }
}
