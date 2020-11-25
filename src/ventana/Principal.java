package ventana;

public class Principal {

    public static void main(String[] args) {
         Bienvenida v1 = new Bienvenida();
         
         v1.setVisible(true);
         v1.setBounds(0,0,770,770);//(izq-drecha//arriba-abajo//largo//ancho)
         v1.setResizable(false);
         v1.setLocationRelativeTo(null);
         
         VentanaPrincipal v2 = new VentanaPrincipal();
         v2.setVisible(false);
         v2.setBounds(0,0,1200,676);//(izq-drecha//arriba-abajo//largo//ancho)
         v2.setResizable(false);
         v2.setLocationRelativeTo(null);
         
         VentanaPresidentes v3 = new VentanaPresidentes();
         v3.setVisible(false);
         v3.setBounds(0,0,1200,676);//(izq-drecha//arriba-abajo//largo//ancho)
         v3.setResizable(false);
         v3.setLocationRelativeTo(null);
         
         VentanaGobernadores v4 = new VentanaGobernadores();
         v4.setVisible(false);
         v4.setBounds(0,0,1200,676);//(izq-drecha//arriba-abajo//largo//ancho)
         v4.setResizable(false);
         v4.setLocationRelativeTo(null);
         
         VentanaDiputados v5 = new VentanaDiputados();
         v5.setVisible(false);
         v5.setBounds(0,0,1200,676);//(izq-drecha//arriba-abajo//largo//ancho)
         v5.setResizable(false);
         v5.setLocationRelativeTo(null);
         
         
         VentanaResultados v6 = new VentanaResultados();
         v6.setVisible(false);
         v6.setBounds(0,0,800,700);//(izq-drecha//arriba-abajo//largo//ancho)
         v6.setResizable(false);
         v6.setLocationRelativeTo(null);
         
        
         
    }
    
}
