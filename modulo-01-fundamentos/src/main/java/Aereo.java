public abstract class Aereo extends Transporte{

    protected double altitudMaxima;
    //Constructor
    public Aereo(double combustible, double altitudMaxima){
        super(combustible);
        this.altitudMaxima = altitudMaxima;
    }

    //Metodo comun para todos los aereos
    public void reportarAltitud(){
        System.out.println("Altitud actual: "+ (altitudMaxima * 0.8));
    }
    // Método abstracto: Cada transporte aéreo despega distinto
    public abstract void despegar();
}
