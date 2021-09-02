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
public class USUARIO {
    
    private int id;
    private String nome;
    private String regiao;

    USUARIO(int id, String nome, String regiao) {
        this.id = id;
        this.nome = nome;
        this.regiao = regiao;
    }
    USUARIO() {   
	this.id = 1;
        this.nome = "Anita";
	this.regiao = "Unova";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }
}
    

