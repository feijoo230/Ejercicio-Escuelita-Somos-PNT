package productos;

import java.util.ArrayList;
import java.util.List;

public class CargadorProductos {
    public static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
        productos.add(new Bebida("Coca-Cola", 1.5, 18));
        productos.add(new Shampoo("Shampoo Sedal", 500, 19));
        productos.add(new Fruta("Frutillas", 64, "kilo"));
        return productos;
    }
}
