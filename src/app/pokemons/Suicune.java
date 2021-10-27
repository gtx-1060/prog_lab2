package app.pokemons;

import app.attacks.AquaRing;
import app.attacks.AquaTail;
import app.attacks.Facade;
import app.attacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;

public class Suicune extends Pokemon {

    public Suicune(String name, int level){
        super(name, level);
        setStats(100.0, 75.0, 115.0, 90.0, 115.0, 85.0);
        addMove(new AquaTail());
        addMove(new AquaRing());
        addMove(new Facade());
        addMove(new Swagger());
    }

}
