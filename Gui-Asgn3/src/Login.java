import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JLabel Label;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JLabel lblNewLabel;


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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Label = new JLabel("");
		//Image img = new ImageIcon(this.getClass().getResource("/c1.jpg")).getImage();
		//Label.setIcon(new ImageIcon(img));
		//Label.setBounds(0, 0, 1370, 573);
		//frame.getContentPane().add(Label);
		
		JLabel userText = new JLabel("Username");
		userText.setFont(new Font("Tahoma", Font.BOLD, 14));
		userText.setBounds(457, 250, 84, 17);
		frame.getContentPane().add(userText);
		
		textField = new JTextField();
		textField.setBounds(599, 250, 157, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel pwdText = new JLabel("Password");
		pwdText.setFont(new Font("Tahoma", Font.BOLD, 14));
		pwdText.setBounds(457, 307, 84, 17);
		frame.getContentPane().add(pwdText);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(599, 307, 157, 20);
		frame.getContentPane().add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener (new ActionListener () {
			
			public void actionPerformed (ActionEvent e) {
				
				String userText = textField.getText();
				String pwdText = passwordField.getText();
				
				if(userText.equals("cruise") && pwdText.equals("cruise"))
				{		
						JOptionPane.showMessageDialog(frame, "You're logined successfully");
						//create object
						
						CRUISEGUI secondPage = new CRUISEGUI();
						secondPage.setVisible(true);
				}
				else
				{
				JOptionPane.showMessageDialog(frame, "Invalid Password");
				}								
			}
			
		});
		btnLogin.setBounds(550, 377, 137, 23);
		frame.getContentPane().add(btnLogin);
		
		lblNewLabel = new JLabel("Welcome to Cruise System");
		lblNewLabel.setFont(new Font("STXingkai", Font.BOLD, 99));
		lblNewLabel.setBounds(225, 64, 986, 94);
		frame.getContentPane().add(lblNewLabel);
	}
}
