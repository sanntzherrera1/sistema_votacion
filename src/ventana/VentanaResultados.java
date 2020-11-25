package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VentanaResultados extends JFrame implements ActionListener{
    private JButton boton0;
    private JLabel label0,label1,label2,label3,label4,label5,label6;
    private JLabel labelg1,labelg2,labelg3,labelg4,labelg5,labelg6;
    private JLabel labeld1,labeld2,labeld3,labeld4,labeld5,labeld6;
    public static int votosp1=0,votosp2=0,votosp3=0,votosp4=0,votosp5=0;
    public static int votosg1=0,votosg2=0,votosg3=0,votosg4=0,votosg5=0;
    public static int votosd1=0,votosd2=0,votosd3=0,votosd4=0,votosd5=0;
    
    public VentanaResultados(){
        VentanaPresidentes cantidadvotosp = new VentanaPresidentes();
        votosp1 = cantidadvotosp.cantvotosp1;
        votosp2 = cantidadvotosp.cantvotosp2;
        votosp3 = cantidadvotosp.cantvotosp3;
        votosp4 = cantidadvotosp.cantvotosp4;
        votosp5 = cantidadvotosp.cantvotosp5;
        
        VentanaGobernadores cantidadvotosg = new VentanaGobernadores();
        votosg1 = cantidadvotosg.cantvotosg1;
        votosg2 = cantidadvotosg.cantvotosg2;
        votosg3 = cantidadvotosg.cantvotosg3;
        votosg4 = cantidadvotosg.cantvotosg4;
        votosg5 = cantidadvotosg.cantvotosg5;
        
        VentanaDiputados cantidadvotosd = new VentanaDiputados();
        votosd1 = cantidadvotosd.cantvotosd1;
        votosd2 = cantidadvotosd.cantvotosd2;
        votosd3 = cantidadvotosd.cantvotosd3;
        votosd4 = cantidadvotosd.cantvotosd4;
        votosd5 = cantidadvotosd.cantvotosd5;
        
        
        setLayout(null);
        setTitle("Resultados");
        getContentPane().setBackground(new Color(255,215,0));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label0 = new JLabel("Resultados de los votos");// 1erLabel
        label0.setBounds(300,100,299,100);//(izq-drecha//arriba-abajo//largo//ancho)
        label0.setFont(new Font("Andale Mono", 1, 20));
        label0.setForeground(new Color(0,0,0));
        label0.setBackground(new Color(255, 255, 0));
        add(label0);
        //----------------------------------------------
        //--------------PRESIDENTES---------------------
        //----------------------------------------------
        label1 = new JLabel("Cant. votos Presidente1: "+votosp1);//(izq-drecha//arriba-abajo//largo//ancho)
        label1.setBounds(30,305,240,100);
        label1.setFont(new Font("Andale Mono", 1, 15));
        add(label1);
        
        label2 = new JLabel("Cant. votos Presidente2: "+votosp2);
        label2.setBounds(30,325,240,100);
        label2.setFont(new Font("Andale Mono", 1, 15));
        add(label2);
        
        label3 = new JLabel("Cant. votos Presidente3: "+votosp3);
        label3.setBounds(30,345,240,100);
        label3.setFont(new Font("Andale Mono", 1, 15));
        add(label3);
        
        label4 = new JLabel("Cant. votos Presidente4: "+votosp4);
        label4.setBounds(30,365,240,100);
        label4.setFont(new Font("Andale Mono", 1, 15));
        add(label4);
        
        label5 = new JLabel("Cant. votos PrEnBlanco: "+votosp5);
        label5.setBounds(30,385,240,100);
        label5.setFont(new Font("Andale Mono", 1, 15));
        add(label5);
        
        if(votosp1>votosp2 || votosp1>votosp3||votosp1>votosp4||votosp1>votosp5)
        {
            label6 = new JLabel("Ganador presidente1: "+votosp1);//ganador presidente
            label6.setBounds(30,410,240,100);
            label6.setFont(new Font("Andale Mono", 1, 15));
            label6.setForeground(new Color(255,0,0));
            add(label6);
        }
        if(votosp2>votosp1 || votosp2>votosp3||votosp2>votosp4||votosp2>votosp5)
        {
            label6 = new JLabel("Ganador presidente2: "+votosp2);//ganador presidente
            label6.setBounds(30,410,240,100);
            label6.setFont(new Font("Andale Mono", 1, 15));
            label6.setForeground(new Color(255,0,0));
            add(label6);
        }
        if(votosp3>votosp1 || votosp3>votosp2||votosp3>votosp4||votosp3>votosp5)
        {
            label6 = new JLabel("Ganador presidente3: "+votosp3);//ganador presidente
            label6.setBounds(30,410,240,100);
            label6.setFont(new Font("Andale Mono", 1, 15));
            label6.setForeground(new Color(255,0,0));
            add(label6);
        }
        
        if(votosp4>votosp1 || votosp4>votosp2||votosp4>votosp3||votosp4>votosp5)
        {
            label6 = new JLabel("Ganador presidente4: "+votosp4);//ganador presidente
            label6.setBounds(30,410,240,100);
            label6.setFont(new Font("Andale Mono", 1, 15));
            label6.setForeground(new Color(255,0,0));
            add(label6);
        }
        if(votosp5>votosp1 || votosp5>votosp2||votosp5>votosp3||votosp5>votosp4)
        {
            label6 = new JLabel("Ganador presidente3: "+votosp5);//ganador presidente
            label6.setBounds(30,410,240,100);
            label6.setFont(new Font("Andale Mono", 1, 15));
            label6.setForeground(new Color(255,0,0));
            add(label6);
        }

        
        
        
        //----------------------------------------------
        //--------------GOBERNADORES--------------------
        //----------------------------------------------
        labelg1 = new JLabel("Cant. votos Gobernador1: "+votosg1);//(izq-drecha//arriba-abajo//largo//ancho)
        labelg1.setBounds(280,305,240,100);
        labelg1.setFont(new Font("Andale Mono", 1, 15));
        add(labelg1);
        
        labelg2 = new JLabel("Cant. votos Gobernador2: "+votosg2);
        labelg2.setBounds(280,325,240,100);
        labelg2.setFont(new Font("Andale Mono", 1, 15));
        add(labelg2);
        
        labelg3 = new JLabel("Cant. votos Gobernador3: "+votosg3);
        labelg3.setBounds(280,345,240,100);
        labelg3.setFont(new Font("Andale Mono", 1, 15));
        add(labelg3);
        
        labelg4 = new JLabel("Cant. votos Gobernador4: "+votosg4);
        labelg4.setBounds(280,365,240,100);
        labelg4.setFont(new Font("Andale Mono", 1, 15));
        add(labelg4);
        
        labelg5 = new JLabel("Cant. votos GbEnBlanco: "+votosg5);
        labelg5.setBounds(280,385,240,100);
        labelg5.setFont(new Font("Andale Mono", 1, 15));
        add(labelg5);
        

        
        if(votosg1>votosg2 || votosg1>votosg3||votosg1>votosg4||votosg1>votosg5)
        {
            labelg6 = new JLabel("Ganador gobernador1: "+votosp1);//ganador presidente
            labelg6.setBounds(280,410,240,100);
            labelg6.setFont(new Font("Andale Mono", 1, 15));
            labelg6.setForeground(new Color(255,0,0));
            add(labelg6);
        }
        if(votosg2>votosg1 || votosg2>votosg3||votosg2>votosg4||votosg2>votosg5)
        {
            labelg6 = new JLabel("Ganador gobernador2: "+votosp2);//ganador presidente
            labelg6.setBounds(280,410,240,100);
            labelg6.setFont(new Font("Andale Mono", 1, 15));
            labelg6.setForeground(new Color(255,0,0));
            add(labelg6);
        }
         if(votosg3>votosg1 || votosg3>votosg2||votosg3>votosg4||votosg3>votosg5)
        {
            labelg6 = new JLabel("Ganador gobernador3: "+votosp3);//ganador presidente
            labelg6.setBounds(280,410,240,100);
            labelg6.setFont(new Font("Andale Mono", 1, 15));
            labelg6.setForeground(new Color(255,0,0));
            add(labelg6);
        }
        
         if(votosg4>votosg1 || votosg4>votosg2||votosg4>votosg3||votosg4>votosg5)
        {
            labelg6 = new JLabel("Ganador gobernador4: "+votosp4);//ganador presidente
            labelg6.setBounds(280,410,240,100);
            labelg6.setFont(new Font("Andale Mono", 1, 15));
            labelg6.setForeground(new Color(255,0,0));
            add(labelg6);
        }
         if(votosg5>votosg1 || votosg5>votosg2||votosg5>votosg3||votosg5>votosg4)
        {
            labelg6 = new JLabel("Ganador gobernador5: "+votosp5);//ganador presidente
            labelg6.setBounds(280,410,240,100);
            labelg6.setFont(new Font("Andale Mono", 1, 15));
            labelg6.setForeground(new Color(255,0,0));
            add(labelg6);
        }
        
        //----------------------------------------------
        //--------------DIPUTADOS-----------------------
        //----------------------------------------------
        
        labeld1 = new JLabel("Cant. votos Diputado1: "+votosd1);//(izq-drecha//arriba-abajo//largo//ancho)
        labeld1.setBounds(540,305,240,100);
        labeld1.setFont(new Font("Andale Mono", 1, 15));
        add(labeld1);
        
        labeld2 = new JLabel("Cant. votos Diputado2: "+votosd2);
        labeld2.setBounds(540,325,240,100);
        labeld2.setFont(new Font("Andale Mono", 1, 15));
        add(labeld2);
        
        labeld3 = new JLabel("Cant. votos Diputado3: "+votosd3);
        labeld3.setBounds(540,345,240,100);
        labeld3.setFont(new Font("Andale Mono", 1, 15));
        add(labeld3);
        
        labeld4 = new JLabel("Cant. votos Diputado4: "+votosd4);
        labeld4.setBounds(540,365,240,100);
        labeld4.setFont(new Font("Andale Mono", 1, 15));
        add(labeld4);
        
        labeld5 = new JLabel("Cant. votos DiEnBlanco: "+votosd5);
        labeld5.setBounds(540,385,240,100);
        labeld5.setFont(new Font("Andale Mono", 1, 15));
        add(labeld5);
        
        
        
         if(votosd1>votosd2 || votosd1>votosd3||votosd1>votosd4||votosd1>votosd5)
        {
            labeld6 = new JLabel("Ganador diputado1: "+votosd1);//ganador presidente
            labeld6.setBounds(540,410,240,100);
            labeld6.setFont(new Font("Andale Mono", 1, 15));
            labeld6.setForeground(new Color(255,0,0));
            add(labeld6);
        }
        if(votosd2>votosd1 || votosd2>votosd3||votosd2>votosd4||votosd2>votosd5)
        {
            labeld6 = new JLabel("Ganador diputado2: "+votosd2);//ganador presidente
            labeld6.setBounds(540,410,240,100);
            labeld6.setFont(new Font("Andale Mono", 1, 15));
            labeld6.setForeground(new Color(255,0,0));
            add(labeld6);
        }
         if(votosd3>votosd1 || votosd3>votosd2||votosd3>votosd4||votosd3>votosd5)
        {
            labeld6 = new JLabel("Ganador diputado3: "+votosd3);//ganador presidente
            labeld6.setBounds(540,410,240,100);
            labeld6.setFont(new Font("Andale Mono", 1, 15));
            labeld6.setForeground(new Color(255,0,0));
            add(labeld6);
        }
        
         if(votosd4>votosd1 || votosd4>votosd2||votosd4>votosd3||votosd4>votosd5)
        {
            labeld6 = new JLabel("Ganador diputado4: "+votosd4);//ganador presidente
            labeld6.setBounds(540,410,240,100);
            labeld6.setFont(new Font("Andale Mono", 1, 15));
            labeld6.setForeground(new Color(255,0,0));
            add(labeld6);
        }
        if(votosd5>votosd1 || votosd5>votosd1||votosd5>votosd1||votosd5>votosd1)
        {
            labeld6 = new JLabel("Ganador diputado5: "+votosd5);//ganador presidente
            labeld6.setBounds(540,410,240,100);
            labeld6.setFont(new Font("Andale Mono", 1, 15));
            labeld6.setForeground(new Color(255,0,0));
            add(labeld6);
        }
        
        boton0 = new JButton("Volver al Inicio");
        boton0.setBounds(270,500,270,30); // (izq-drecha//arriba-abajo//largo//ancho)
        boton0.setBackground(new Color(255,255,255));
        boton0.setFont(new Font("Andale Mono", 1, 14));
        boton0.setForeground(new Color(0,0,0));
        boton0.addActionListener(this);
        add(boton0);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton0)
        {
                Bienvenida v1 = new Bienvenida();
                v1.setVisible(true);
                v1.setBounds(0,0,770,770);//(izq-drecha//arriba-abajo//largo//ancho)
                v1.setResizable(false);
                v1.setLocationRelativeTo(null);
                this.setVisible(false);//oculo 1er panel
                
        }
    }
    
    
    
}
