package app.attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class AirSlash extends StatusMove {

    public AirSlash(){
        super(Type.FLYING, 75, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if ((new Effect()).chance(0.3).success()){
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Атака AirSlash";
    }
}
