package ElectricityBillingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SplashScreen {

	 JFrame splashScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen window = new SplashScreen();
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
	public SplashScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		splashScreen = new JFrame();
		splashScreen.setBounds(100, 100, 671, 623);
		splashScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		splashScreen.getContentPane().setLayout(null);
	}
}
