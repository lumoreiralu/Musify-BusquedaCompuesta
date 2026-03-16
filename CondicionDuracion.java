public class CondicionDuracion implements Condicion{
    private int duracionMinima;

    public CondicionDuracion(int duracionMinima) {
        this.duracionMinima = duracionMinima;
    }

    public int getDuracionMinima() {
        return duracionMinima;
    }

    public void setDuracionMinima(int duracionMinima) {
        this.duracionMinima = duracionMinima;
    }

    @Override
    public boolean cumple(Pista elem) {
        return this.duracionMinima<elem.getDuracion();
    }

    
}
