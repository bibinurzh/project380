import java.sql.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection=null;
	public Login() {
		initialize();
		connection=sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 377, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("User ID");
		lblUsername.setBounds(81, 93, 82, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(81, 121, 61, 16);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(155, 88, 142, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(154, 116, 143, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnLoginIn = new JButton("Login");
		btnLoginIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="select * from UserInfo where username=? and password =? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()) {
						count=count+1;
					}
					if (count == 1)
					{
						JOptionPane.showMessageDialog(null, "Hello!");
						frame.dispose();
						LoginPage ill=new LoginPage();
						ill.setVisible(true);
				
					}
					else if (count>1);
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and password");
					}
				
					{
						JOptionPane.showMessageDialog(null, "Wrong Username and password. Try again");	
					}
					rs.close();
					pst.close();
				}catch(Exception e)
				{		JOptionPane.showMessageDialog(null, e);
				}
		
			}
		});
		btnLoginIn.setBounds(131, 158, 117, 29);
		frame.getContentPane().add(btnLoginIn);
		
		JButton btnRegistrate = new JButton("Cancel");
		btnRegistrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnRegistrate.setBounds(131, 188, 117, 29);
		frame.getContentPane().add(btnRegistrate);
	}


}
