package app.pokemons;

import app.attacks.DoubleTeam;
import app.attacks.Facade;
import app.attacks.Tickle;
import ru.ifmo.se.pokemon.Pokemon;

public class Wynaut extends Pokemon {

    public Wynaut(String name, int level){
        super(name, level);
        setStats(95.0, 23.0, 48.0, 23.0, 48.0, 23.0);
        addMove(new Facade());
        addMove(new Tickle());
        addMove(new DoubleTeam());
    }
}
