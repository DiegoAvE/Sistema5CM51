import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Consul extends JFrame implements ActionListener{
  private JLabel label1, label2, label3, label4, label5, label6, label7;
  private JButton boton1, boton2, boton3, boton4, boton5, boton6;

  public Consul(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Consulta");
    getContentPane().setBackground(new Color(255,222,89)); 
    setIconImage(new ImageIcon(getClass().getResource("images/iconog.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/iconog3.png");  
    label1 = new JLabel(imagen);
    label1.setBounds(10,10,116,116);
    add(label1);

    ImageIcon imagen3 = new ImageIcon("images/imgMC.png");  
    label2 = new JLabel(imagen3);
    label2.setBounds(130,42,355,75);
    add(label2);

    ImageIcon imagen2 = new ImageIcon("images/casa.png");
    boton6 = new JButton(imagen2);
    boton6.setBounds(490,10,43,37);
    boton6.addActionListener(this);
    add(boton6);

    ImageIcon imagen4 = new ImageIcon("images/img1.png");  
    label3 = new JLabel(imagen4);
    label3.setBounds(20,156,158,113);
    add(label3);

    boton1 = new JButton("Venta");
    boton1.setBounds(35,280,131,30);
    boton1.setBackground(new Color(190,162,19));
    boton1.setFont(new Font("Verdana", 1, 13));
    boton1.setForeground(new Color(0,0,0));
    boton1.addActionListener(this);
    add(boton1);

    ImageIcon imagen5 = new ImageIcon("images/img2.png");  
    label4 = new JLabel(imagen5);
    label4.setBounds(210,166,113,97);
    add(label4);

    boton2 = new JButton("Cliente");
    boton2.setBounds(201,280,131,30);
    boton2.setBackground(new Color(190,162,19));
    boton2.setFont(new Font("Verdana", 1, 13));
    boton2.setForeground(new Color(0,0,0));
    boton2.addActionListener(this);
    add(boton2);

    ImageIcon imagen6 = new ImageIcon("images/img3.png");  
    label5 = new JLabel(imagen6);
    label5.setBounds(380,166,105,108);
    add(label5);

    boton3 = new JButton("Producto");
    boton3.setBounds(367,280,131,30);
    boton3.setBackground(new Color(190,162,19));
    boton3.setFont(new Font("Verdana", 1, 13));
    boton3.setForeground(new Color(0,0,0));
    boton3.addActionListener(this);
    add(boton3);

    ImageIcon imagen7 = new ImageIcon("images/img4.png");  
    label6 = new JLabel(imagen7);
    label6.setBounds(144,340,84,85);
    add(label6);

    boton4 = new JButton("Empleado");
    boton4.setBounds(120,440,131,30);
    boton4.setBackground(new Color(190,162,19));
    boton4.setFont(new Font("Verdana", 1, 13));
    boton4.setForeground(new Color(0,0,0));
    boton4.addActionListener(this);
    add(boton4);

    ImageIcon imagen8 = new ImageIcon("images/img5.png");  
    label7 = new JLabel(imagen8);
    label7.setBounds(307,330,78,95);
    add(label7);

    boton5 = new JButton("Actividad");
    boton5.setBounds(281,440,131,30);
    boton5.setBackground(new Color(190,162,19));
    boton5.setFont(new Font("Verdana", 1, 13));
    boton5.setForeground(new Color(0,0,0));
    boton5.addActionListener(this);
    add(boton5);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton6){

      Principalp ventanaprincipalp = new Principalp();
      ventanaprincipalp.setBounds(0,0,550,550);
      ventanaprincipalp.setVisible(true);
      ventanaprincipalp.setResizable(false);
      ventanaprincipalp.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton1){

      CVenta ventanaCVenta = new CVenta();
      ventanaCVenta.setBounds(0,0,550,550);
      ventanaCVenta.setVisible(true);
      ventanaCVenta.setResizable(false);
      ventanaCVenta.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton2){

      CClint ventanaCClint = new CClint();
      ventanaCClint.setBounds(0,0,550,550);
      ventanaCClint.setVisible(true);
      ventanaCClint.setResizable(false);
      ventanaCClint.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton3){

      CPro ventanaCPro = new CPro();
      ventanaCPro.setBounds(0,0,550,550);
      ventanaCPro.setVisible(true);
      ventanaCPro.setResizable(false);
      ventanaCPro.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton4){

      CEmpl ventanaCEmpl = new CEmpl();
      ventanaCEmpl.setBounds(0,0,550,550);
      ventanaCEmpl.setVisible(true);
      ventanaCEmpl.setResizable(false);
      ventanaCEmpl.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == boton5){

      CAct ventanaCAct = new CAct();
      ventanaCAct.setBounds(0,0,550,550);
      ventanaCAct.setVisible(true);
      ventanaCAct.setResizable(false);
      ventanaCAct.setLocationRelativeTo(null);
      this.setVisible(false);

    }
  }

   public static void main(String args[]){
     Consul ventanaConsul = new Consul();
     ventanaConsul.setBounds(0,0,550,550); // El primero es el ancho y el segundo el alto
     ventanaConsul.setVisible(true);
     ventanaConsul.setResizable(false);
     ventanaConsul.setLocationRelativeTo(null);
 }
}
