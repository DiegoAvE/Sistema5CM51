import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener{
  private JLabel label1, label2;
  private JTextField textfield1, textfield2;
  private JTextArea textarea1, textarea2;
  private JButton boton1;
  public static String texto = "";
  public static String texto2 = "";


  public Login(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("GYMAN");
    getContentPane().setBackground(new Color(255,222,89)); 
    setIconImage(new ImageIcon(getClass().getResource("images/iconog.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/iconog2.png");  
    label1 = new JLabel(imagen);
    label1.setBounds(165,35,210,210);
    add(label1);

    label2 = new JLabel("Inicio de sesion");
    label2.setBounds(198,270,300,30);
    label2.setFont(new Font("Verdana", 1, 17));
    label2.setForeground(new Color(0,0,0));
    add(label2);
 
    textfield1 = new JTextField();
    textfield1.setBounds(185,330,255,25);
    textfield1.setBackground(new Color(245,245,220));
    textfield1.setFont(new Font("Verdana", 0, 14));
    textfield1.setForeground(new Color(0,0,0));
    add(textfield1);

    textfield2 = new JTextField();
    textfield2.setBounds(185,375,255,25);
    textfield2.setBackground(new Color(245,245,220));
    textfield2.setFont(new Font("Verdana", 0, 14));
    textfield2.setForeground(new Color(0,0,0));
    add(textfield2);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(221,420,100,30);
    boton1.setBackground(new Color(190,162,19));
    boton1.setFont(new Font("Verdana", 1, 13));
    boton1.setForeground(new Color(0,0,0));
    boton1.addActionListener(this);
    add(boton1);

    textarea1 = new JTextArea();
    textarea1.setBounds(100,330,100,25);
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(190,162,19));
    textarea1.setFont(new Font("Verdana", 1, 12));
    textarea1.setForeground(new Color(0,0,0));
    textarea1.setText("USUARIO: ");
    add(textarea1);

    textarea2 = new JTextArea();
    textarea2.setBounds(100,375,100,25);
    textarea2.setEditable(false);
    textarea2.setBackground(new Color(190,162,19));
    textarea2.setFont(new Font("Verdana", 1, 12));
    textarea2.setForeground(new Color(0,0,0));
    textarea2.setText("PASSWORD: ");
    add(textarea2);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      texto = textfield1.getText().trim();
      texto2 = textfield2.getText().trim();
      if(texto.equals("User1") || texto2.equals("User2")){
        Principalp ventanaprincipalp = new Principalp();
        ventanaprincipalp.setBounds(0,0,550,550);
        ventanaprincipalp.setVisible(true);
        ventanaprincipalp.setResizable(false);
        ventanaprincipalp.setLocationRelativeTo(null);
        this.setVisible(false);
      } if(texto.equals("") || texto2.equals("")){
        JOptionPane.showMessageDialog(null, "Debes ingresar tu Usuario y Password");
      } else{
        JOptionPane.showMessageDialog(null, "Usuario o Password incorrectos");
      }
    }
  }

   public static void main(String args[]){
     Login ventanalogin = new Login();
     ventanalogin.setBounds(0,0,550,550); // El primero es el ancho y el segundo el alto
     ventanalogin.setVisible(true);
     ventanalogin.setResizable(false);
     ventanalogin.setLocationRelativeTo(null);
 }
}