package app.attacks;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends SpecialMove {

    public FocusEnergy(){
        super(Type.NORMAL, 0D, 100);
    }

    @Override
    protected String describe() {
        return "Атака Focus Energy";
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        double rowChance = super.calcCriticalHit(pokemon, pokemon1)*2;
        return  Math.min(rowChance, 1D);
    }

}
