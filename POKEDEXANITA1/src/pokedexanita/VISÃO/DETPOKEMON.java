/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexanita.VISÃO;

import java.io.File;

/**
 *
 * @author USER
 */
public class DETPOKEMON extends javax.swing.JDialog {
    
    private pokedexanita.MODELO.POKEMON pokemon;
    private boolean retorno;
   
    public DETPOKEMON(java.awt.Frame parent, pokedexanita.MODELO.POKEMON pokemon) {
        super(parent, true);
        initComponents();
        
        this.pokemon = pokemon;
        preencher(this.pokemon);
        
        setLocationRelativeTo(null);
    }
    
    private void preencher(pokedexanita.MODELO.POKEMON pokemon){
        this.setTitle("" + pokemon.getName());
        
        jLabelAtaque.setText("" + pokemon.getAttack());
        jLabelAtk.setText("" + pokemon.getAtk());
        jLabelGeration.setText("" + pokemon.getGeneration());
        jLabelHp.setText("" + pokemon.getHp());
        //jLabelLeg.setText("" + pokemon.isLegendary());
        jLabelName.setText("" + pokemon.getName());
        jLabelSpDefesa.setText("" + pokemon.getDefense());
        jLabelSpeed.setText("" + pokemon.getSpeed());
        jLabelT1.setText("" + pokemon.getType1());
        jLabelT2.setText("" + pokemon.getType2());
        jLabelTotal.setText("" + pokemon.getTotal());
        jLabelDefesa.setText("" + pokemon.getDefense());
        jLabelHeight.setText("" + (pokemon.getHeight()/10) + " M");
        jLabelWeight.setText("" + (pokemon.getWeight()/10) + " KG");
        
        jProgressBarSAtk.setValue( pokemon.getAttack());
        jProgressBarAtaque.setValue( pokemon.getAtk());
        jProgressBarDef.setValue( pokemon.getDefense());
        jProgressBarSdef.setValue( pokemon.getSpDef());
        jProgressBarSpeed.setValue( pokemon.getSpeed());
        jProgressBarHp.setValue( pokemon.getHp());
        
        icones image = new javax.swing.ImageIcon(new File("").getAbsolutePath() + pokedexanita.VISAO.PRINCIPAL.IMAGENS + "/" + pokemon.getName().toLowerCase().replace(" ", "-") + ".png");
        jLabelPokeImage.setIcon(image);
        
        if(pokemon.isLegendary() == true)
            jLabel14.setText("LEGENDARY");
        else{
            jLabel14.setText("NORMAL");
        }
           
    }
    
    public boolean exibir(){
        setVisible(true);
        
        return retorno;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelGeration = new javax.swing.JLabel();
        jLabelAtk = new javax.swing.JLabel();
        jLabelT1 = new javax.swing.JLabel();
        jLabelT2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelAtk = new javax.swing.JLabel();
        jProgressBarDef = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        jLabelSpDefesa = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jProgressBarSAtk = new javax.swing.JProgressBar();
        jProgressBarSdef = new javax.swing.JProgressBar();
        jLabel16 = new javax.swing.JLabel();
        jLabelSpeed = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelAtaque = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelPokeImage = new javax.swing.JLabel();
        jLabelSpDefesa = new javax.swing.JLabel();
        jLabelHp = new javax.swing.JLabel();
        jProgressBarHp = new javax.swing.JProgressBar();
        jLabelTotal = new javax.swing.JLabel();
        jLabelAtaque = new javax.swing.JLabel();
        jProgressBarAtaque = new javax.swing.JProgressBar();
        jLabelHeight = new javax.swing.JLabel();
        jLabelDefesa = new javax.swing.JLabel();
        jProgressBarSpeed = new javax.swing.JProgressBar();
        jLabelGeration = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelHeight = new javax.swing.JLabel();
        jLabelWeight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setText("NAME");
        jLabelName.setToolTipText("");

        jLabel3.setText("TYPE 1:");

        jLabelGeration.setText("TYPE 2:");

        jLabelAtk.setText("LEGENDARY:");

        jLabelT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelT2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelAtk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jProgressBarDef.setForeground(new java.awt.Color(255, 102, 102));
        jProgressBarDef.setMaximum(200);

        jLabel14.setText("S. ATK:");

        jLabelSpDefesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSpDefesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("S. DEF:");

        jProgressBarSAtk.setForeground(new java.awt.Color(204, 0, 204));
        jProgressBarSAtk.setMaximum(200);

        jProgressBarSdef.setForeground(new java.awt.Color(102, 102, 0));
        jProgressBarSdef.setMaximum(200);

        jLabel16.setText("SPEED:");

        jLabelSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSpeed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setText("GENERATION:");

        jLabel18.setText("TOTAL:");

        jLabelAtaque.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelAtaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtaque.setText("IMAGE");

        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelPokeImage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPokeImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPokeImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPokeImage.setOpaque(true);

        jLabelSpDefesa.setText("HP:");

        jLabelHp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jProgressBarHp.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBarHp.setMaximum(200);

        jLabelTotal.setText("ATK:");

        jLabelAtaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAtaque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jProgressBarAtaque.setForeground(new java.awt.Color(255, 51, 102));
        jProgressBarAtaque.setMaximum(200);

        jLabelHeight.setText("DEF:");

        jLabelDefesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDefesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jProgressBarSpeed.setForeground(new java.awt.Color(153, 255, 255));
        jProgressBarSpeed.setMaximum(200);

        jLabelGeration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGeration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setText("HEIGHT:");

        jLabel20.setText("WEIGHT:");


 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jProgressBarSdef = new javax.swing.JProgressBar();
        jProgressBarSAtk = new javax.swing.JProgressBar();
        jProgressBarSpeed = new javax.swing.JProgressBar();
        jProgressBarDef = new javax.swing.JProgressBar();
        jProgressBarAtaque = new javax.swing.JProgressBar();
        jLabelT1 = new javax.swing.JLabel();
        jLabelT2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelGeration = new javax.swing.JLabel();
        jLabelHp = new javax.swing.JLabel();
        jLabelAtaque = new javax.swing.JLabel();
        jLabelDefesa = new javax.swing.JLabel();
        jLabelAtk = new javax.swing.JLabel();
        jLabelSpDefesa = new javax.swing.JLabel();
        jLabelSpeed = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelHeight = new javax.swing.JLabel();
        jLabelWeight = new java.awt.Label();
        jLabelPokeImagem = new java.awt.Label();
        jProgressBarHp = new javax.swing.JProgressBar();
        jLabelName = new java.awt.Label();
        jLabel14 = new java.awt.Label();
        jLabel15 = new java.awt.Label();
        jLabel16 = new java.awt.Label();
        jLabel17 = new java.awt.Label();
        jLabel18 = new java.awt.Label();
        jLapelPok = new java.awt.Label();
        jLabel19 = new java.awt.Label();
        jLabel20 = new java.awt.Label();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelT1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelT1.setText("TYPE 1");

        jLabelT2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelT2.setText("TYPE 2");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("LEGENDARY:");

        jLabelGeration.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelGeration.setText("GENERATION:");

        jLabelHp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelHp.setText("HP:");

        jLabelAtaque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAtaque.setText("ATK:");

        jLabelDefesa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelDefesa.setText("DEF:");

        jLabelAtk.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAtk.setText("S.ATK:");

        jLabelSpDefesa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSpDefesa.setText("S.DEF:");

        jLabelSpeed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSpeed.setText("SPEED:");

        jLabelTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTotal.setText("TOTAL:");

        jLabelHeight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelHeight.setText("HEIGHT:");

        jLabelWeight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelWeight.setText("WEIGHT:");

        jLabelPokeImagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPokeImagem.setText("IMAGE");

        jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelName.setText("NOME");

        jLabel14.setText("label1");

        jLabel15.setText("label1");

        jLabel16.setText("label1");

        jLabel17.setText("label1");

        jLabel18.setText("label1");

        jLapelPok.setText("label1");

        jLabel19.setText("label1");

        jLabel20.setText("label1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAtk)
                            .addComponent(jLabelDefesa))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelHeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelHp)
                                    .addComponent(jLabelGeration, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelSpeed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelSpDefesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAtaque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBarSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarSdef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarSAtk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarDef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPokeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLapelPok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPokeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelT2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(16, 16, 16)
                                .addComponent(jLabelGeration))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelHp)
                            .addComponent(jProgressBarHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBarAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jProgressBarDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jProgressBarSAtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLapelPok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jProgressBarSdef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jProgressBarSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelAtaque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDefesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelAtk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelSpDefesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelSpeed)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotal)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHeight)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DETPOKEMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DETPOKEMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DETPOKEMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DETPOKEMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DETPOKEMON().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private java.awt.Label jLabel14;
    private java.awt.Label jLabel15;
    private java.awt.Label jLabel16;
    private java.awt.Label jLabel17;
    private java.awt.Label jLabel18;
    private java.awt.Label jLabel19;
    private java.awt.Label jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAtaque;
    private javax.swing.JLabel jLabelAtk;
    private javax.swing.JLabel jLabelDefesa;
    private javax.swing.JLabel jLabelGeration;
    private javax.swing.JLabel jLabelHeight;
    private javax.swing.JLabel jLabelHp;
    private java.awt.Label jLabelName;
    private java.awt.Label jLabelPokeImagem;
    private javax.swing.JLabel jLabelSpDefesa;
    private javax.swing.JLabel jLabelSpeed;
    private javax.swing.JLabel jLabelT1;
    private javax.swing.JLabel jLabelT2;
    private javax.swing.JLabel jLabelTotal;
    private java.awt.Label jLabelWeight;
    private java.awt.Label jLapelPok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBarAtaque;
    private javax.swing.JProgressBar jProgressBarDef;
    private javax.swing.JProgressBar jProgressBarHp;
    private javax.swing.JProgressBar jProgressBarSAtk;
    private javax.swing.JProgressBar jProgressBarSdef;
    private javax.swing.JProgressBar jProgressBarSpeed;
    // End of variables declaration//GEN-END:variables
}
