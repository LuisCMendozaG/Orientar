
package proyectoorientar;

import Conexion.Conexion;
import java.io.IOException;
import proyectoorientar.clasesDesechadas.CrearPiezas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.json.simple.parser.ParseException;
import proyectoorientar.tipoPiezas;
/**
 *
 * @author luis_
 */
public class Menu extends javax.swing.JFrame {
public static final String ANSI_RED = "\u001B[31m"; 
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_BLUE = "\u001B[34m";
List<tipoPiezas> listaPiezas = new ArrayList<>();
tipoPiezas tp;
Log log = new Log();
JFreeChart grafica;
manejarPiezas manejar = new manejarPiezas();
DefaultCategoryDataset Datos = new DefaultCategoryDataset();

    public Menu() {
        initComponents();
        CrearPiezas cp = new CrearPiezas();
        crearListaPiezas();
        log.setVisible(true);
        agregarDatos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnGenerarPieza = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombrePieza = new javax.swing.JTextField();
        txtOrientacionX = new javax.swing.JTextField();
        txtOrientacionY = new javax.swing.JTextField();
        txtOrientacionZ = new javax.swing.JTextField();
        btnGuardarPieza = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtVueltas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTipoEmbalaje = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnConectar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPuerto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerarPieza.setText("Generar Pieza");
        btnGenerarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPiezaActionPerformed(evt);
            }
        });

        jLabel2.setText("Crear nueva pieza");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Orientacion:                  0-180");

        jLabel5.setText("X:");

        jLabel6.setText("Y:");

        jLabel7.setText("Z:");

        txtNombrePieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePiezaActionPerformed(evt);
            }
        });

        btnGuardarPieza.setText("Guardar");
        btnGuardarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPiezaActionPerformed(evt);
            }
        });

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jLabel9.setText("Vueltas:");

        jLabel11.setText("Embalaje:");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGuardarPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombrePieza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrientacionX, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtOrientacionZ, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtOrientacionY, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtVueltas)
                            .addComponent(txtTipoEmbalaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGenerarPieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrePieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtOrientacionX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrientacionY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrientacionZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnGenerarPieza)
                        .addGap(43, 43, 43)
                        .addComponent(btnGraficar)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTipoEmbalaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtVueltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarPieza)
                        .addGap(46, 46, 46))))
        );

        jTabbedPane1.addTab("Crear Piezas", jPanel1);

        jLabel1.setText("Direccion ip: ");

        txtIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpActionPerformed(evt);
            }
        });

        jLabel8.setText("Conexion magica");

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jLabel10.setText("Puerto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnConectar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIp, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtPuerto))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnConectar)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Conexion", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        //Crea el panel y le asigna la grafica
        
        ChartPanel PanelGraficar = new ChartPanel(grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        agregarDatos();
        //le añade la grafica y la abre
        Ventana.getContentPane().add(PanelGraficar);
        Ventana.pack();
        Ventana.setVisible(true);
        
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnGraficarActionPerformed
    
    private void btnGuardarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPiezaActionPerformed
             tp = new tipoPiezas(txtNombrePieza.getText(),Integer.parseInt(txtOrientacionX.getText()),Integer.parseInt(txtOrientacionY.getText()),Integer.parseInt(txtOrientacionZ.getText()),txtTipoEmbalaje.getText(),Integer.parseInt(txtVueltas.getText())); 
             listaPiezas.add(tp);
             mensajeLog("\n********* SE HA CREADO UNA NUEVA PIEZA *********/");      
    }//GEN-LAST:event_btnGuardarPiezaActionPerformed

    private void txtNombrePiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePiezaActionPerformed

    private void btnGenerarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPiezaActionPerformed
        pieza = crearPiezaRandom();
        //mensajeLog("\n/*SE HA CREADO UNA PIEZA*/ \n"+pieza.toString());
        manejar.crearJSON(pieza); 
        String nombreArchivo="Pieza";
        trabajarPieza(nombreArchivo);
    }//GEN-LAST:event_btnGenerarPiezaActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        Conexion conect = new Conexion();
        String ip = txtIp.getText(); 
        int puerto = Integer.parseInt(txtPuerto.getText());
        conect.Conexion(ip,puerto);
    try {
        conect.enviar(ip, puerto);
    } catch (IOException ex) {
        System.out.println("Error al enviar el archivo "+ex);
    }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void txtIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpActionPerformed
    
     /********************************************************************************************************/
     /************************************TRABAJA LA PIEZA RECIBIDA*******************************************/
     /********************************************************************************************************/
    
    public void trabajarPieza(String nombreArchivo){
        pieza = manejar.leerJSON(nombreArchivo);
        mensajeLog("\n/*SE HA RECIBIDO UNA PIEZA*/ \n"+pieza.toString());
        pieza = manejar.leerJSON(nombreArchivo);
        orientar(pieza);
        mensajeLog("\n/*SE HA ORIENTADO UNA PIEZA*/ \n"+pieza.toString());
    try {
        manejar.mover(nombreArchivo);
        // System.out.println("\033[31m/*********LA PIEZA HA SIDO REGRESADA POR DEFECTOS*********/");
    } catch (IOException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ParseException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    /********************************************************************************************************/
    public void crearListaPiezas(){
        //se crean las piezas y se le asigna nombre,orientacion X,Y,Z, el tipo de embalaje y el numero de vueltas para embalaje 
        tp = new tipoPiezas("Rotulas",50,70,20,"Plastico",10);
        listaPiezas.add(tp);
        tp = new tipoPiezas("Eje delantero",45,65,15,"Plastico",15);
        listaPiezas.add(tp);
        tp = new tipoPiezas("Brazo de suspencion",55,75,25,"Plastico",20);
        listaPiezas.add(tp);
        tp = new tipoPiezas("Barra estabilizadora",20,25,35,"Plastico",18);
        listaPiezas.add(tp);
        tp = new tipoPiezas("Brazo de suspencion",25,25,30,"Plastico",13);
        listaPiezas.add(tp);      
    }
    /******************************************************************************************************/
    Pieza pieza = new Pieza();
    Random rand = new Random();
    int maxX=180, minX=0,maxY=180, minY=0,maxZ=180, minZ=0;
    String[] destinos = {"Estados unidos","Canada","Mexico"};
    public Pieza crearPiezaRandom(){
        pieza.setIdPieza(rand.nextInt((9999999-1)+1)+1);
        int tipoDePiezaRandom=rand.nextInt(listaPiezas.size());
        //listaPiezas.get(tipoDePiezaRandom).setCantidad(listaPiezas.get(tipoDePiezaRandom).getCantidad()+1);
        pieza.setTipoPieza(listaPiezas.get(tipoDePiezaRandom+0).getTipoPieza());
        pieza.setOrientacionX(listaPiezas.get(tipoDePiezaRandom).getOrientacionX());
        pieza.setOrientacionY(listaPiezas.get(tipoDePiezaRandom).getOrientacionY());
        pieza.setOrientacionZ(listaPiezas.get(tipoDePiezaRandom).getOrientacionZ());
//        maxX=listaPiezas.get(tipoDePiezaRandom).getOrientacionX()+20;
//        maxY=listaPiezas.get(tipoDePiezaRandom).getOrientacionY()+20;
//        maxZ=listaPiezas.get(tipoDePiezaRandom).getOrientacionZ()+20;
//        minX=listaPiezas.get(tipoDePiezaRandom).getOrientacionX()-20;
//        minY=listaPiezas.get(tipoDePiezaRandom).getOrientacionY()-20;
//        minZ=listaPiezas.get(tipoDePiezaRandom).getOrientacionZ()-20;
        pieza.orientacionRealX=Math.abs(rand.nextInt((maxX - minX) +1 ) + minX);
        pieza.orientacionRealY=Math.abs(rand.nextInt((maxY - minY) +1 ) + minY);
        pieza.orientacionRealZ=Math.abs(rand.nextInt((maxZ - minZ) +1 ) + minZ); 
        pieza.setDestino(destinos[rand.nextInt((2-0)+1)+0]);
        pieza.setTipoEmbalaje(listaPiezas.get(tipoDePiezaRandom).getTipoEmbalaje());
        pieza.setVueltas(listaPiezas.get(tipoDePiezaRandom).getVueltas());
        return pieza;
    }
    
    public void mensajeLog(String mensaje){
        log.textArea(mensaje);
    }
    
    
    
    public Pieza orientar(Pieza pieza) {
        int diferencia = 0;
        String mensaje = "";
        
        if (pieza.getOrientacionRealX() < pieza.orientacionX) {
            diferencia = pieza.getOrientacionRealX() - pieza.orientacionX;
            mensaje = "\n -Girando pieza en X " + Math.abs(diferencia) + " grados a la derecha";
            mensajeLog(mensaje);
            //girando();
            pieza.setOrientacionRealX(pieza.getOrientacionRealX() - diferencia);
        } else if (pieza.getOrientacionRealX() > pieza.orientacionX) {
            diferencia = pieza.getOrientacionRealX() - pieza.orientacionX;
            mensaje = "\n -Girando pieza en X " + Math.abs(diferencia) + " grados a la izquierda";
            mensajeLog(mensaje);
            //girando();
            pieza.setOrientacionRealX(pieza.getOrientacionRealX() - diferencia);
        } else if (pieza.getOrientacionRealX() == pieza.orientacionX ) {
        } else {
            mensajeLog("\n/*********LA PIEZA ESTA DEFECTUOSA NO HA SIDO POSIBLE ORIENTARLA*********/");
            return pieza;
        }

        if (pieza.getOrientacionRealY() < pieza.orientacionY) {
            diferencia = pieza.getOrientacionRealY() - pieza.orientacionY;
            mensaje = "\n -Girando pieza en Y " + Math.abs(diferencia) + " grados a la derecha";
            mensajeLog(mensaje);
            //girando();
            pieza.setOrientacionRealY(pieza.getOrientacionRealY() - diferencia);
        } else if (pieza.getOrientacionRealY() > pieza.orientacionY) {
            diferencia = pieza.getOrientacionRealY() - pieza.orientacionY;
            mensaje = "\n -Girando pieza en Y " + Math.abs(diferencia) + " grados a la izquierda";
            mensajeLog(mensaje);
            //girando();
            pieza.setOrientacionRealY(pieza.getOrientacionRealY() - diferencia);
        } else if (pieza.getOrientacionRealY() == pieza.orientacionY ) {
        } else {
            mensajeLog("\n/*********LA PIEZA ESTA DEFECTUOSA NO HA SIDO POSIBLE ORIENTARLA*********/");
            return pieza;
        }
        if (pieza.getOrientacionRealZ() < pieza.orientacionZ) {
            diferencia = pieza.getOrientacionRealZ() - pieza.orientacionZ;
            mensaje = "\n -Girando pieza en Z " + Math.abs(diferencia) + " grados a la derecha";
            mensajeLog(mensaje);
            //girando();
            pieza.setOrientacionRealZ(pieza.getOrientacionRealZ() - diferencia);
        } else if (pieza.getOrientacionRealZ() > pieza.orientacionZ) {
            diferencia = pieza.getOrientacionRealZ() - pieza.orientacionZ;
            mensaje = "\n -Girando pieza en Z " + Math.abs(diferencia) + " grados a la izquierda";
            mensajeLog(mensaje);
            //girando();
            pieza.setOrientacionRealZ(pieza.getOrientacionRealZ() - diferencia);
        } else if (pieza.getOrientacionRealZ() == pieza.orientacionZ) {
        } else {
            mensajeLog("\n/*********LA PIEZA ESTA DEFECTUOSA NO HA SIDO POSIBLE ORIENTARLA*********/");
            return pieza;
        }
        for (int i = 0; i < listaPiezas.size(); i++) {
            if(listaPiezas.get(i).getTipoPieza().equals(pieza.getTipoPieza())){
                 listaPiezas.get(i).setCantidad(listaPiezas.get(i).getCantidad()+1);
            }
        }
        
        return pieza;
    }

    public void girando() {
        for (int i = 0; i < 3; i++) {
            mensajeLog("\n/*Girando...*/");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                mensajeLog("\n"+ex + "error sleep");
            }
        }
    }
    
    
    /********************************************** ******** ************************************************************/
    /********************************************** GRAFICAR ************************************************************/
    /********************************************** ******** ************************************************************/
    
    public void agregarDatos(){
    for (int i = 0; i < listaPiezas.size(); i++) {
        Datos.addValue(listaPiezas.get(i).getCantidad(),listaPiezas.get(i).getTipoPieza(),listaPiezas.get(i).getTipoPieza());
    }
    grafica = ChartFactory.createBarChart("Piezas Orientas",
    "Pieza", "Cantidad", Datos,
    PlotOrientation.HORIZONTAL, true, true, false);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnGenerarPieza;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnGuardarPieza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtNombrePieza;
    private javax.swing.JTextField txtOrientacionX;
    private javax.swing.JTextField txtOrientacionY;
    private javax.swing.JTextField txtOrientacionZ;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JTextField txtTipoEmbalaje;
    private javax.swing.JTextField txtVueltas;
    // End of variables declaration//GEN-END:variables
}
