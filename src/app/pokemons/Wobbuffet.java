package app.pokemons;

import app.attacks.DoubleTeam;
import app.attacks.Facade;
import app.attacks.FocusEnergy;
import app.attacks.Tickle;
import ru.ifmo.se.pokemon.Pokemon;

public class Wobbuffet extends Wynaut {

    public Wobbuffet(String name, int level){
        super(name, level);
        setStats(190.0, 33.0, 58.0, 33.0, 58.0, 33.0);
        addMove(new FocusEnergy());
    }
}
