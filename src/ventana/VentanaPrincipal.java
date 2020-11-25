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
import javax.swing.JTextField;
import static ventana.VentanaResultados.votosd1;
import static ventana.VentanaResultados.votosd2;
import static ventana.VentanaResultados.votosd3;

public class VentanaPrincipal extends JFrame implements ActionListener{
        private JTextField textfield1;
        private JLabel label1,label0;
        private JButton boton1,boton2,boton3;
        private JLabel labelp1,labelp2,labelp3;
        
        public static int presidente=0;
        public static int gobernador=0;
        public static int diputado=0;
        
    
    public VentanaPrincipal()
    {
        
        
        setLayout(null);
        setTitle("Pantalla Principal");
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        setContentPane(new JLabel(new ImageIcon("images/interfaz.jpg")));
        JLabel L2 = new JLabel();
        add(L2);
        setSize(1200,676);
        
        label0 = new JLabel("Bienvenido al Menu Principal");// 1erLabel
        label0.setBounds(350,50,440,30);//(izq-drecha//arriba-abajo//largo//ancho)
        label0.setFont(new Font("Andale Mono", 3, 30));
        label0.setForeground(new Color(0,0,0));
        add(label0);
         
        
        
        boton1 = new JButton("Empezar a Votar");//1erBotonIngresar
        boton1.setBounds(500,460,190,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(0,0,0));
        boton1.addActionListener(this);
        add(boton1);
        
       
        
        //añadir logo
        /*labelp1 = new JLabel("Valor presidente: "+presidente);//(izq-drecha//arriba-abajo//largo//ancho)
        labelp1.setBounds(540,305,240,100);
        labelp1.setFont(new Font("Andale Mono", 1, 15));// validacion de los votos por principal
        add(labelp1);
        
        labelp2 = new JLabel("valor gobernaodr: "+gobernador);
        labelp2.setBounds(540,325,240,100);
        labelp2.setFont(new Font("Andale Mono", 1, 15));
        add(labelp2);
        
        labelp3 = new JLabel("valor diputado: "+diputado);
        labelp3.setBounds(540,345,240,100);
        labelp3.setFont(new Font("Andale Mono", 1, 15));
        add(labelp3);*/
        
       
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1)
        {
            
            JOptionPane.showMessageDialog(null,"Ahora va a votar CANDIDATOS A PRESIDENTE");
            
                presidente = presidente + 1;
                VentanaPresidentes v3 = new VentanaPresidentes();
                v3.setVisible(true);
                v3.setBounds(0,0,1200,676);//(izq-drecha//arriba-abajo//largo//ancho)
                v3.setResizable(false);
                v3.setLocationRelativeTo(null);
                this.setVisible(false);//oculo 1er panel
                gobernador=0;
                diputado=0;
                
                
        }
        
        
    }
         
}
