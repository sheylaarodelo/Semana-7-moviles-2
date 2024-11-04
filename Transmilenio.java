public class Transmilenio extends TransportePublico {
    private int numeroParadas;

    public Transmilenio(String ruta, int numeroParadas) {
        super("Transmilenio", ruta);
        this.numeroParadas = numeroParadas;
    }

    public double calcularTarifaTransmilenio() {
        this.tarifa = 2500; // Ejemplo de tarifa
        return this.tarifa;
    }

    public void mostrarRuta() {
        System.out.println("Ruta de Transmilenio: " + ruta);
        System.out.println("Número de Paradas: " + numeroParadas);
    }
}
