package Model;

public class Libro extends Publicacion{
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro (String titulo, double precio, int numeroPaginas, int anioPublicacion) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro (int  numeroPaginas, int anioPublicacion) {
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
        super();
        this.numeroPaginas = 0;
        this.anioPublicacion = 0;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + getTitulo() +
                ", Precio=" + getPrecio() +
                ", Año de publicacion: " + anioPublicacion +
                ", numero de páginas: " + numeroPaginas +
                "}";
    }
}
