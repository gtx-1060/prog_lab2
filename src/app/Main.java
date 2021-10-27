package app;

import app.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

// вариант 3116908

public class Main {

    public static void main(String[] args){
        Battle b = new Battle();
        Dartrix p1 = new Dartrix("dartrix", 1);
        Decidueye p2 = new Decidueye("decidueye", 1);
        Rowlet p3 = new Rowlet("rowlet", 1);
        Suicune p4 = new Suicune("suicune", 1);
        Wobbuffet p5 = new Wobbuffet("wobbuffet", 1);
        Wynaut p6 = new Wynaut("wynaut", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }



}
