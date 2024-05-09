package com.nuevoejemplo.demo;


import com.nuevoejemplo.demo.models.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    Pokemon [] pokemons = {new Pokemon("Bulbasaur", "Planta", 15),
            new Pokemon("Charmander", "Fuego", 16),
            new Pokemon("Squirtle", "Agua", 14),
            new Pokemon("Pikachu", "Eléctrico", 25)
    };

    @GetMapping("/")
    public Pokemon[] getPokemones() {
        return pokemons;
    }

    @GetMapping("/bulbasaur")
    public Pokemon getBulbasaur() {
        return pokemons[0];
    }

    @GetMapping("/charmander")
    public Pokemon getCharmander() {
        return pokemons[1];
    }

    @GetMapping("/squirtle")
    public Pokemon getSquirtle() {
        return pokemons[2];
    }
    @GetMapping("/pikachu")
    public Pokemon getPikachu() {
        return pokemons[3];
    }
}
