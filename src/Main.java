import Model.Idioma;
import Model.Video;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el título del video:");
        String titulo = input.nextLine();

        System.out.println("Ingrese el precio del video:");
        double precio = input.nextDouble();
        input.nextLine();

        System.out.println("Ingrese el idioma (ESPANIOL, INGLES, ALEMAN, PORTUGUES, FRANCES):");
        String entradaIdioma = input.nextLine().toUpperCase();

        Idioma idioma;
        try {
            idioma = Idioma.valueOf(entradaIdioma);
        } catch (IllegalArgumentException e) {
            System.out.println("Idioma no válido, se asignará ESPANIOL por defecto.");
            idioma = Idioma.ESPANIOL;
        }

        System.out.println("Ingrese la duración en horas del video:");
        float duracionHoras = input.nextFloat();

        Video miVideo = new Video(titulo, precio, duracionHoras, idioma);

        System.out.println("\n--- Resultado ---");
        System.out.println(miVideo);
    }
}