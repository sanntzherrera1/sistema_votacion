package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static ventana.VentanaDiputados.diputado1;
import static ventana.VentanaGobernadores.gobernador1;

import static ventana.VentanaPrincipal.diputado;
import static ventana.VentanaPrincipal.gobernador;
import static ventana.VentanaPrincipal.presidente;
import static ventana.VentanaResultados.votosp1;




public class VentanaPresidentes extends JFrame implements ActionListener{   
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7;
    public static int cantvotosp1 = 0,cantvotosp2=0,cantvotosp3=0,cantvotosp4=0,cantvotosp5=0;
     private JLabel label0,label1;
     public static int presidente1=0;
     public static int gobernador1=0;
     public static int diputado1=0;
    public VentanaPresidentes()
    {
        
        
        VentanaPrincipal botonpresidente = new VentanaPrincipal();
        presidente1 = botonpresidente.presidente;
        
        VentanaPrincipal botongobernador = new VentanaPrincipal();
        gobernador1 = botongobernador.gobernador;
        
        VentanaPrincipal botondiputado = new VentanaPrincipal();
        diputado1 = botongobernador.diputado;
        
        setLayout(null);
        setTitle("Candidatos a Presidentes");  
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new JLabel(new ImageIcon("images/interfaz.jpg")));
        JLabel L3 = new JLabel();
        add(L3);
        setSize(1200,676);
        
        label1 = new JLabel("Candidatos a Presidente");
        label1.setBounds(460,35,290,30);
        label1.setFont(new Font("Andale Mono", 3, 25));
        add(label1);
        
        
        
        label0 = new JLabel(); 
        label0.setIcon(new ImageIcon("images/presidentes.jpg")); // 1erLogo
        label0.setBounds(0,90,1200,469);// (izq-drecha//arriba-abajo//largo//ancho)
        add(label0);
        
        boton1 = new JButton("Votar 1");
        boton1.setBounds(65,565,120,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(0,0,0));
        boton1.addActionListener(this);
        add(boton1);
        
        boton2 = new JButton("Votar 2");
        boton2.setBounds(315,565,120,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton2.setBackground(new Color(255,255,255));
        boton2.setFont(new Font("Andale Mono", 1, 14));
        boton2.setForeground(new Color(0,0,0));
        boton2.addActionListener(this);
        add(boton2);
        
        boton3 = new JButton("Votar 3");
        boton3.setBounds(560,565,120,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton3.setBackground(new Color(255,255,255));
        boton3.setFont(new Font("Andale Mono", 1, 14));
        boton3.setForeground(new Color(0,0,0));
        boton3.addActionListener(this);
        add(boton3);
        
        boton4 = new JButton("Votar 4");
        boton4.setBounds(800,565,120,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton4.setBackground(new Color(255,255,255));
        boton4.setFont(new Font("Andale Mono", 1, 14));
        boton4.setForeground(new Color(0,0,0));
        boton4.addActionListener(this);
        add(boton4);
        
        boton5 = new JButton("Votar 5");
        boton5.setBounds(1020,565,120,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton5.setBackground(new Color(255,255,255));
        boton5.setFont(new Font("Andale Mono", 1, 14));
        boton5.setForeground(new Color(0,0,0));
        boton5.addActionListener(this);
        add(boton5);
        

        boton6 = new JButton("Siguiente");
        boton6.setBounds(500,600,240,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton6.setBackground(new Color(255,255,255));
        boton6.setFont(new Font("Andale Mono", 1, 14));
        boton6.setForeground(new Color(0,0,0));
        boton6.addActionListener(this);
        add(boton6);
        
        
    
         
        //--------------------------------------
        
        if(gobernador1 >= 0 && presidente == 0) // validaciongobernador
        {
            
                boton6.setEnabled(false);
        }
         
        //--------------------------------------
                
         if(diputado1 >= 1 && presidente == 0)
        {
            boton6.setEnabled(true);
            boton7.setEnabled(false);
        }
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == boton1)
        {
                
                cantvotosp1 = cantvotosp1 + 1;
                boton1.setEnabled(false);
                boton2.setEnabled(false);
                boton3.setEnabled(false);
                boton4.setEnabled(false);
                boton5.setEnabled(false);
                
        }
        if(e.getSource() == boton2)
        {
                
                cantvotosp2 = cantvotosp2 + 1;
                boton1.setEnabled(false);
                boton2.setEnabled(false);
                boton3.setEnabled(false);
                boton4.setEnabled(false);
                boton5.setEnabled(false);
               
    
        }
        if(e.getSource() == boton3)
        {
                
                cantvotosp3 = cantvotosp3 + 1;
                boton1.setEnabled(false);
                boton2.setEnabled(false);
                boton3.setEnabled(false);
                boton4.setEnabled(false);
                boton5.setEnabled(false);
               
    
        }
        if(e.getSource() == boton4)
        {
                
                cantvotosp4 = cantvotosp4 + 1;
                boton1.setEnabled(false);
                boton2.setEnabled(false);
                boton3.setEnabled(false);
                boton4.setEnabled(false);
                boton5.setEnabled(false);
                
        }
        if(e.getSource() == boton5)
        {
                
                cantvotosp5 = cantvotosp5 + 1;
                boton1.setEnabled(false);
                boton2.setEnabled(false);
                boton3.setEnabled(false);
                boton4.setEnabled(false);
                boton5.setEnabled(false);
                
        }
        

        if(e.getSource() == boton6)
        {
                JOptionPane.showMessageDialog(null,"Ahora va a votar CANDIDATOS A GOBERNADOR");
                VentanaGobernadores v4 = new VentanaGobernadores();
                v4.setVisible(true);
                v4.setBounds(0,0,1200,676);//(izq-drecha//arriba-abajo//largo//ancho)
                v4.setResizable(false);
                v4.setLocationRelativeTo(null);
                this.setVisible(false);//oculo 1er panel
                
                
        } 
        
        
        
    }
        
    
}
