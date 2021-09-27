import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Development extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JSeparator separator;
	private JButton btnNewButton_1;
	private JSeparator separator_1;
	private JButton btnNewButton_2;
	private JLabel lblPassword_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblName_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_5;
	private Label label_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_6;
	private JButton btnNewButton_3;
	private Label label_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

	/**
	 * Create the frame.
	 */
	public Development(ExamBuilder app) {
		setFocusable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 439);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setFocusable(false);
		table.setBounds(291, 40, 290, 128);
		contentPane.add(table);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(291, 180, 290, 36);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFocusable(false);
		lblNewLabel.setBounds(35, 78, 50, 20);
		contentPane.add(lblNewLabel);

		JLabel lblName = new JLabel("Name");
		lblName.setFocusable(false);
		lblName.setBounds(35, 114, 50, 20);
		contentPane.add(lblName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFocusable(false);
		lblPassword.setBounds(35, 151, 50, 20);
		contentPane.add(lblPassword);

		textField = new JTextField();
		textField.setFocusable(false);
		textField.setBounds(95, 78, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFocusable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(95, 114, 100, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFocusable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(95, 151, 100, 20);
		contentPane.add(textField_2);

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(257, 11, 24, 417);
		contentPane.add(separator);

		btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(35, 186, 160, 25);
		contentPane.add(btnNewButton_1);

		separator_1 = new JSeparator();
		separator_1.setBounds(10, 234, 615, 9);
		contentPane.add(separator_1);

		btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBounds(359, 400, 196, 28);
		contentPane.add(btnNewButton_2);

		lblPassword_1 = new JLabel("Password");
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, ۱۳));
		lblPassword_1.setFocusable(false);
		lblPassword_1.setBounds(359, 369, 69, 20);
		contentPane.add(lblPassword_1);

		textField_3 = new JTextField();
		textField_3.setFocusable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(431, 368, 124, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setFocusable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(431, 337, 124, 20);
		contentPane.add(textField_4);

		lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.PLAIN, ۱۳));
		lblName_1.setFocusable(false);
		lblName_1.setBounds(359, 338, 69, 20);
		contentPane.add(lblName_1);

		lblNewLabel_1 = new JLabel("Search ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, ۱۳));
		lblNewLabel_1.setFocusable(false);
		lblNewLabel_1.setBounds(359, 283, 69, 20);
		contentPane.add(lblNewLabel_1);

		textField_5 = new JTextField();
		textField_5.setFocusable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(431, 282, 124, 20);
		contentPane.add(textField_5);

		Label label = new Label("Insert Teacher");
		label.setFocusable(false);
		label.setFont(new Font("Today", Font.BOLD, ۱۷));
		label.setAlignment(Label.CENTER);
		label.setBounds(49, 40, 137, 32);
		contentPane.add(label);

		label_1 = new Label("UPDATE");
		label_1.setFocusable(false);
		label_1.setFont(new Font("Today", Font.BOLD, ۱۷));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(394, 244, 137, 32);
		contentPane.add(label_1);

		lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, ۱۳));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(35, 319, 42, 27);
		contentPane.add(lblNewLabel_2);

		textField_6 = new JTextField();
		textField_6.setBounds(80, 319, 140, 27);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBounds(45, 385, 185, 35);
		contentPane.add(btnNewButton_3);

		label_2 = new Label("DELETE");
		label_2.setFont(new Font("Today", Font.BOLD, ۱۷));
		label_2.setFocusable(false);
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(59, 250, 137, 32);
		contentPane.add(label_2);

		btnNewButton_4 = new JButton("X");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Transylvania", Font.PLAIN, ۲۰));
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setBackground(new Color(204, 0, 0));
		btnNewButton_4.setBounds(586, 0, 55, 30);
		contentPane.add(btnNewButton_4);

		btnNewButton_5 = new JButton("O");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnNewButton_5.setFont(new Font("Transylvania", Font.PLAIN, ۲۰));
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setBounds(531, 0, 55, 30);
		contentPane.add(btnNewButton_5);

		btnNewButton_6 = new JButton("_");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		btnNewButton_6.setFont(new Font("Transylvania", Font.PLAIN, ۲۰));
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setBounds(476, 0, 55, 30);
		contentPane.add(btnNewButton_6);
		setLocation(520, 220);
	}
}
