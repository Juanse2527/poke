package com.tamayo.pokemon;

import com.tamayo.pokemon.models.pokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET ("pokemon")
    Call<pokemonResponse> obtenerListaPokemon();
}
