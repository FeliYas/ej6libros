public class Libro {
    private int plazo;
    private int capitulo;

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }




    Libro(int plazo, int capitulo){
        setPlazo(plazo);
        setCapitulo(capitulo);
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }
}
