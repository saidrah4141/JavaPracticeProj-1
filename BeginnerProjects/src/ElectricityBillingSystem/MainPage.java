package ElectricityBillingSystem;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class MainPage {

	 JFrame splashScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.splashScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		splashScreen = new JFrame();
		splashScreen.setBounds(100, 100, 666, 468);
		splashScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		splashScreen.getContentPane().setLayout(null);
		
		ImageIcon HQ = new ImageIcon(this.getClass().getResource("/headquarters.png"));
		
		JLabel lblSplashScreen = new JLabel("7. Splash Screen");
		lblSplashScreen.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSplashScreen.setBounds(398, 354, 246, 33);
		splashScreen.getContentPane().add(lblSplashScreen);
		
		JLabel lblPayBill = new JLabel("6. Pay Bill");
		lblPayBill.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPayBill.setBounds(398, 300, 246, 33);
		splashScreen.getContentPane().add(lblPayBill);
		
		JLabel lblGenerateBill = new JLabel("5. Generate Bill");
		lblGenerateBill.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGenerateBill.setBounds(398, 246, 246, 33);
		splashScreen.getContentPane().add(lblGenerateBill);
		
		JLabel lblDatabase = new JLabel("4. Database Conectivity");
		lblDatabase.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDatabase.setBounds(398, 185, 246, 33);
		splashScreen.getContentPane().add(lblDatabase);
		
		JLabel lblLoginSecurity = new JLabel("3. Login Security");
		lblLoginSecurity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLoginSecurity.setBounds(398, 127, 246, 33);
		splashScreen.getContentPane().add(lblLoginSecurity);
		
		JLabel lblCustomerDetails = new JLabel("2. Customer Details");
		lblCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerDetails.setBounds(398, 65, 246, 33);
		splashScreen.getContentPane().add(lblCustomerDetails);
		
		JLabel lblNewLabel = new JLabel("1. Add Customer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(398, 11, 246, 33);
		splashScreen.getContentPane().add(lblNewLabel);
		
		JLabel background = new JLabel("");
		background.setBounds(-99, 0, 753, 422);
		splashScreen.getContentPane().add(background);
		background.setIcon(HQ);
		
		
		
	}
}
