package productosbebe;

public class ProductosBebe {

    private String nombre;
    private int precio;
    private int ventas;

    public ProductosBebe() {
        this.nombre = "";
        this.precio = 0;
        this.ventas = 0;

    }

    public ProductosBebe(String nombre, int precio, int ventas) {
        this.nombre = nombre;
        this.precio = precio;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "ProductosBebe{" + "nombre=" + nombre + ", precio=" + precio + ", ventas=" + ventas + '}';
    }

}
