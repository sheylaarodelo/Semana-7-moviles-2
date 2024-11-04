package com.example;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Ruta 1", 50);
        bus.mostrarInformacion();

        Metro metro = new Metro("Línea A", 15);
        metro.mostrarMapa();

        Transmilenio transmilenio = new Transmilenio("Ruta B", 12);
        transmilenio.mostrarRuta();
    }
}
