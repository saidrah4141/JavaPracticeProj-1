package ElectricityBillingSystem;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginPage extends Password {

	private JFrame frame;
	private JTextField usrnm;
	private JTextField pswrd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 660, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon Logo = new ImageIcon(this.getClass().getResource("/electricity logo.jpg"));
		
		
		
		
		JLabel LogoLB = new JLabel("");
		LogoLB.setIcon(Logo);
		LogoLB.setBounds(-42, 0, 382, 329);
		frame.getContentPane().add(LogoLB);
		
		JLabel LB2 = new JLabel("Log In");
		LB2.setFont(new Font("Tahoma", Font.BOLD, 15));
		LB2.setHorizontalAlignment(SwingConstants.CENTER);
		LB2.setBounds(371, 11, 243, 47);
		frame.getContentPane().add(LB2);
		
		usrnm = new JTextField();
		
		usrnm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usrnm.setText("");
			}
		});
		usrnm.setText("Username");
		usrnm.setBounds(418, 69, 131, 20);
		frame.getContentPane().add(usrnm);
		usrnm.setColumns(10);
		
		pswrd = new JTextField();
		pswrd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pswrd.setText("");
			}
		});
		pswrd.setText("Password");
		pswrd.setBounds(418, 104, 131, 20);
		frame.getContentPane().add(pswrd);
		pswrd.setColumns(10);
		
		JLabel loginError = new JLabel("");
		loginError.setFont(new Font("Tahoma", Font.PLAIN, 9));
		loginError.setHorizontalAlignment(SwingConstants.CENTER);
		loginError.setForeground(Color.RED);
		loginError.setBounds(391, 135, 171, 14);
		frame.getContentPane().add(loginError);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(391, 260, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkLogin(pswrd.getText(), usrnm.getText());
			MainPage pi = new MainPage();
			
			if (checkAccess()) {
				pi.splashScreen.setVisible(true);
				frame.dispose();
			} else {
				loginError.setText("Incorecct username/pass");
			}
			}
		});
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(490, 260, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	}
}
