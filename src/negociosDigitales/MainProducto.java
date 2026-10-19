package negociosDigitales;

public class MainProducto {
    static void main() {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.nombre = "Mouse";
        producto1.precio = 20;
        producto1.categoria = "Tecnología";

        producto2.nombre = "Curso Java";
        producto2.precio = 75;
        producto2.categoria = "Educación";

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();
        System.out.println();
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();
        System.out.println();

        producto1.precio = 25;

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();
        System.out.println();
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        System.out.println();
        producto1.mostrarPrecio();

    }
}
