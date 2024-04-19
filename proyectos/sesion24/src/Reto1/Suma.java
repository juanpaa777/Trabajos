package Reto1;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Suma extends JFrame {

  private JTextField num1;
  private JTextField num2;

  public Suma() {

    super("Sumador");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 150);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 2));

    JLabel lblNum1 = new JLabel("Número 1:");
    JLabel lblNum2 = new JLabel("Número 2:");

    num1 = new JTextField();
    num2 = new JTextField();

    JButton btnSumar = new JButton("Sumar");
    btnSumar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        
        int suma = n1 + n2;
        
        JOptionPane.showMessageDialog(Suma.this, "La suma es: " + suma);
      }
    });

    panel.add(lblNum1);
    panel.add(num1);
    panel.add(lblNum2); 
    panel.add(num2);
    panel.add(btnSumar);

    add(panel);
    setVisible(true);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    new Suma(); 
  }

}
