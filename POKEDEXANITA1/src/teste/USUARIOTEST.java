/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import pokedexanita.VISÃO.USUARIO;

/**
 *
 * @author USER
 */
public class USUARIOTEST {
    
    	public void USUARIOTEST()
	{
		USUARIO usuario = new USUARIO();
		
                assertEquals(usuario.getId(), 1);
		assertEquals(usuario.getNome(), "Anita");
		assertEquals(usuario.getRegiao(), "Unova");
		
	}
       	public void testGetId(){
		int id = 1;
		USUARIO usuario = new USUARIO(id, "Anita", "Unova");
		assertEquals(usuario.getId(), id);
	}
        
	public void testGetNome(){
		String nome = "Anita";
		USUARIO usuario = new USUARIO(1, nome, "Unova");
		assertEquals(usuario.getNome(), nome);
	}

	public void testGetRegiao(){
		String regiao = "Unova";
		USUARIO usuario = new USUARIO(1, "Anita", regiao);
		assertEquals(usuario.getRegiao(), regiao);
	}
}


    
