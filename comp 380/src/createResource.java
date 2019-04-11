import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class createResource extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JList textList;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createResource frame = new createResource();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public createResource() {
		setTitle("Resource - New Item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lbl = new JLabel("");
		lbl.setBounds(201, 177, 150, 153);
		contentPane.setLayout(null);
	
		JLabel label = new JLabel("Unique ID");
		label.setBounds(39, 23, 82, 16);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 51, 355, 26);
		getContentPane().add(textField_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(106, 18, 355, 26);
		contentPane.add(textField_7);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(39, 56, 55, 16);
		getContentPane().add(lblName);
		
		JLabel lblDescription = new JLabel("Title");
		lblDescription.setBounds(39, 84, 45, 16);
		getContentPane().add(lblDescription);
		
		
		JLabel lblRequirements = new JLabel("Skills");
		lblRequirements.setBounds(39, 109, 55, 26);
		getContentPane().add(lblRequirements);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(428, 105, 33, 33);
		Image img1 = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(92, 323, 117, 38);
		getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnCancel.setBounds(287, 323, 117, 38);
		getContentPane().add(btnCancel);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(106, 112, 117, 132);
		getContentPane().add(scrollPane_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(106, 79, 355, 26);
		getContentPane().add(textField);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setBounds(235, 109, 77, 26);
		getContentPane().add(lblAvailability);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(308, 109, 123, 26);
		getContentPane().add(textField_2);
		
		JLabel lblPayRate = new JLabel("Pay Rate");
		lblPayRate.setBounds(39, 256, 92, 26);
		getContentPane().add(lblPayRate);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(106, 256,  117, 26);
		spinner.setEditor(new JSpinner.NumberEditor(spinner, "$"));
		getContentPane().add(spinner);
		
		

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cancel");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});

		JMenuItem mntmUpdate = new JMenuItem("Create New Resources");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmSave = new JMenuItem("Save Resources");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});

		mnNewMenu.add(mntmUpdate);
		mnNewMenu.add(mntmSave);
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblNewLabel_1 = new JLabel("                                                                                                           ");
		menuBar.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/user1.png")).getImage();
		 lblNewLabel_2.setIcon(new ImageIcon(img2));
		menuBar.add(lblNewLabel_2);
		
	}

}
