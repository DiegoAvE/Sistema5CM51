import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ACClint extends JFrame implements ActionListener{
  private JLabel label1, label2, label3, label4, label5, label6, label7, label8;
  private JLabel labela, labelb, labelc;
  private JButton boton1, boton2, boton3, boton4, boton5, boton6;
  private JButton botona, botonb;
  private JTextField textfield1, textfield2, textfield3, textfield4, textfield5;
  private JTextField textfielda, textfieldb;

  public ACClint(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Actualizar - Cliente");
    getContentPane().setBackground(new Color(255,222,89)); 
    setIconImage(new ImageIcon(getClass().getResource("images/iconog.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/iconog3.png");  
    label1 = new JLabel(imagen);
    label1.setBounds(10,10,116,116);
    add(label1);

    ImageIcon imagen2 = new ImageIcon("images/imgACC.png");  
    label2 = new JLabel(imagen2);
    label2.setBounds(145,42,307,52);
    add(label2);

    ImageIcon imagen3 = new ImageIcon("images/casa.png");
    boton1 = new JButton(imagen3);
    boton1.setBounds(490,10,43,37);
    boton1.addActionListener(this);
    add(boton1);

    label3 = new JLabel("DATOS DE CLIENTE");
    label3.setBounds(10,146,150,20);
    label3.setFont(new Font("Verdana", 1, 13));
    label3.setForeground(new Color(0,0,0));
    add(label3);

    label4 = new JLabel("ID_Cliente:");
    label4.setBounds(10,196,150,20);
    label4.setFont(new Font("Verdana", 1, 13));
    label4.setForeground(new Color(0,0,0));
    add(label4);

    textfield1 = new JTextField();
    textfield1.setBounds(145,196,175,25);
    textfield1.setBackground(new Color(245,245,220));
    textfield1.setFont(new Font("Verdana", 0, 12));
    textfield1.setForeground(new Color(0,0,0));
    add(textfield1);

    boton2 = new JButton("Buscar");
    boton2.setBounds(350,195,170,30);
    boton2.setBackground(new Color(190,162,19));
    boton2.setFont(new Font("Verdana", 1, 13));
    boton2.setForeground(new Color(0,0,0));
    boton2.addActionListener(this);
    add(boton2);

    label5 = new JLabel("Nombre:");
    label5.setBounds(10,246,150,20);
    label5.setFont(new Font("Verdana", 1, 13));
    label5.setForeground(new Color(0,0,0));
    add(label5);

    textfield2 = new JTextField();
    textfield2.setBounds(145,246,175,25);
    textfield2.setBackground(new Color(245,245,220));
    textfield2.setFont(new Font("Verdana", 0, 12));
    textfield2.setForeground(new Color(0,0,0));
    add(textfield2);

    label6 = new JLabel("Correo:");
    label6.setBounds(10,296,150,20);
    label6.setFont(new Font("Verdana", 1, 13));
    label6.setForeground(new Color(0,0,0));
    add(label6);

    textfield3 = new JTextField();
    textfield3.setBounds(145,296,175,25);
    textfield3.setBackground(new Color(245,245,220));
    textfield3.setFont(new Font("Verdana", 0, 12));
    textfield3.setForeground(new Color(0,0,0));
    add(textfield3);

    boton4 = new JButton("Actualizar");
    boton4.setBounds(350,295,170,30);
    boton4.setBackground(new Color(190,162,19));
    boton4.setFont(new Font("Verdana", 1, 13));
    boton4.setForeground(new Color(0,0,0));
    boton4.addActionListener(this);
    add(boton4);

    label7 = new JLabel("Telefono:");
    label7.setBounds(10,346,150,20);
    label7.setFont(new Font("Verdana", 1, 13));
    label7.setForeground(new Color(0,0,0));
    add(label7);

    textfield4 = new JTextField();
    textfield4.setBounds(145,346,175,25);
    textfield4.setBackground(new Color(245,245,220));
    textfield4.setFont(new Font("Verdana", 0, 12));
    textfield4.setForeground(new Color(0,0,0));
    add(textfield4);

    boton5 = new JButton("Actualizar");
    boton5.setBounds(350,345,170,30);
    boton5.setBackground(new Color(190,162,19));
    boton5.setFont(new Font("Verdana", 1, 13));
    boton5.setForeground(new Color(0,0,0));
    boton5.addActionListener(this);
    add(boton5);

    label8 = new JLabel("Direccion:");
    label8.setBounds(10,396,150,20);
    label8.setFont(new Font("Verdana", 1, 13));
    label8.setForeground(new Color(0,0,0));
    add(label8);

    textfield5 = new JTextField();
    textfield5.setBounds(145,396,175,25);
    textfield5.setBackground(new Color(245,245,220));
    textfield5.setFont(new Font("Verdana", 0, 12));
    textfield5.setForeground(new Color(0,0,0));
    add(textfield5);

    boton6 = new JButton("Actualizar");
    boton6.setBounds(350,395,170,30);
    boton6.setBackground(new Color(190,162,19));
    boton6.setFont(new Font("Verdana", 1, 13));
    boton6.setForeground(new Color(0,0,0));
    boton6.addActionListener(this);
    add(boton6);

    labela = new JLabel("ACTIVIDAD-CLIENTE");
    labela.setBounds(10,446,150,20);
    labela.setFont(new Font("Verdana", 1, 13));
    labela.setForeground(new Color(0,0,0));
    add(labela);

    labelb = new JLabel("ID_Actividad:");
    labelb.setBounds(10,481,150,20);
    labelb.setFont(new Font("Verdana", 1, 13));
    labelb.setForeground(new Color(0,0,0));
    add(labelb);

    textfielda = new JTextField();
    textfielda.setBounds(145,481,175,25);
    textfielda.setBackground(new Color(245,245,220));
    textfielda.setFont(new Font("Verdana", 0, 12));
    textfielda.setForeground(new Color(0,0,0));
    add(textfielda);

    botona = new JButton("Actualizar");
    botona.setBounds(350,481,170,30);
    botona.setBackground(new Color(190,162,19));
    botona.setFont(new Font("Verdana", 1, 13));
    botona.setForeground(new Color(0,0,0));
    botona.addActionListener(this);
    add(botona);

    labelc = new JLabel("Horario:");
    labelc.setBounds(10,540,150,20);
    labelc.setFont(new Font("Verdana", 1, 13));
    labelc.setForeground(new Color(0,0,0));
    add(labelc);

    textfieldb = new JTextField();
    textfieldb.setBounds(145,540,175,25);
    textfieldb.setBackground(new Color(245,245,220));
    textfieldb.setFont(new Font("Verdana", 0, 12));
    textfieldb.setForeground(new Color(0,0,0));
    add(textfieldb);

    botonb = new JButton("Actualizar");
    botonb.setBounds(350,540,170,30);
    botonb.setBackground(new Color(190,162,19));
    botonb.setFont(new Font("Verdana", 1, 13));
    botonb.setForeground(new Color(0,0,0));
    botonb.addActionListener(this);
    add(botonb);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){

      Principalp ventanaprincipalp = new Principalp();
      ventanaprincipalp.setBounds(0,0,550,550);
      ventanaprincipalp.setVisible(true);
      ventanaprincipalp.setResizable(false);
      ventanaprincipalp.setLocationRelativeTo(null);
      this.setVisible(false);

    }
  }

   public static void main(String args[]){
     ACClint ventanaACClint = new ACClint();
     ventanaACClint.setBounds(0,0,550,630); // El primero es el ancho y el segundo el alto
     ventanaACClint.setVisible(true);
     ventanaACClint.setResizable(false);
     ventanaACClint.setLocationRelativeTo(null);
 }
}
