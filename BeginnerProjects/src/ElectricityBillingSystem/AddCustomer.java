package ElectricityBillingSystem;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class AddCustomer {

	private JFrame frame;
	private JTextField name;
	private JTextField met;
	private JTextField adrs;
	private JTextField prov;
	private JTextField city;
	private JTextField mail;
	private JTextField phn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer window = new AddCustomer();
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
	public AddCustomer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon Logo = new ImageIcon(this.getClass().getResource("/stick.png"));
		
		
		JLabel stick = new JLabel("New label");
		stick.setBounds(-94, 0, 258, 455);
		frame.getContentPane().add(stick);
		stick.setIcon(Logo);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(203, 28, 118, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMeterNo = new JLabel("Meter No.");
		lblMeterNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMeterNo.setBounds(203, 78, 118, 37);
		frame.getContentPane().add(lblMeterNo);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(203, 126, 118, 37);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblProvince = new JLabel("Province");
		lblProvince.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProvince.setBounds(203, 174, 118, 37);
		frame.getContentPane().add(lblProvince);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCity.setBounds(203, 220, 118, 37);
		frame.getContentPane().add(lblCity);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(203, 268, 118, 37);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(203, 316, 118, 37);
		frame.getContentPane().add(lblPhoneNumber);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 13));
		name.setBounds(365, 30, 187, 37);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		met = new JTextField();
		met.setFont(new Font("Tahoma", Font.PLAIN, 13));
		met.setColumns(10);
		met.setBounds(365, 78, 187, 37);
		frame.getContentPane().add(met);
		
		adrs = new JTextField();
		adrs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		adrs.setColumns(10);
		adrs.setBounds(365, 126, 187, 37);
		frame.getContentPane().add(adrs);
		
		prov = new JTextField();
		prov.setFont(new Font("Tahoma", Font.PLAIN, 13));
		prov.setColumns(10);
		prov.setBounds(365, 174, 187, 37);
		frame.getContentPane().add(prov);
		
		city = new JTextField();
		city.setFont(new Font("Tahoma", Font.PLAIN, 13));
		city.setColumns(10);
		city.setBounds(365, 222, 187, 37);
		frame.getContentPane().add(city);
		
		mail = new JTextField();
		mail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mail.setColumns(10);
		mail.setBounds(365, 268, 187, 37);
		frame.getContentPane().add(mail);
		
		phn = new JTextField();
		phn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		phn.setColumns(10);
		phn.setBounds(365, 316, 187, 37);
		frame.getContentPane().add(phn);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url ="jdbc:mysql://localhost:3306/customerdetails";
				String user = "root";
				String pass = "Chair@2460";
				Connection conn =null;
				Statement stmt = null;
				
				try {
					
				//Creating a connection to the database
				 conn = DriverManager.getConnection(url,user,pass);
				 
				 stmt = conn.createStatement();
				 
				 String sql = "INSERT INTO customerinfo (client_name, client_email, client_phn, client_address, client_metno, client_city, client_prov)\r\n"
				 		+ "VALUES"+ "(" + "'" + name.getText() + "'" + "," + "'" + mail.getText() + "'" + "," + "'" 
						 + phn.getText() + "'" + "," + "'" + adrs.getText() + "'" + "," + "'" + met.getText() + "'" + ","+ 
				 		"'" + city.getText() + "'" + "," + "'" + prov.getText() + "'" + ");";
				 		
						 

				 int rowsAffected = stmt.executeUpdate(sql);
					
				} catch (Exception ex) {
					ex.printStackTrace();
				
				}		finally {
					if(stmt!=null) {
						try {
							stmt.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (conn!=null) {
						try {
							conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(203, 383, 131, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(365, 383, 131, 49);
		frame.getContentPane().add(btnCancel);
		
		
	}
}
