

public abstract class Transporte {
    // 1. Atributo (Estado): Cosa que la interfaz NO puede tener
    protected double combustible;

    public Transporte(double combustible){
        this.combustible = combustible;
    }
    // 3. Método con LÓGICA: Todas las subclases lo usan igual
    public void cargar(double combustible){
        this.combustible += combustible;
    }

}
