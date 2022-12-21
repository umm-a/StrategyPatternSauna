package Sauna;

import Sauna.Fragrances.Fragrance;
import Sauna.Lights.Lights;
import Sauna.Steam.Steam;

public class Sauna {
    protected Fragrance fragrance;
    protected Lights lights;
    protected Steam steam;

    Sauna(Fragrance fragrance, Lights lights, Steam steam){
        this.fragrance = fragrance;
        this.lights = lights;
        this.steam = steam;
    }
}
