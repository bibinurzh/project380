import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class createIssue extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JList textList;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createIssue frame = new createIssue();
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
	public createIssue() {
		setTitle("Issues - Edit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblUniqueId = new JLabel("Unique ID");
		lblUniqueId.setBounds(111, 23, 92, 16);
		contentPane.add(lblUniqueId);
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(201, 177, 150, 153);
	
		/*Image img = new ImageIcon(this.getClass().getResource("/pp.png")).getImage();
		lbl.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lbl);*/
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(196, 51, 385, 26);
		getContentPane().add(textField_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(111, 56, 101, 16);
		getContentPane().add(lblName);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(111, 84, 101, 16);
		getContentPane().add(lblDescription);
		
		JLabel lblDueDate = new JLabel("Priority");
		lblDueDate.setBounds(111, 149, 57, 16);
		getContentPane().add(lblDueDate);
		
		JScrollPane scrollPane_2 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(198, 82, 378, 55);
		getContentPane().add(scrollPane_2);
		
		
		JLabel lblRequirements = new JLabel("Associated");
		lblRequirements.setBounds(22, 387, 92, 26);
		getContentPane().add(lblRequirements);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(304, 168, 33, 33);
		Image img1 = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(190, 588, 117, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		btnCancel.setBounds(406, 588, 117, 29);
		getContentPane().add(btnCancel);
		
		JLabel lblRequirements_1 = new JLabel("Action Items");
		lblRequirements_1.setBounds(22, 404, 92, 26);
		getContentPane().add(lblRequirements_1);
		
		JLabel lblTasks = new JLabel("Decisioins");
		lblTasks.setBounds(350, 409, 79, 16);
		getContentPane().add(lblTasks);
		//Image img = new ImageIcon(this.getClass().getResource("/pp.png")).getImage();
		
		JLabel lblAssociated = new JLabel("Associated ");
		lblAssociated.setBounds(350, 392, 79, 16);
		getContentPane().add(lblAssociated);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(205, 531, 66, 26);
		getContentPane().add(btnAdd);
		
		JButton button = new JButton("Add");
		button.setBounds(507, 534, 66, 26);
		getContentPane().add(button);
		String s1[] = { "High", "Medium", "Low" }; 
		String s2[] = { "Critical", "High", "Medium", "Low", "Minor" }; 
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setBounds(193, 145, 145, 26);
		getContentPane().add(comboBox);
		
		JLabel lblSeverity = new JLabel("Severity");
		lblSeverity.setBounds(350, 149, 70, 16);
		getContentPane().add(lblSeverity);
		
		JComboBox comboBox_1 = new JComboBox(s2);
		comboBox_1.setBounds(439, 145, 145, 26);
		getContentPane().add(comboBox_1);
		
		JLabel lblDataRaised = new JLabel("Date Raised");
		lblDataRaised.setBounds(111, 177, 79, 16);
		getContentPane().add(lblDataRaised);
		
		JLabel lblDateAssigned = new JLabel("Date Assigned");
		lblDateAssigned.setBounds(346, 175, 92, 16);
		getContentPane().add(lblDateAssigned);
		
		JLabel lblExpectedCompletionDate = new JLabel("Expected");
		lblExpectedCompletionDate.setBounds(111, 210, 117, 16);
		getContentPane().add(lblExpectedCompletionDate);
		
		JLabel lblActualCompletionDate = new JLabel("Actual");
		lblActualCompletionDate.setBounds(350, 210, 92, 16);
		getContentPane().add(lblActualCompletionDate);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(111, 275, 57, 16);
		getContentPane().add(lblStatus);
		
		JLabel lblStatusDescription = new JLabel("Status");
		lblStatusDescription.setBounds(111, 310, 79, 16);
		getContentPane().add(lblStatusDescription);
		
		JLabel lblUpdateDate = new JLabel("Update Date");
		lblUpdateDate.setBounds(350, 275, 85, 16);
		getContentPane().add(lblUpdateDate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(196, 172, 111, 26);
		getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(441, 170, 109, 26);
		getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(548, 168, 33, 33);
		label_2.setIcon(new ImageIcon(img1));
		getContentPane().add(label_2);
		
		JLabel lblCompletionDate = new JLabel("Completion");
		lblCompletionDate.setBounds(111, 228, 111, 16);
		getContentPane().add(lblCompletionDate);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(111, 247, 111, 16);
		getContentPane().add(lblDate);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 205, 111, 58);
		getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(304, 217, 33, 33);
		label_3.setIcon(new ImageIcon(img1));
		getContentPane().add(label_3);
		
		JLabel lblCompletionDate_1 = new JLabel("Completion");
		lblCompletionDate_1.setBounds(350, 228, 92, 16);
		getContentPane().add(lblCompletionDate_1);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setBounds(350, 247, 92, 16);
		getContentPane().add(lblDate_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(441, 205, 111, 58);
		getContentPane().add(textField_4);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(548, 268, 33, 33);
		label_4.setIcon(new ImageIcon(img1));
		getContentPane().add(label_4);
		
		String[] s3 = {"Open", "Closed", "In Progress", "Hold", "Complete"};
		JComboBox comboBox_2 = new JComboBox(s3);
		comboBox_2.setBounds(192, 271, 145, 26);
		getContentPane().add(comboBox_2);
		
		JLabel lblDescription_1 = new JLabel("Description");
		lblDescription_1.setBounds(111, 330, 79, 16);
		getContentPane().add(lblDescription_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(196, 308, 380, 41);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(441, 270, 109, 26);
		getContentPane().add(textField_6);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(558, 234, 33, 33);
		label_5.setIcon(new ImageIcon(img1));
		getContentPane().add(label_5);
		
		JLabel lblNewLabel_1 = new JLabel("Unique ID");
		lblNewLabel_1.setBounds(111, 373, 82, 16);
		contentPane.add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBounds(111, 392, 101, 123);
		contentPane.add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(215, 373, 82, 16);
		contentPane.add(lblNewLabel_2);
		
		JList list_1 = new JList();
		list_1.setBounds(215, 392, 101, 123);
		contentPane.add(list_1);
		
		JLabel label = new JLabel("Unique ID");
		label.setBounds(441, 373, 82, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setBounds(548, 373, 82, 16);
		contentPane.add(label_1);
		
		JList list_2 = new JList();
		list_2.setBounds(441, 392, 101, 123);
		contentPane.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(545, 392, 101, 123);
		contentPane.add(list_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(196, 18, 385, 26);
		contentPane.add(textField_7);
		

		

		
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

		JMenuItem mntmUpdate = new JMenuItem("Create New Deliverable");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmSave = new JMenuItem("Save Deliverable");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});



		mnNewMenu.add(mntmUpdate);
		mnNewMenu.add(mntmSave);
		mnNewMenu.add(mntmNewMenuItem);
		JLabel lblNewLabel_11 = new JLabel("                                                                                                                                                     ");
		menuBar.add(lblNewLabel_11);
		
		JLabel lblNewLabel_21 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/user1.png")).getImage();
		 lblNewLabel_21.setIcon(new ImageIcon(img2));
		menuBar.add(lblNewLabel_21);
		
	}

}
