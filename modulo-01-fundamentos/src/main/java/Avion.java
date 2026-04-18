public class Avion extends Aereo{
    public Avion(double combustible, double altitudMaxima){
        super(combustible, altitudMaxima);

    }

    @Override
    public void despegar(){
        System.out.println("Despegar");
    }
}
