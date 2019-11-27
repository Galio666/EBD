/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ContenidoFact;
import controllers.ContenidoFactBD;
import controllers.Historial;
import controllers.HistorialDB;
import controllers.HitsTable;
import controllers.JdbConection;
import controllers.Pelicula;
import controllers.PeliculasDB;
import controllers.PeliculasTabla;
import controllers.RecomendacionesBD;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.json.JSONObject;

/**
 *
 * @author Tomas
 */
public class PeliculaInfo extends javax.swing.JFrame {

    HitsTable modelo;
    HistorialDB peli;
    ArrayList<Historial> lista;
    JdbConection conexion;
    
    PeliculasTabla modelo1;
    RecomendacionesBD recomen;
    ArrayList<Pelicula> lista2;
  /*
     * Creates new form PeliculaInfo
     */
    public PeliculaInfo() {
        initComponents();
        conexion =new JdbConection();
        peli =new HistorialDB();
        lista= peli.GetCuenta();
        
        HitsTable modelo =new HitsTable(lista);        
        jTable1.setModel(modelo);
        
        
        
    }
    
    public static void visualizarImg(){
        
        /*Image imagen = null;
        try {
            //Inicializar y asignar url de la imagen a mostrar
            URL url = new URL("https://www.imdb.com/title/tt5171438/mediaviewer/rm1597339392");
            //Asignacion de url a la imagen
            imagen = ImageIO.read(url);
               } catch (IOException e) {
                                      e.printStackTrace();
                                                                 }
         //Mostrar imagen
        JFrame marco = new JFrame();
        marco.setSize(500, 500);
        JLabel label = new JLabel(new ImageIcon(imagen));
        marco.add(label);
        marco.setVisible(true);
    
    */
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlot = new javax.swing.JEditorPane();
        lblPlot = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblrating = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblduracion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblActors = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtRecomen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Titulo");

        jLabel2.setText("Plot");

        jScrollPane1.setViewportView(txtPlot);

        lblPlot.setBackground(new java.awt.Color(204, 204, 204));

        lblID.setText("jLabel4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setText("Clasificacion");

        lblClasificacion.setText("NA");

        lbl2.setText("Rating");

        lblrating.setText("jLabel4");

        jLabel4.setText("Duracion");

        lblduracion.setText("NA");

        jLabel5.setText("Actores");

        lblActors.setText("NA");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel6.setText("Genero");

        lblGenero.setText("jLabel7");

        jButton1.setText("Ver Recomendaciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlot, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbl2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblrating)
                            .addComponent(lblClasificacion)
                            .addComponent(lblduracion)
                            .addComponent(lblActors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtRecomen))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(324, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblPlot, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblClasificacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2)
                            .addComponent(lblrating))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblduracion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblActors)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblGenero)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtRecomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
         if (evt.getClickCount()==1)
                    
        {
            int index = jTable1.getSelectedRow();
            final Historial tall = lista.get(index);
            lblID.setText(tall.getId_pelicula());
             try {
        VerPerfil(lblID.getText());
        } catch (Exception ex) {
            Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        recomen=new RecomendacionesBD();
        lista2=recomen.GetGenero(txtRecomen.getText());
        PeliculasTabla modelo1=new PeliculasTabla(lista2);
        jTable2.setModel(modelo1);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
     public static String getText(String url) throws Exception {
            URL website = new URL(url);
            URLConnection connection = website.openConnection();
            BufferedReader in = new BufferedReader( new InputStreamReader(connection.getInputStream(),"UTF8"));

            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) 
                response.append(inputLine);

            in.close();

            return response.toString();
        }

    
    
     public void VerPerfil(String id) throws Exception
    {
     
       
        
        JSONObject jsonArray=new JSONObject(getText("http://www.omdbapi.com/?i="+id+"&apikey=d9046656")); 
          
        String poster=(String)jsonArray.get("Poster");
        String plot=(String)jsonArray.get("Plot");
        String rating= (String)jsonArray.get("imdbRating");
        String title= (String)jsonArray.get("Title");
        String clasificacion= (String)jsonArray.get("Rated");
        String duracion=(String)jsonArray.get("Runtime");
        String actors=(String)jsonArray.get("Actors");
        String genero=(String)jsonArray.get("Genre");
       // System.out.println(poster);
        //System.out.println(plot);
      
       Image imagen = null;
       ImageIcon imagenIcon=null;
        try {
            //Inicializar y asignar url de la imagen a mostrar
            URL url = new URL(poster);
            //Asignacion de url a la imagen
            imagen = ImageIO.read(url).getScaledInstance(125,165, 0);
            imagenIcon=new ImageIcon(imagen);
            
               } catch (IOException e) {
                                      e.printStackTrace();
                                                                 }
         //Mostrar imagen
        
        lblPlot.setIcon(imagenIcon);
        txtTitulo.setText(title);
        txtPlot.setText(plot);
        lblClasificacion.setText(clasificacion);
        lblrating.setText(rating);
        lblduracion.setText(duracion);
        lblActors.setText(actors);
        lblGenero.setText(genero);
        txtRecomen.setText(genero);
            

    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(PeliculaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeliculaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeliculaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeliculaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeliculaInfo().setVisible(true);
                visualizarImg();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblActors;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPlot;
    private javax.swing.JLabel lblduracion;
    private javax.swing.JLabel lblrating;
    private javax.swing.JEditorPane txtPlot;
    private javax.swing.JTextField txtRecomen;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
