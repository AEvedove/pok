/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexanita.MODELO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author USER
 */
public class INOUT {
    
    private static String lerArquivo(File file) {
        StringBuilder retorno = new StringBuilder();

        try {
            Path diretorio = file.toPath();
            BufferedReader bufferedReade = Files.newBufferedReader(diretorio, Charset.defaultCharset());
            String linha = null;

            while (true) {
                linha = bufferedReade.readLine();

                if (linha == null) {
                    break;
                }
                retorno.append(linha);
                retorno.append("\n");
            }

            bufferedReade.close();
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(INOUT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno.toString();
    }

    
    public static void escreverArquivo(String conteudo, String nomeArquivo) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(new File("").getAbsolutePath() + nomeArquivo, true);
            try (BufferedWriter conexao = new BufferedWriter(fw)) {
                conexao.write(conteudo);
                conexao.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(INOUT.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(INOUT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static ArrayList<pokedexanita.MODELO.USUARIO> importarDadosPOKUSUARIO() {
        File arquivo = new File(new File("").getAbsolutePath() + pokedexanita.VISÃO.PRINCIPAL.USUARIO);
        String conteudo = null;
        ArrayList<pokedexanita.MODELO.USUARIO> retorno = new ArrayList();

        int id = 0;
        String nome = null;
        String regiao = null;

        if (arquivo == null) {
            return null;
        }

        conteudo = lerArquivo(arquivo);
        
        String[] linhas = conteudo.split("\n");
        String[] dados = new String[3];

        for (int i = 0; i < linhas.length; i++) {
            id = 0;
            nome = null;
            regiao = null;

            //dados = linhas[i].split(";");
            int index = 0;
            int indexD = 0;

            for (int l = 0; l < linhas[i].length(); l++) {
                if (linhas[i].charAt(l) == ';') {
                    if (index == 0) {
                        dados[indexD] = linhas[i].substring(0, l);
                        indexD++;
                        index = l;
                    } else {
                        dados[indexD] = linhas[i].substring(index + 1, l);
                        indexD++;
                        index = l;
                    }
                }
            }

            try{
                dados[indexD] = linhas[i].substring(index + 1, linhas[i].length());
            }catch(java.lang.StringIndexOutOfBoundsException e){
                e.printStackTrace();
                return null;
            }

            try {
                id = Integer.valueOf(dados[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }

            nome = dados[1];

            regiao = dados[2];

            retorno.add(new pokedexanita.MODELO.USUARIO(id, nome, regiao));
        }
        return retorno;
    }
    
    public static ArrayList<pokedexanita.MODELO.POKEMON> importarDadosPokemon(String nomeArquivo) {
        File arquivo = new File(new File("").getAbsolutePath() + nomeArquivo);
        String conteudo = null;
        ArrayList<pokedexanita.MODELO.POKEMON> retorno = new ArrayList();

        int id = 0;
        String name = null;
        String type1 = null;
        String type2 = null;
        int total = 0;
        int hp = 0;
        int attack = 0;
        int defense = 0;
        int spAtk = 0;
        int spDef = 0;
        int speed = 0;
        int generation = 0;
        boolean legendary = false;
        float height = 0;
        float weight = 0;

        if (arquivo == null) {
            return null;
        }

        conteudo = lerArquivo(arquivo);
        
        if(conteudo == null || arquivo.length() == 0){
            JOptionPane.showMessageDialog(null, "O ARQUIVO \\data\\csv_files\\POKEMONS_DATA_1.csv \nNÃO FOI ENCONTRADO", "", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        String[] linhas = conteudo.split("\n");
        String[] dados = new String[16];

        for (int i = 1; i < linhas.length; i++) {
            id = 0;
            name = null;
            type1 = null;
            type2 = null;
            total = 0;
            hp = 0;
            attack = 0;
            defense = 0;
            spAtk = 0;
            spDef = 0;
            speed = 0;
            generation = 0;
            legendary = false;
            height = 0;
            weight = 0;

            int index = 0;
            int indexD = 0;

            for (int l = 0; l < linhas[i].length(); l++) {
                if (linhas[i].charAt(l) == ',') {
                    if (index == 0) {
                        dados[indexD] = linhas[i].substring(0, l);
                        indexD++;
                        index = l;
                    } else {
                        dados[indexD] = linhas[i].substring(index + 1, l);
                        indexD++;
                        index = l;
                    }
                }
            }

            try{
                dados[indexD] = linhas[i].substring(index + 1, linhas[i].length());
            }catch(java.lang.StringIndexOutOfBoundsException e){
                e.printStackTrace();
                return null;
            }

            try {
                id = Integer.valueOf(dados[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
           
            name = dados[1];

            type1 = dados[2];

            type2 = dados[3];
            
            try {
                total = Integer.valueOf(dados[4]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                hp = Integer.valueOf(dados[5]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                attack = Integer.valueOf(dados[6]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                defense = Integer.valueOf(dados[7]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                spAtk = Integer.valueOf(dados[8]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                spDef = Integer.valueOf(dados[9]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                speed = Integer.valueOf(dados[10]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                generation = Integer.valueOf(dados[11]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            legendary = converter(dados[12]);
           
            try {
                height = Integer.valueOf(dados[13]);
            } catch (Exception e) {
                e.printStackTrace();
            }
           
            try {
                weight = Integer.valueOf(dados[14]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
            retorno.add(new pokedexanita.MODELO.POKEMON(id, name, type1, type2, total, hp, 
                    attack, defense, spAtk, spDef, speed, generation, legendary, height, weight));
        }
        return retorno;
    }
    
    
    public static ArrayList<pokedexanita.MODELO.POKUSUARIO> importarDadosPOKUSUARIO(String nomeArquivo) {
        File arquivo = new File(new File("").getAbsolutePath() + nomeArquivo);
        String conteudo = null;
        ArrayList<pokedexanita.MODELO.POKUSUARIO> retorno = new ArrayList();

        int id = 0;
        int idUsuario = 0;
        String name = null;
        String type1 = null;
        String type2 = null;
        int total = 0;
        int hp = 0;
        int attack = 0;
        int defense = 0;
        int spAtk = 0;
        int spDef = 0;
        int speed = 0;
        int generation = 0;
        boolean legendary = false;
        float height = 0;
        float weight = 0;

        if (arquivo == null) {
            return null;
        }

        conteudo = lerArquivo(arquivo);
        String[] linhas = conteudo.split("\n");
        String[] dados = new String[17];

        for (int i = 0; i < linhas.length; i++) {
            id = 0;
            idUsuario = 0;
            name = null;
            type1 = null;
            type2 = null;
            total = 0;
            hp = 0;
            attack = 0;
            defense = 0;
            spAtk = 0;
            spDef = 0;
            speed = 0;
            generation = 0;
            legendary = false;
            height = 0;
            weight = 0;

            int index = 0;
            int indexD = 0;

            for (int l = 0; l < linhas[i].length(); l++) {
                if (linhas[i].charAt(l) == ',') {
                    if (index == 0) {
                        dados[indexD] = linhas[i].substring(0, l);
                        indexD++;
                        index = l;
                    } else {
                        dados[indexD] = linhas[i].substring(index + 1, l);
                        indexD++;
                        index = l;
                    }
                }
            }

            try{
                dados[indexD] = linhas[i].substring(index + 1, linhas[i].length());
            }catch(java.lang.StringIndexOutOfBoundsException e){
                e.printStackTrace();
                return null;
            }

            try {
                id = Integer.valueOf(dados[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                idUsuario = Integer.valueOf(dados[1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
           
            name = dados[2];
            
            type1 = dados[3];

            type2 = dados[4];
            
            try {
                total = Integer.valueOf(dados[5]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                hp = Integer.valueOf(dados[6]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                attack = Integer.valueOf(dados[7]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                defense = Integer.valueOf(dados[8]);
            } catch (Exception e) {
                e.printStackTrace();
            }
                        
            try {
                spAtk = Integer.valueOf(dados[9]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                spDef = Integer.valueOf(dados[10]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                speed = Integer.valueOf(dados[11]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                generation = Integer.valueOf(dados[12]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
           legendary = converter(dados[13]);
           
           try {
                height = Integer.valueOf(dados[14]);
            } catch (Exception e) {
                e.printStackTrace();
            }
           
           try {
                weight = Integer.valueOf(dados[15]);
            } catch (Exception e) {
                e.printStackTrace();
            }
                        
            retorno.add(new pokedexanita.MODELO.POKUSUARIO(id,idUsuario, name, type1, type2, total, hp, attack, defense,atk, spDef, speed, generation, legendary, height, weight));
        }
        return retorno;
    }
    
    private static boolean converter(String booleana){
        if(booleana.toLowerCase().equals("true")){
            return true;
        }
        
        if(booleana.toLowerCase().equals("false")){
            return false;
        }
        
        return false;
    }
    
    
    public static File selecionarfoto() {
        File diretorio = null;

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setMultiSelectionEnabled(false);

        fileChooser.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG", "PNG");

        fileChooser.addChoosableFileFilter(filter);

        fileChooser.setDialogTitle("Selecione a Foto");

        fileChooser.showDialog(null, "Selecionar");

        diretorio = fileChooser.getSelectedFile();

        return diretorio;
    }

    public static ArrayList<USUARIO> importarDadosUSUARIO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<POKUSUARIO> importarDadosPOKUSUARIO(String POKUSUARIO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<POKUSUARIO> importarDadosPOKUSUARIO(String USUARIO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

