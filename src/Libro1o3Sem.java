public class Libro1o3Sem extends Libro{
    Libro1o3Sem( int capitulo) {
        super(1,capitulo);
        if (capitulo >= 2){
            setPlazo(3);
        }else{
            setPlazo(1);
        }


    }


}
