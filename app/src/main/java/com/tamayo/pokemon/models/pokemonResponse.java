package com.tamayo.pokemon.models;

import java.util.ArrayList;

public class pokemonResponse {
    private ArrayList<Pokemon> resultados;

    public ArrayList<Pokemon> getresults(){
        return resultados;
    }

    public void getResults(ArrayList<Pokemon> results){
        this.resultados = results;
    }
}
