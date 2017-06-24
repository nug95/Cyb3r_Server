package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Server;

public class ServerClose extends JFrame {

	private static final long serialVersionUID=1L;
	private JPanel contentPane;
	
	public ServerClose(Server cyb3r_sv) {
		setTitle(cyb3r_sv.getProgram_title()+" - Close");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setResizable(false);
		
		
		
	}
}
