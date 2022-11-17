public class Libro {
    private String materia;
    private int plazo;
    private int capitulo;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    Libro(String materia, int plazo, int capitulo){
        setMateria(materia);
        setPlazo(plazo);
        setCapitulo(capitulo);
    }
}
