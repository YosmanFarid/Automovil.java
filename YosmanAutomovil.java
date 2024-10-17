public class Automovil {
    private String marca;
    private int modelo;
    private int velocidadMaxima;
    private int velocidadActual;
    private String tipoCombustible;
    private String tipoAutomovil;

    public Automovil(String marca, int modelo, int velocidadMaxima, String tipoCombustible, String tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if (velocidadActual <= velocidadMaxima) {
            this.velocidadActual = velocidadActual;
        } else {
            System.out.println("La velocidad actual no puede exceder la velocidad máxima.");
        }
    }

    public void acelerar(int incremento) {
        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
            System.out.println("El automóvil ha acelerado a: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima.");
        }
    }

    public void frenar(int decremento) {
        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
            System.out.println("El automóvil ha frenado a: " + velocidadActual + " km/h");
        } else {
            velocidadActual = 0;
            System.out.println("El automóvil se ha detenido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
    }
}
