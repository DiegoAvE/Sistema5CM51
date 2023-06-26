import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principalp extends JFrame implements ActionListener{
  private JLabel label1;
  private JButton boton1, boton2, boton3, boton4, boton5, botonC, botonR;

  public Principalp(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(255,222,89)); 
    setIconImage(new ImageIcon(getClass().getResource("images/iconog.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/iconog2.png");  
    label1 = new JLabel(imagen);
    label1.setBounds(165,35,210,210);
    add(label1);

    boton1 = new JButton("ALTAS");
    boton1.setBounds(97,270,355,30);
    boton1.setBackground(new Color(190,162,19));
    boton1.setFont(new Font("Verdana", 1, 13));
    boton1.setForeground(new Color(0,0,0));
    boton1.addActionListener(this);
    add(boton1);

    boton2 = new JButton("BAJAS");
    boton2.setBounds(97,315,355,30);
    boton2.setBackground(new Color(190,162,19));
    boton2.setFont(new Font("Verdana", 1, 13));
    boton2.setForeground(new Color(0,0,0));
    boton2.addActionListener(this);
    add(boton2);

    boton3 = new JButton("ACTUALIZAR");
    boton3.setBounds(97,360,355,30);
    boton3.setBackground(new Color(190,162,19));
    boton3.setFont(new Font("Verdana", 1, 13));
    boton3.setForeground(new Color(0,0,0));
    boton3.addActionListener(this);
    add(boton3);

    boton4 = new JButton("CONSULTA");
    boton4.setBounds(97,405,355,30);
    boton4.setBackground(new Color(190,162,19));
    boton4.setFont(new Font("Verdana", 1, 13));
    boton4.setForeground(new Color(0,0,0));
    boton4.addActionListener(this);
    add(boton4);


    botonC = new JButton("CALENDARIO");
    botonC.setBounds(97,450,355,30);
    botonC.setBackground(new Color(190,162,19));
    botonC.setFont(new Font("Verdana", 1, 13));
    botonC.setForeground(new Color(0,0,0));
    botonC.addActionListener(this);
    add(botonC);


    boton5 = new JButton("<-");
    boton5.setBounds(460,560,60,30);
    boton5.setBackground(new Color(190,162,19));
    boton5.setFont(new Font("Verdana", 1, 13));
    boton5.setForeground(new Color(0,0,0));
    boton5.addActionListener(this);
    add(boton5);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){

      Altas ventanaAltas = new Altas();
      ventanaAltas.setBounds(0,0,550,550);
      ventanaAltas.setVisible(true);
      ventanaAltas.setResizable(false);
      ventanaAltas.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton2){

      Bajas ventanaBajas = new Bajas();
      ventanaBajas.setBounds(0,0,550,550);
      ventanaBajas.setVisible(true);
      ventanaBajas.setResizable(false);
      ventanaBajas.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton3){

      Actlz ventanaActlz = new Actlz();
      ventanaActlz.setBounds(0,0,550,550);
      ventanaActlz.setVisible(true);
      ventanaActlz.setResizable(false);
      ventanaActlz.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton4){

      Consul ventanaConsul = new Consul();
      ventanaConsul.setBounds(0,0,550,550);
      ventanaConsul.setVisible(true);
      ventanaConsul.setResizable(false);
      ventanaConsul.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton5){

      Login ventanalogin = new Login();
      ventanalogin.setBounds(0,0,550,550);
      ventanalogin.setVisible(true);
      ventanalogin.setResizable(false);
      ventanalogin.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == botonC){

      CGUI ventanaCGUI = new CGUI();
      ventanaCGUI.setVisible(true);
      ventanaCGUI.setLocationRelativeTo(null);
      this.setVisible(false);

    }
  }

   public static void main(String args[]){
     Principalp ventanaprincipalp = new Principalp();
     ventanaprincipalp.setBounds(0,0,550,650); // El primero es el ancho y el segundo el alto
     ventanaprincipalp.setVisible(true);
     ventanaprincipalp.setResizable(false);
     ventanaprincipalp.setLocationRelativeTo(null);
 }
}
