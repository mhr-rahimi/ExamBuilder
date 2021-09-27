import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Developmentlogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user_name;
	private JTextField password;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Create the frame.
	 */

	public Developmentlogin(ExamBuilder app) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocation(520, 220);
///////////////////////////////////////////////////////////////////////////////		

		JButton btnNewButton = new JButton("X");
		btnNewButton.setFocusable(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setFont(new Font("Transylvania", Font.PLAIN, ۲۰));
		btnNewButton.setBounds(395, 0, 55, 30);
		contentPane.add(btnNewButton);
//////////////////////////////////////////////////////////////////////////////

		btnNewButton_2 = new JButton("O");
		btnNewButton_2.setFont(new Font("Transylvania", Font.PLAIN, ۲۰));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(340, 0, 55, 30);
		contentPane.add(btnNewButton_2);

///////////////////////////////////////////////////////////////////////////////

		btnNewButton_3 = new JButton("_");
		btnNewButton_3.setFont(new Font("Transylvania", Font.PLAIN, ۲۰));
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setBounds(285, 0, 55, 30);
		contentPane.add(btnNewButton_3);

///////////////////////////////////////////////////////////////////////////////////

		user_name = new JTextField();
		user_name.setFont(new Font("Tahoma", Font.PLAIN, ۱۳));
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

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		user_name.setBounds(80, 150, 290, 40);
		user_name.setForeground(Color.GRAY);
		user_name.setBorder(null);
		user_name.setText("  User Name");
		contentPane.add(user_name);
		user_name.setColumns(10);

///////////////////////////////////////////////////////////////////////////		

		password = new JTextField();
		password.setFont(new Font("Tahoma", Font.PLAIN, ۱۳));
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

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		password.setBounds(80, 205, 290, 40);
		password.setForeground(Color.GRAY);
		password.setBorder(null);
		password.setText("  Password");
		contentPane.add(password);
		password.setColumns(10);
//////////////////////////////////////////////////////////////////////

		btnNewButton_1 = new JButton("L O G I N");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (user_name.getText().equals("mohammad-hossein-rahimi")
						|| user_name.getText().equals("arhia-janat-makan")
								&& password.getText().equals("foh84ry[-+548lkCB8h@#%$")) {
					setVisible(false);
					app.database.setVisible(true);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Transylvania", Font.PLAIN, ۲۴));
		btnNewButton_1.setBounds(80, 265, 290, 40);
		contentPane.add(btnNewButton_1);

////////////////////////////////////////////////////////////////////////
		/* Define Exit Button */

		btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, ۱۵));
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				app.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setBackground(Color.GRAY);
		btnNewButton_1_1.setBounds(18, 330, 75, 30);
		contentPane.add(btnNewButton_1_1);

////////////////////////////////////////////////////////////////////////

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("development-icon.png"));
		lblNewLabel.setBounds(149, 36, 145, 90);
		contentPane.add(lblNewLabel);

	}
}
