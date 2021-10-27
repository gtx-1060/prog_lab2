package app.attacks;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {

    public AquaRing(){
        super(Type.WATER, 0D, 1D);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        double restoredHP = pokemon.getHP() + (pokemon.getStat(Stat.HP) / 16.0);
        pokemon.addEffect(new Effect().turns(-1).stat(Stat.HP, (int)restoredHP));
    }

    @Override
    protected String describe() {
        return "Атака Aqua Ring";
    }
}
