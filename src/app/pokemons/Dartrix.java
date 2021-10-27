package app.pokemons;

import app.attacks.AirSlash;
import app.attacks.DoubleTeam;
import app.attacks.Swagger;
import com.sun.rowset.internal.Row;
import ru.ifmo.se.pokemon.Pokemon;

public class Dartrix extends Rowlet {

    public Dartrix(String name, int level){
        super(name, level);
        setStats(78.0, 75.0, 75.0, 70.0, 70.0, 52.0);
        addMove(new AirSlash());
    }
}
