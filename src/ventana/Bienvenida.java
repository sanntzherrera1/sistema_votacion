
package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static ventana.VentanaPresidentes.diputado1;
import static ventana.VentanaPresidentes.gobernador1;
import static ventana.VentanaPresidentes.presidente1;

import java.sql.*;
 
public class Bienvenida extends JFrame implements ActionListener{
    
    private JLabel label0,label1,label2,label3;
    private JButton boton1,boton0;
    private JTextField textfield1;
    public static String dni = "";
    

            
    public Bienvenida(){
        
        
        
        setLayout(null);
        setTitle("Sistema de Votacion"); 
        setLocationRelativeTo(null);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setContentPane(new JLabel(new ImageIcon("images/login.jpg")));
        JLabel L1 = new JLabel();
        add(L1);
        setSize(770,770);
        
        
        /*label0 = new JLabel(); 
        label0.setIcon(new ImageIcon("images/login.jpg")); // 1erLogo
        label0.setBounds(0,200,770,400);// (izq-drecha//arriba-abajo//largo//ancho)
        add(label0);*/
        
        
        label1 = new JLabel("Sistema de Votacion Electoral");// 1erLabel
        label1.setBounds(200,45,500,30);// (izq-drecha//arriba-abajo//largo//ancho)
        label1.setFont(new Font("Andale Mono", 3, 25));
        label1.setForeground(new Color(0,0,0));
        add(label1);
        
        label2 = new JLabel("Ingrese su DNI");//1erIngreseMesaje
        label2.setBounds(250,360,200,30);// (izq-drecha//arriba-abajo//largo//ancho)
        label2.setFont(new Font("Andale Mono", 1, 12));
        label2.setForeground(new Color(0,0,0));
        add(label2);
        
        
        textfield1 = new JTextField();
        textfield1.setBounds(250,390,255,25);
        textfield1.setBackground(new Color(255, 255, 255));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(0, 0, 0));
        add(textfield1);
        
        boton1 = new JButton("Ingresar");//1erBotonIngresar
        boton1.setBounds(325,430,100,30);// (izq-drecha//arriba-abajo//largo//ancho)
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(0,0,0));
        boton1.addActionListener(this);
        add(boton1);
        
        boton0 = new JButton("Resultados");//BotonResul.Presidentes
        boton0.setBounds(550,540,130,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton0.setBackground(new Color(255,255,255));
        boton0.setVisible(false);
        boton0.setFont(new Font("Andale Mono", 1, 14));
        boton0.setForeground(new Color(0,0,0));
        boton0.addActionListener(this);
        add(boton0);
        
    
       
         
       }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton1)
        {    
            if(textfield1.getText().equals("11111111"))
            { 
                boton0.setVisible(true);
                boton0.setEnabled(true);
                
                
            }else
            {
                if(textfield1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Ingrese un DNI");

                }else
                {
                   try{
                        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/base_de_datos_votantes","root","");
                        System.out.println("exitoooo");
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO dni_votantes(DNI)VALUES(?)");

                        pst.setString(1, textfield1.getText().trim());

                        pst.executeUpdate();
                        textfield1.setText("");


                    }catch(Exception x){
                        System.out.println("error en la carga");
                    }
                    
                    
                    
                    
 
                    VentanaPrincipal v2 = new VentanaPrincipal();
                    v2.setVisible(true);
                    v2.setBounds(0,0,1200,676);//(izq-drecha//arriba-abajo//largo//ancho)
                    v2.setResizable(false);
                    v2.setLocationRelativeTo(null);
                    this.setVisible(false);//oculo 1er panel    
                    
                }
            }    
        }
        
        
               
           
            if(e.getSource() == boton0)
            { 
                VentanaResultados v5 = new VentanaResultados();
                v5.setVisible(true);
                v5.setBounds(0,0,800,700);//(izq-drecha//arriba-abajo//largo//ancho)
                v5.setResizable(false);
                v5.setLocationRelativeTo(null);       
                this.setVisible(false);//oculo 1er panel
                
            }
        
        
        
    }
}
        
        
        
        
        
        
        
  
