import java.util.ArrayList;

public class Pista extends ElementoMusical {

    private int id;
    private int duracion;
    private String artista;
    private String album;
    private String genero; 
    private int anio;

    public Pista(String titulo, int id, int duracion, String artista, String album, String genero, int anio) {
        super(titulo);
        this.id = id;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.anio = anio;
    }


    
    public int getAnio() {
        return anio;
    }

    public int getId() {
        return id;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }



    @Override
    public ArrayList<Pista> buscar(Condicion condicion) {
        ArrayList<Pista>resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public boolean equals(Object otro){
        try{
            Pista nuevo = (Pista) otro;
            return this.getId()==nuevo.getId();
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString(){
        return "Pista: " + this.getTitulo();
    }

    

    
}
