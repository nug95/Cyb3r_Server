package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Server;
import model.User;

public class ServerLogin extends JFrame {

	private static final long serialVersionUID=1L;
	private JPanel contentPane;
	private JTextField tf_username;
	private JPasswordField tf_password;
	
	public ServerLogin(Server cyb3r_sv) {
		setTitle(cyb3r_sv.getProgram_title()+" - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf_username = new JTextField();
		tf_username.setBounds(175, 75, 86, 20);
		contentPane.add(tf_username);
		tf_username.setColumns(10);
		
		tf_password = new JPasswordField();
		tf_password.setBounds(175, 103, 86, 20);
		contentPane.add(tf_password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLogin.setBounds(175, 134, 89, 23);
		contentPane.add(btnLogin);
		setResizable(false);
		
		
		
	}
}
