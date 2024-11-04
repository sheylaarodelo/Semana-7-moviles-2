public class Metro extends TransportePublico {
    private int numeroEstaciones;

    public Metro(String ruta, int numeroEstaciones) {
        super("Metro", ruta);
        this.numeroEstaciones = numeroEstaciones;
    }

    public double calcularTarifaMetro() {
        this.tarifa = 3000; // Ejemplo de tarifa
        return this.tarifa;
    }

    public void mostrarMapa() {
        System.out.println("Ruta del Metro: " + ruta);
        System.out.println("Número de Estaciones: " + numeroEstaciones);
    }
} 