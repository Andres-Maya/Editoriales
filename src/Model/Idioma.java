package Model;

public enum Idioma {
    ESPANIOL("Español"),
    INGLES("Inglés"),
    ALEMAN("Alemán"),
    PORTUGUES("Portugués"),
    FRANCES("Francés");

    private final String idiomas;

    Idioma(String idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return idiomas;
    }
}
