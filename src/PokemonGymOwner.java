import java.util.List;

public class PokemonGymOwner {
    String name;

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    Pokemon pokemon;


    public PokemonGymOwner(String brock, String pewterCity, List<Pokemon> pokemons) {
        this.name = brock;
        this.town = pewterCity;
        this.pokemon = pokemons.get(0);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    String town;


    public Pokemon[] getPokemons() {

    }
}
