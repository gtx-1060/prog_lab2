package app.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {

    public Facade(){
        super(Type.NORMAL, .7, 1D);
    }

    @Override
    protected String describe() {
        return "Атака Facade";
    }
}
