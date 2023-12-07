
public class Main {
    public static void main(String[] args) {

        Comidastipicas comida1, comida2, comida3, comida4;

        comida1=new Comidastipicas("Cuy con papas", "cuenca",5.25f);
        comida2=new Comidastipicas("Encebollado", "Guayaquil", 2.50f);
        comida3=new Comidastipicas("Hornado", "Sangolqui", 3.40f);
        comida4=new Comidastipicas("Ceviche", "Peru", 3f);

        System.out.println("Comida: "+comida1.getNombre());
        System.out.println("Origen: "+comida1.getOrigen());
        System.out.println("Precio: "+comida1.getPrecio());

        System.out.println("\nComida: "+comida2.getNombre());
        System.out.println("Origen: "+comida2.getOrigen());
        System.out.println("Precio: "+comida2.getPrecio());

        System.out.println("\nComida: "+comida3.getNombre());
        System.out.println("Origen: "+comida3.getOrigen());
        System.out.println("Precio: "+comida3.getPrecio());

        System.out.println("\nComida: "+comida4.getNombre());
        System.out.println("Origen: "+comida4.getOrigen());
        System.out.println("Precio: "+comida4.getPrecio());

    }
}