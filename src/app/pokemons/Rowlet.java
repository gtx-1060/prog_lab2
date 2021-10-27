package app.pokemons;

import app.attacks.DoubleTeam;
import app.attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;

public class Rowlet extends Pokemon {

    public Rowlet(String name, int level){
        super(name, level);
        setStats(68.0, 55.0, 55.0, 50.0, 50.0, 42.0);
        addMove(new DoubleTeam());
        addMove(new Swagger());
    }
}
