import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teacherpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Teacherpage(ExamBuilder app) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 380, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocation(525, 225);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 460, 380, 40);
		contentPane.add(menuBar_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("| | |");
		mntmNewMenuItem.setBackground(Color.YELLOW);
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
		menuBar_1.add(mntmNewMenuItem);
		mntmNewMenuItem.setPreferredSize(new Dimension(120, 40));
		mntmNewMenuItem.setMinimumSize(new Dimension(120, 40));
		mntmNewMenuItem.setLocation(0, 460);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("O");
		mntmNewMenuItem_1.setBorderPainted(true);
		mntmNewMenuItem_1.setFocusPainted(true);
		mntmNewMenuItem_1.setFocusable(true);
		mntmNewMenuItem_1.setRolloverEnabled(true);
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_1.setHorizontalTextPosition(SwingConstants.CENTER);
		menuBar_1.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.setPreferredSize(new Dimension(120, 40));
		mntmNewMenuItem_1.setMinimumSize(new Dimension(120, 40));
		mntmNewMenuItem_1.setLocation(130, 460);
		mntmNewMenuItem_1.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("CLOSE");
		mntmNewMenuItem_2.setBackground(Color.RED);
		mntmNewMenuItem_2.setRolloverEnabled(true);
		mntmNewMenuItem_2.setFocusPainted(true);
		mntmNewMenuItem_2.setFocusable(true);
		mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_2.setHorizontalTextPosition(SwingConstants.CENTER);
		menuBar_1.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.setPreferredSize(new Dimension(120, 40));
		mntmNewMenuItem_2.setMinimumSize(new Dimension(120, 40));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 380, 50);
		contentPane.add(menuBar);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("");
		mntmNewMenuItem_3.setPreferredSize(new Dimension(42, 50));
		mntmNewMenuItem_3.setMaximumSize(new Dimension(45, 32767));
		menuBar.add(mntmNewMenuItem_3);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setMinimumSize(new Dimension(60, 50));
		lblNewLabel.setMaximumSize(new Dimension(60, 50));
		lblNewLabel.setPreferredSize(new Dimension(50, 50));
		lblNewLabel.setSize(new Dimension(50, 50));
		menuBar.add(lblNewLabel);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		menuBar.add(mntmNewMenuItem_4);

		JButton btnNewButton = new JButton("Classes");
		btnNewButton.setBounds(10, 60, 360, 110);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 180, 360, 110);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 300, 175, 150);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBounds(195, 300, 175, 150);
		contentPane.add(btnNewButton_2_1);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 380, 500);

	}
}
