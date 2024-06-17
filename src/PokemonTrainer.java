import java.util.List;

public class PokemonTrainer {
    String name;
    Pokemon pokemon;

    public PokemonTrainer(String userA, List<Pokemon> pokemons) {
        this.name = userA;
        this.pokemon = pokemons.get(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getPokemons() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
