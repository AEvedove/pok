/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexanita.MODELO;

/**
 *
 * @author USER
 */
public class POKUSUARIO extends POKEMON { 
    private int idUsuario;

    public POKUSUARIO(int id, int idUsuario, String name, String type1, String type2, 
                              int total, int hp, int attack, int defense, int spAtk, int spDef, 
                              int speed, int generation, boolean legendary, float height, float weight) {
        
        super(id, name, type1, type2, total, hp, attack, defense, spAtk, 
              spDef, speed, generation, legendary, height, weight);
        
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}

