package mx.utng.sesion24.dp.factory;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.SUCCESSFUL;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame {

    private JTextField txtUser;
    private JPasswordField txtPassword;
  
    public Cliente() {
  
      super("Login");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300, 150);
  
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3, 2));
  
      JLabel lblUser = new JLabel("Usuario: ");
      JLabel lblPassword = new JLabel("Contraseña: ");
  
      txtUser = new JTextField();
      txtPassword = new JPasswordField();
  
      JButton btnLogin = new JButton("Iniciar Sesión");
      btnLogin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        
          char[] password = txtPassword.getPassword();
        
          if (validarLogin(txtUser.getText(), new String(password))) {
            JOptionPane.showMessageDialog(Cliente.this, "Inicio de Sesión Correcto");
          } else {
            JOptionPane.showMessageDialog(Cliente.this, "Datos Incorrectos");
          }
        }
      });
  
      panel.add(lblUser);
      panel.add(txtUser);
      panel.add(lblPassword);
      panel.add(txtPassword);
      panel.add(btnLogin);
  
      add(panel);
      setVisible(true);
      setLocationRelativeTo(null);
    }
  
    public static void main(String[] args) {
      new Cliente();
    }
  
    private boolean validarLogin(String usuario, String password) {
      return usuario.equals("manco") && password.equals("1234");
    }
  }