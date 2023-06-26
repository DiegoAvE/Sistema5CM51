import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class AAct extends JFrame implements ActionListener {
  private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
  private JButton boton1, boton2;
  private JTextField textfield1, textfield2, textfield3, textfield4, textfield5;

  public AAct() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Altas - Actividad");
    getContentPane().setBackground(new Color(255,222,89)); 
    setIconImage(new ImageIcon(getClass().getResource("images/iconog.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/iconog3.png");  
    label1 = new JLabel(imagen);
    label1.setBounds(10,10,116,116);
    add(label1);

    ImageIcon imagen2 = new ImageIcon("images/imgAA.png");  
    label2 = new JLabel(imagen2);
    label2.setBounds(145,42,307,52);
    add(label2);

    ImageIcon imagen3 = new ImageIcon("images/casa.png");
    boton1 = new JButton(imagen3);
    boton1.setBounds(490,10,43,37);
    boton1.addActionListener(this);
    add(boton1);

    label3 = new JLabel("DATOS DE ACTIVIDAD");
    label3.setBounds(10,146,200,20);
    label3.setFont(new Font("Verdana", 1, 13));
    label3.setForeground(new Color(0,0,0));
    add(label3);

    label4 = new JLabel("ID_Actividad:");
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

    label6 = new JLabel("Instructor:");
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

    label7 = new JLabel("Horario:");
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

    label8 = new JLabel("Area:");
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

    ImageIcon imagen4 = new ImageIcon("images/img5.png");  
    label9 = new JLabel(imagen4);
    label9.setBounds(350,220,158,113);
    add(label9);

    boton2 = new JButton("Registrar actividad");
    boton2.setBounds(340,345,185,30);
    boton2.setBackground(new Color(190,162,19));
    boton2.setFont(new Font("Verdana", 1, 13));
    boton2.setForeground(new Color(0,0,0));
    boton2.addActionListener(this);
    add(boton2);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1) {
      Principalp ventanaprincipalp = new Principalp();
      ventanaprincipalp.setBounds(0,0,550,550);
      ventanaprincipalp.setVisible(true);
      ventanaprincipalp.setResizable(false);
      ventanaprincipalp.setLocationRelativeTo(null);
      this.setVisible(false);
    } else if (e.getSource() == boton2) {
      String idActividad = textfield1.getText();
      String nombre = textfield2.getText();
      String instructor = textfield3.getText();
      String horario = textfield4.getText();
      String area = textfield5.getText();

      // Guardar los datos en un archivo de texto
      try {
        File archivo = new File("datos.txt");
        FileWriter escritor = new FileWriter(archivo, true);
        BufferedWriter bufferedWriter = new BufferedWriter(escritor);

        bufferedWriter.write("ID_Actividad: " + idActividad);
        bufferedWriter.newLine();
        bufferedWriter.write("Nombre: " + nombre);
        bufferedWriter.newLine();
        bufferedWriter.write("Instructor: " + instructor);
        bufferedWriter.newLine();
        bufferedWriter.write("Horario: " + horario);
        bufferedWriter.newLine();
        bufferedWriter.write("Area: " + area);
        bufferedWriter.newLine();
        bufferedWriter.newLine();

        bufferedWriter.close();

        JOptionPane.showMessageDialog(this, "Los datos se han guardado correctamente.");
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  public static void main(String args[]) {
    AAct ventanaAAct = new AAct();
    ventanaAAct.setBounds(0,0,550,550);
    ventanaAAct.setVisible(true);
    ventanaAAct.setResizable(false);
    ventanaAAct.setLocationRelativeTo(null);
  }
}

