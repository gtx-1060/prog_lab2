package app.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AquaTail extends PhysicalMove {

    public AquaTail(){
        super(Type.WATER, 90.0, .9);

    }

    @Override
    protected String describe() {
        return "Атака AquaTail";
    }
}
