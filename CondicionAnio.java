public class CondicionAnio implements Condicion{
    private int anioBuscado;

    
    public CondicionAnio(int anioBuscado) {
        this.anioBuscado = anioBuscado;
    }
    

    @Override
    public boolean cumple(Pista pista) {
        return this.anioBuscado==pista.getAnio();
    }


    public int getAnioBuscado() {
        return anioBuscado;
    }



    public void setAnioBuscado(int anioBuscado) {
        this.anioBuscado = anioBuscado;
    }
    
}
