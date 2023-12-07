public class Comidastipicas {
    String nombre;
    String origen;
    float precio;

    public Comidastipicas(String nombre, String origen, float precio){
        this.nombre=nombre;
        this.origen=origen;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
