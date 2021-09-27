import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Desktop;
import java.awt.Dimension;

public class ExamBuilder {

	JFrame frame;
	private Color btncolor2 = new Color(196, 3, 255);
	Teacherpage tp = new Teacherpage(this);
	private Teacherlogin tl = new Teacherlogin(this);
	private Studentlogin sl = new Studentlogin(this);
	private Studentpage sp = new Studentpage(this);
	private Developmentlogin dv = new Developmentlogin(this);
	Development database = new Development(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamBuilder window = new ExamBuilder();
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
	public ExamBuilder() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setSize(500, 350);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocation(500, 200);
		Image icon = Toolkit.getDefaultToolkit().getImage("App-icon.png");
		frame.setIconImage(icon);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("maker.png"));
		lblNewLabel_1.setBounds(197, 39, 75, 75);
		frame.getContentPane().add(lblNewLabel_1);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setMinimumSize(new Dimension(0, 0));
		menuBar.setMaximumSize(new Dimension(0, 0));
		menuBar.setPreferredSize(new Dimension(0, 0));
		menuBar.setOpaque(false);
		menuBar.setFocusable(false);
		menuBar.setBounds(423, 265, 40, 35);
		frame.getContentPane().add(menuBar);

		JMenu mnNewMenu_1 = new JMenu("");
		mnNewMenu_1.setBorderPainted(true);
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_1.setHorizontalTextPosition(SwingConstants.CENTER);
		mnNewMenu_1.setFocusable(false);
		mnNewMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hi");
			}
		});
		mnNewMenu_1.setBounds(65, 11, 40, 35);
		mnNewMenu_1.setIcon(new ImageIcon("setting.png"));
		menuBar.add(mnNewMenu_1);

		JMenuItem Development = new JMenuItem("Development");
		Development.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frame.setVisible(false);
				dv.setVisible(true);
			}
		});
		mnNewMenu_1.add(Development);

		JMenuItem setting = new JMenuItem("Setting");
		mnNewMenu_1.add(setting);

		JMenuItem feedback = new JMenuItem("Feedback");
		mnNewMenu_1.add(feedback);

		JMenuItem help = new JMenuItem("Help");
		help.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI("http://wa.me/989038770524"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		mnNewMenu_1.add(help);

		JButton btnNewButton = new JButton("Sign in as Teacher");
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Elephant", Font.PLAIN, ۱۶));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				tl.setVisible(true);
			}
		});
		btnNewButton.setBounds(100, 160, 270, 45);
		btnNewButton.setBackground(btncolor2);
		btnNewButton.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Sign in as Student");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frame.setVisible(false);
				sl.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Elephant", Font.PLAIN, ۱۶));
		btnNewButton_1.setBounds(100, 223, 270, 45);
		btnNewButton_1.setBackground(new Color(204, 0, 102));
		btnNewButton_1.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Login-background.png"));
		lblNewLabel.setBounds(0, 0, 484, 311);
		frame.getContentPane().add(lblNewLabel);

	}
}
