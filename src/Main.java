import Model.Libro;
import Model.Disco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String titulo;
        double precio;
        int anioPublicacion;
        int numeroPaginas;

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la editorial");
        System.out.println("Vamos a crear un libro!!");
        System.out.println("Ingrese el título del libro");
        titulo = input.nextLine();
        System.out.println("Ingrese el precio del libro");
        precio = input.nextDouble();
        System.out.println("Ingrese el año de publicación del libro");
        anioPublicacion = input.nextInt();
        System.out.println("Ingrese el número de páginas del libro");
        numeroPaginas = input.nextInt();

        Libro miLibro = new Libro(titulo, precio, anioPublicacion, numeroPaginas);

        System.out.println(miLibro);

        float duracionMinutos;

        System.out.println("Ingrese el título del Disco");
        titulo = input.nextLine();
        System.out.println("Ingrese el precio del Disco");
        precio = input.nextDouble();
        System.out.println("Ingrese la duración en minutos del Disco");
        duracionMinutos = input.nextInt();

        Disco miDisco = new Disco(titulo, precio, duracionMinutos);

        System.out.println(miDisco);
    }

}