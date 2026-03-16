import java.util.ArrayList;

public class Playlist extends ElementoMusical {

    private ArrayList<ElementoMusical> elementos;

    public Playlist(String titulo) {
        super(titulo);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoMusical elem){
        if(!elementos.contains(elem)){
            this.elementos.add(elem);
        }
    }

    public void deleteElemento(ElementoMusical elem){
        if(elementos.contains(elem)){
            this.elementos.remove(elem);
        }
    }

    @Override
    public int getDuracion() {
        int duracionTotal = 0;
        for(ElementoMusical elem: elementos){
            duracionTotal += elem.getDuracion();
        }
        return duracionTotal;
    }

    public ArrayList<Pista> buscar(Condicion condicion){
        ArrayList<Pista> resultado = new ArrayList<>();
        for(ElementoMusical elem: elementos){
            resultado.addAll(elem.buscar(condicion));
        }
        return resultado;
    }
    
}
