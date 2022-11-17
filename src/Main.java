public class Main {
    public static void main(String[] args) {

    System.out.println("Elija un libro");

    Libro1o3Sem matematica = new Libro1o3Sem(
            3
    );
    matematica.getPlazo();

    System.out.println("Debe devolverlo en : " + matematica.getPlazo() + " semanas ");






    }
}
