package com.example;
public class Bus extends TransportePublico {
    private int capacidad;

    public Bus(String ruta, int capacidad) {
        super("Bus", ruta);
        this.capacidad = capacidad;
    }

    public double calcularTarifaBus() {
        // Lógica para calcular tarifa específica para Bus
        this.tarifa = 2000; // Ejemplo de tarifa
        return this.tarifa;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ruta: " + ruta);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tarifa: " + calcularTarifaBus());
    }
}

