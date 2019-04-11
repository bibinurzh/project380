import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class RiskReport {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiskReport window = new RiskReport();
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
	public RiskReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Risk Report");
		frame.setBounds(100, 100, 460, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 459, 173);
		Image img = new ImageIcon(this.getClass().getResource("/risk.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		
	JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JLabel lblNewLabel_1 = new JLabel("File");
		menuBar.add(lblNewLabel_1);
		
		JMenu mnNewMenu = new JMenu("");
		menuBar.add(mnNewMenu);
	}
}
