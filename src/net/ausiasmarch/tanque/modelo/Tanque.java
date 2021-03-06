/*
 * Tanque.java
 */
package net.ausiasmarch.tanque.modelo;

/**
 * Clase que representa un Tanque de agua
 * @author  Luis
 */
public class Tanque extends javax.swing.JPanel {

    private EstadoTanque estado;
    
    /**
     * Crea un tanque de agua
     */
    public Tanque() {
        
        initComponents();
        estado = EstadoTanque.VACIO;
        jLabelLleno.setVisible(false);
        jLabelMedio.setVisible(false);
        jLabelVacio.setVisible(true);
        
    }

    public void llenarMedio(){
        
        switch (estado){
            case VACIO:
                
                estado = EstadoTanque.MEDIO;
                jLabelLleno.setVisible(false);
                jLabelMedio.setVisible(true);
                jLabelVacio.setVisible(false);
                break;
                
            case MEDIO:
                
                estado = EstadoTanque.LLENO;
                jLabelLleno.setVisible(true);
                jLabelMedio.setVisible(false);
                jLabelVacio.setVisible(false);
                break;
            
        }
        
    }
    
    public void vaciarMedio(){

        switch (estado){
            case LLENO:
                
                estado = EstadoTanque.MEDIO;
                jLabelLleno.setVisible(false);
                jLabelMedio.setVisible(true);
                jLabelVacio.setVisible(false);
                break;
                
            case MEDIO:
                
                estado = EstadoTanque.VACIO;
                jLabelLleno.setVisible(false);
                jLabelMedio.setVisible(false);
                jLabelVacio.setVisible(true);
                break;
            
        }
        
    }

    public EstadoTanque getEstado(){
        return estado;
    }    

        
     /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLleno = new javax.swing.JLabel();
        jLabelMedio = new javax.swing.JLabel();
        jLabelVacio = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Lleno.png"))); // NOI18N
        add(jLabelLleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Medio.png"))); // NOI18N
        add(jLabelMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/tanque/img/Vacio.png"))); // NOI18N
        add(jLabelVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLleno;
    private javax.swing.JLabel jLabelMedio;
    private javax.swing.JLabel jLabelVacio;
    // End of variables declaration//GEN-END:variables
}
