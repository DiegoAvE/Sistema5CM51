import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CEmpl extends JFrame implements ActionListener{
  private JLabel label1, label2;
  private JButton boton1, boton2;
  private JTextField textfield1, textfield2;
  private JTextArea textarea1;

  public CEmpl(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Consulta - Empleado");
    getContentPane().setBackground(new Color(255,222,89)); 
    setIconImage(new ImageIcon(getClass().getResource("images/iconog.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/iconog3.png");  
    label1 = new JLabel(imagen);
    label1.setBounds(10,10,116,116);
    add(label1);

    ImageIcon imagen2 = new ImageIcon("images/imgCE.png");  
    label2 = new JLabel(imagen2);
    label2.setBounds(135,42,350,52);
    add(label2);

    ImageIcon imagen3 = new ImageIcon("images/casa.png");
    boton1 = new JButton(imagen3);
    boton1.setBounds(490,10,43,37);
    boton1.addActionListener(this);
    add(boton1);

    textfield1 = new JTextField();
    textfield1.setEditable(false);
    textfield1.setText("  ID_Empleado:");
    textfield1.setBounds(45,170,120,25);
    textfield1.setBackground(new Color(190,162,19));
    textfield1.setFont(new Font("Verdana", 1, 13));
    textfield1.setForeground(new Color(0,0,0));
    add(textfield1);

    textfield2 = new JTextField();
    textfield2.setBounds(182,170,175,25);
    textfield2.setBackground(new Color(245,245,220));
    textfield2.setFont(new Font("Verdana", 0, 12));
    textfield2.setForeground(new Color(0,0,0));
    add(textfield2);

    boton2 = new JButton("Buscar");
    boton2.setBounds(375,170,100,25);
    boton2.setBackground(new Color(190,162,19));
    boton2.setFont(new Font("Verdana", 1, 13));
    boton2.setForeground(new Color(0,0,0));
    boton2.addActionListener(this);
    add(boton2);

    textarea1 = new JTextArea();
    textarea1.setBounds(182,170,175,75);
    textarea1.setBackground(new Color(190,162,19));
    textarea1.setEditable(false);
    add(textarea1);
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
     CEmpl ventanaCEmpl = new CEmpl();
     ventanaCEmpl.setBounds(0,0,550,550); // El primero es el ancho y el segundo el alto
     ventanaCEmpl.setVisible(true);
     ventanaCEmpl.setResizable(false);
     ventanaCEmpl.setLocationRelativeTo(null);
 }
}
