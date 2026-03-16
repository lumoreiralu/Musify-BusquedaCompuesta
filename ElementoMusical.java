import java.util.ArrayList;

public abstract class ElementoMusical{
    private String titulo;

    public ElementoMusical(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract int getDuracion();
    public abstract ArrayList<Pista> buscar(Condicion condicion);
}