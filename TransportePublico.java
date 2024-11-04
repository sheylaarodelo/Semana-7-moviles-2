public class TransportePublico {
    protected String tipo;
    protected String ruta;
    protected double tarifa;
    protected double distanciaRecorrida;
    protected int tiempoRecorrido;

    public TransportePublico(String tipo, String ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public double calcularTarifa() {
        // Implementar lógica básica para calcular la tarifa
        return tarifa;
    }

    public double calcularDistanciaRecorrida() {
        // Implementar lógica para calcular la distancia recorrida
        return distanciaRecorrida;
    }

    public int calcularTiempoRecorrido() {
        // Implementar lógica para calcular el tiempo de viaje en minutos
        return tiempoRecorrido;
    }
}

