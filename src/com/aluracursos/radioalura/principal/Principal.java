package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcats;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();

        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcats miPodcats = new Podcats();

        miPodcats.setPresentador("Gabriela Aguiar");
        miPodcats.setTitulo("Cafe.Tech");

        //CANCION
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }
        //POTCAST
        for (int i = 0; i < 100; i++) {
            miPodcats.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcats.reproducir();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproduccion());
        System.out.println("Total de reproducciones" + miCancion.getMeGusta());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adiciona(miPodcats);
        misFavoritos.adiciona(miCancion);

    }
}
