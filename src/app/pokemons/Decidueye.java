package app.pokemons;

import app.attacks.AirSlash;
import app.attacks.Confide;
import app.attacks.DoubleTeam;
import app.attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;

public class Decidueye extends Dartrix {

    public Decidueye(String name, int level){
        super(name, level);
        setStats(78.0, 107.0, 75.0, 100.0, 100.0, 70.0);
        addMove(new Confide());
    }
}
