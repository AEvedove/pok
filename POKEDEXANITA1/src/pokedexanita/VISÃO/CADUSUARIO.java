/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexanita.VISÃO;

import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Attribute.DATA;
import pokedexanita.MODELO.USUARIO;

/**
 *
 * @author USER
 */
public class CADUSUARIO extends javax.swing.JDialog {

    private final String CABECALHO_USUARIOS[] = {"ID","NOME","REGIÃO"};
    private final String CABECALHO_POKEMONS[] = {"ID","NOME","TIPO 1","TIPO 2"};
    
    private int ultimoIdUsuario;
    
    ArrayList<pokedexanita.MODELO.USUARIO> usuario = new ArrayList();
    ArrayList<pokedexanita.MODELO.POKUSUARIO> pokemons;
    ArrayList<pokedexanita.MODELO.POKUSUARIO> pokemonsDeUsuario;
    
    ArrayList<pokedexanita.MODELO.USUARIO> usuarioFiltrados = new ArrayList();
    ArrayList<pokedexanita.MODELO.POKUSUARIO> pokemonsFiltrados = new ArrayList();
    
    ArrayList<pokedexanita.MODELO.POKUSUARIO> pokemonsInTabela = new ArrayList();
    
    private java.awt.Frame parent;
    private Object data;
    
    public CADUSUARIO (java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        
        this.parent = parent;
        this.pokemons = pokedexanita.MODELO.INOUT.importarDadosPOKUSUARIO(pokedexanita.VISÃO.PRINCIPAL.USUARIO);
        
        atualizarDados();
        setLocationRelativeTo(null);
    }
  
    private void atualizarDados(){
        this.usuario = pokedexanita.MODELO.INOUT.importarDadosUSUARIO();
        this.usuarioFiltrados = this.usuario;
        this.pokemonsDeUsuario = pokedexanita.MODELO.INOUT.importarDadosPOKUSUARIO(pokedexanita.VISÃO.PRINCIPAL.POKUSUARIO);
        
        if(this.usuario != null){
            if(this.usuario.size() > 0){
                this.ultimoIdUsuario = this.usuario.get(this.usuario.size() - 1).getId();
            }
        }
        
        
        atualizarTabelaUsuario(this.usuario);
    }
    
    private void atualizarTabelaPokemon(ArrayList<pokedexanita.MODELO.POKUSUARIO> array) {
        if (array != null) {
            String[][] retorno = new String[array.size()][4];

            for (int i = 0; i < array.size(); i++) {
                retorno[i][0] = "" + array.get(i).getId();
                retorno[i][1] = "" + array.get(i).getName();
                retorno[i][2] = "" + array.get(i).getType1();
                retorno[i][3] = "" + array.get(i).getType2();
            }

            jTableCadPok.setModel(new javax.swing.table.DefaultTableModel(retorno, this.CABECALHO_POKEMONS));

            
        }
    }
    
    private void selecionarPokemon(){
        int colunaTabela = jTableCadPok.getSelectedRow();

        if (colunaTabela != -1) {
            new pokedexanita.VISÃO.DETPOKEMON(this.parent, this.pokemonsFiltrados.get(colunaTabela)).exibir();
        }          
    }
    
    private void pesquisarUsuario(String conteudoPesquisa) {
        ArrayList<pokedexanita.MODELO.USUARIO> retorno = new ArrayList();

        for (int i = 0; i < this.usuario.size(); i++) {

            try {
                if (String.valueOf(this.usuario.get(i).getNome()).toLowerCase().substring(0, conteudoPesquisa.length()).equals(conteudoPesquisa.toLowerCase())) {
                    retorno.add(this.usuario.get(i));
                    continue;
                }
            } catch (Exception e) {e.printStackTrace();
            }
        }

        this.usuarioFiltrados = retorno;
        atualizarTabelaUsuario(retorno);

    }
    
    private void pesquisarPokemons(String conteudoPesquisa) {
        ArrayList<pokedexanita.MODELO.POKUSUARIO> retorno = new ArrayList();

        for (int i = 0; i < this.pokemonsInTabela.size(); i++) {

            try {
                if (String.valueOf(this.pokemonsInTabela.get(i).getName()).toLowerCase().substring(0, conteudoPesquisa.length()).equals(conteudoPesquisa.toLowerCase())) {
                    retorno.add(this.pokemonsInTabela.get(i));
                    continue;
                }
            } catch (Exception e) {
            }
        }

        this.pokemonsFiltrados = retorno;
        atualizarTabelaPokemon(retorno);

    }
    
    private void filtrarPokemons() {
        if (jComboBoxTipo.getSelectedIndex() != 0) {

            ArrayList<pokedexanita.MODELO.POKUSUARIO> retorno = new ArrayList();

            for (int i = 0; i < this.pokemons.size(); i++) {
                   if(this.pokemons.get(i).getType1().equals((String) jComboBoxTipo.getSelectedItem())){
                       retorno.add(this.pokemons.get(i));
                       continue;
                   }
                   
                   if(this.pokemons.get(i).getType2().equals((String) jComboBoxTipo.getSelectedItem())){
                       retorno.add(this.pokemons.get(i));
                       continue;
                   }
            }

            this.pokemonsFiltrados = retorno;
            atualizarTabelaPokemon(retorno);
        }else{
            this.pokemonsFiltrados = this.pokemonsInTabela;
            atualizarTabelaPokemon(this.pokemonsFiltrados);
        }
    }

    public void exibir(){
        setVisible(true);
    }
    
 
    /**
     * Creates new form CADUSUARIO
     */
    public CADUSUARIO(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        buttonAdd = new java.awt.Button();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadPok = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jFormattedTextFieldHora = new javax.swing.JFormattedTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jFormattedTextFieldDataHora = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE POKEMONS");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("USUÁRIO");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("POKEMON");

        textField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textField1.setText("textField1");

        buttonAdd.setBackground(new java.awt.Color(255, 255, 51));
        buttonAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonAdd.setLabel("ADICIONAR");

        jComboBoxTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTableCadPok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jTableCadPok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCadPok);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/x_1.png"))); // NOI18N
        jButton1.setText("CANCELAR");

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        jButton2.setText("SALVAR");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldHoraActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("DATA:");

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("HORA:");

        try {
            jFormattedTextFieldDataHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldDataHora)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataActionPerformed
        // TODO add your handling code here:
        data = this.data.toString().split(" ")[0];
    }
        
    }//GEN-LAST:event_jFormattedTextFieldDataActionPerformed

    private void jFormattedTextFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraActionPerformed
        // TODO add your handling code here:
        hora = this.hora.toString().split(" ")[1];
        
            
    }//GEN-LAST:event_jFormattedTextFieldHoraActionPerformed

    private void jFormattedTextFieldDataHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataHoraActionPerformed
        // TODO add your handling code here:
        data = this.data.toString().split(" ")[0];
        hora = this.data.toString().split(" ")[1];
        
        data = data.split("-")[2]+"/"+dataS.split("-")[1]+"/"+(Integer.parseInt(dataS.split("-")[0])-2000);
        hora = hora.split(":")[0]+":"+horaS.split(":")[1];
        return data+" "+hora;
    }//GEN-LAST:event_jFormattedTextFieldDataHoraActionPerformed

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
            java.util.logging.Logger.getLogger(CADUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CADUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CADUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CADUSUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CADUSUARIO dialog = new CADUSUARIO(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataHora;
    private javax.swing.JFormattedTextField jFormattedTextFieldHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadPok;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabelaUsuario(ArrayList<USUARIO> usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class data {

    private Timestamp data;
    public static final String BarraSemHora="dd/MM/yyyy";
    public static final String BarraComHora="dd/MM/yyyy hh:mm";
    public static final String HifenSemHora="yyyy-MM-dd";
    public static final String HifenComHora="yyyy-MM-dd hh:mm:ss";

    public CADUSUARIO() {
        Timestamp timestamp = null;  
        try { 
            Timestamp agora = new Timestamp(System.currentTimeMillis());
            SimpleDateFormat formatoData = new SimpleDateFormat(HifenComHora);
            Calendar c = Calendar.getInstance();  
            c.setTime(formatoData.parse(agora.toString()));  
            timestamp = new Timestamp(c.getTimeInMillis());  
        } catch (Exception e) { 
            System.err.println(e.getMessage());
        }
        this.data = timestamp;
    }
    
    public DATAHORACAP(Timestamp Data) {
        this.data = Data;
    }
    
    public DATAHORACAP(String Data,String Format) {
        if(Format.isEmpty())
            Format=BarraComHora;
        
        //if(Format.equals(BarraSemHora) || Format.equals(HifenSemHora))
            //Data+=" 00:00:00";
        
        Timestamp timestamp = null;
        try {  
            SimpleDateFormat formatoData = new SimpleDateFormat(Format);  
            Calendar c = Calendar.getInstance();  
            c.setTime(formatoData.parse(Data));  
            timestamp = new Timestamp(c.getTimeInMillis());  
        } catch (ParseException e) { 
            System.err.println(e.getMessage());
        }  
        this.data = timestamp;
    }
       
    public Timestamp getTimestamp() {
        return data;
    }
    
    public int getDia(){
        return Integer.parseInt(this.data.toString().split(" ")[0].split("-")[2]);
    }
    public String getDiaString(){
        return this.data.toString().split(" ")[0].split("-")[2];
    }
    
    public int getMes(){
        return Integer.parseInt(this.data.toString().split(" ")[0].split("-")[1]);
    }
    
    public String getMesNome(){
        String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        return meses[this.getMes()-1];
    }
    
    public String getMesString(){
        return this.data.toString().split(" ")[0].split("-")[1];
    }
    
    public int getAno(){
        return Integer.parseInt(this.data.toString().split(" ")[0].split("-")[0]);
    }
    
    public void AddMes(int mes){
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
	cal.add(Calendar.MONTH, mes);
        
        data = new Timestamp(cal.getTimeInMillis()); 
    }
    
    public static int getUltimoDiaMes(String mes,String ano){
        data D = new data("01/"+mes+"/"+ano,DATA.BarraSemHora);
        
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime( D.getTimestamp() );
        int dia = cal.getActualMaximum( Calendar.DAY_OF_MONTH );
        return dia;
    }
    
}

        
