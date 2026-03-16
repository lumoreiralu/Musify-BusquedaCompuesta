public class CondicionArtista implements Condicion {
    private String artistaBuscado;

    public CondicionArtista(String artistaBuscado) {
        this.artistaBuscado = artistaBuscado;
    }

    public String getArtistaBuscado() {
        return artistaBuscado;
    }

    public void setArtistaBuscado(String artistaBuscado) {
        this.artistaBuscado = artistaBuscado;
    }

    @Override
    public boolean cumple(Pista elem) {
        return elem.getArtista().contains(artistaBuscado);
    }

    
}
