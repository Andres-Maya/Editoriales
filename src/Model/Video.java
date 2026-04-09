package Model;

public class Video extends Publicacion{
    private float duracionHoras;
    private Idioma idioma;

    public Video (String titulo, double precio, float duracionHoras, Idioma idioma) {
        super(titulo, precio);
        this.duracionHoras = duracionHoras;
        this.idioma = idioma;
    }

    public Video(float duracionHoras){
        this.duracionHoras = duracionHoras;
    }

    public Video(){
        super();
        this.duracionHoras = 0;
        this.idioma = null;
    }

    public float getDuracionHoras(){
        return duracionHoras;
    }
    public void setDuracionHoras(float duracionHoras){
        this.duracionHoras = duracionHoras;
    }
    public Idioma getIdioma(){
        return idioma;
    }
    public void setIdioma(Idioma idioma){
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Video{" +
                "Titulo='" + getTitulo() +
                ", Precio=" + getPrecio() +
                ", duración en horas: " + duracionHoras +
                ", idioma del video: " + idioma + "}";
    }
}
