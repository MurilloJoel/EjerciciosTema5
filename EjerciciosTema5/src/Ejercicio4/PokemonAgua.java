package Ejercicio4;

/**
 *
 * @author joel
 */
public class PokemonAgua extends Pokemon {

    //Constructor
    public PokemonAgua(String nombre, double hp, double at) {
        super(nombre, hp, at);
    }

    //Metodo estaMuerto
    @Override
    public boolean estaMuerto() {
        if (hp > 0) {
            return false;
        } else {
            return true;
        }
    }

    //Metodo atacarPokemon
    @Override
    public void atacarPokemon(Pokemon p) {
        String nombreP= p.getClass().getSimpleName();
        switch (nombreP){
            case "PokemonFuego":
                p.setHp((p.getHp()- (this.getAt()*2)));
                break;
            case "PokemonAgua":
            case "PokemonPlanta":
                p.setHp((p.getHp()- (this.getAt()/2)));
                break;
            case "Pokemon":
                super.atacarPokemon(p);
        }

    }

    //Metodo ToString
    @Override
    public String toString() {
        return super.toString();
    }
}
