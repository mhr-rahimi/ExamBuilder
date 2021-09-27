import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Studentlogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user_name;
	private JTextField password;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private Color color = new Color(240, 240, 240);
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Create the frame
	 */
	public Studentlogin(ExamBuilder app) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		setUndecorated(true);
		setLocation(520, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

////////////////////////////////////////////////////////////////////////
		/* Define Label to show page title */

		JLabel lblNewLabel = new JLabel("STUDENT");
		lblNewLabel.setFont(new Font("Elephant", Font.PLAIN, ۱۸));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(131, 34, 171, 48);
		contentPane.add(lblNewLabel);

////////////////////////////////////////////////////////////////////////
		/* Define textfield to get user name */

		user_name = new JTextField();

		user_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (user_name.getText().equals("  User Name")) {
					user_name.setForeground(Color.black);
					user_name.setText("");
					password.setForeground(Color.GRAY);
				} else {
					user_name.setForeground(Color.black);
					password.setForeground(Color.GRAY);
				}
				if (password.getText().equals("")) {
					password.setText("  Password");
				}
			}
		});
		user_name.setBounds(70, 107, 303, 40);
		user_name.setForeground(Color.GRAY);
		user_name.setBorder(null);
		user_name.setText("  User Name");
		contentPane.add(user_name);
		user_name.setColumns(10);

////////////////////////////////////////////////////////////////////////
		/* Define textfield to get password */

		password = new JTextField();

		password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (password.getText().equals("  Password")) {
					password.setForeground(Color.black);
					password.setText("");
					user_name.setForeground(Color.GRAY);
				} else {
					password.setForeground(Color.black);
					user_name.setForeground(Color.GRAY);
				}
				if (user_name.getText().equals("")) {
					user_name.setText("  User Name");
				}

			}
		});
		password.setBounds(70, 162, 303, 40);
		password.setBorder(null);
		password.setForeground(Color.GRAY);
		password.setText("  Password");
		contentPane.add(password);
		password.setColumns(10);

////////////////////////////////////////////////////////////////////////
		/* Define Exit Button */

		JButton btnNewButton = new JButton("X");
		btnNewButton.setFocusable(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, ۲۱));
		btnNewButton.setBounds(400, 0, 50, 30);
		contentPane.add(btnNewButton);

////////////////////////////////////////////////////////////////////////
		/* Define Exit Button */

		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, ۱۵));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				app.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(18, 295, 75, 30);
		contentPane.add(btnNewButton_1);

////////////////////////////////////////////////////////////////////////
		/* Define Login Button */

		btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, ۱۸));
		btnNewButton_2.setBounds(70, 217, 303, 42);
		contentPane.add(btnNewButton_2);

////////////////////////////////////////////////////////////////////////
		/* Define Settings Button */

		btnNewButton_3 = new JButton("");
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(color);
		btnNewButton_3.setBackground(color);
		btnNewButton_3.setIcon(new ImageIcon("setting.png"));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBounds(387, 286, 40, 35);
		contentPane.add(btnNewButton_3);

////////////////////////////////////////////////////////////////////////
		/* Define label to show error */

		lblNewLabel_1 = new JLabel("Error");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setBounds(93, 270, 280, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("studentlogin-icon.png"));
		lblNewLabel_2.setBounds(0, 0, 450, 350);
		contentPane.add(lblNewLabel_2);
	}
}
