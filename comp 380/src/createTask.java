import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class createTask extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField;
	private JLabel label_5;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createTask frame = new createTask();
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
	public createTask() {
		setTitle("Task - New Item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNe = new JLabel("");
		lblNe.setBounds(68, 230, 150, 153);
		//Image img11 = new ImageIcon(this.getClass().getResource("/pp.png")).getImage();
		//lblNe.setIcon(new ImageIcon(img11));
		getContentPane().add(lblNe);
		
		
		JLabel lblUniqueId = new JLabel("Unique ID");
		lblUniqueId.setBounds(37, 23, 92, 16);
		contentPane.add(lblUniqueId);
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 51, 365, 26);
		getContentPane().add(textField_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(37, 56, 92, 16);
		getContentPane().add(lblName);
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(37, 84, 92, 16);
		getContentPane().add(lblDescription);
		
		JLabel lblDueDate = new JLabel("Expected");
		lblDueDate.setBounds(37, 181, 133, 16);
		getContentPane().add(lblDueDate);
		
		JScrollPane scrollPane_2 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(128, 82, 365, 55);
		getContentPane().add(scrollPane_2);
		
		
		JLabel lblRequirements = new JLabel("Resource Assigned");
		lblRequirements.setBounds(37, 149, 150, 16);
		getContentPane().add(lblRequirements);
		
		JLabel lblTask = new JLabel("Associated");
		lblTask.setBounds(264, 365, 80, 16);
		getContentPane().add(lblTask);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(201, 240, 33, 33);
		Image img1 = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 246, 123, 20);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(128, 567, 117, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(290, 567, 117, 29);
		getContentPane().add(btnCancel);
		
		JLabel lblActualStartDate = new JLabel("Actual");
		lblActualStartDate.setBounds(290, 181, 133, 16);
		getContentPane().add(lblActualStartDate);
		
		JLabel lblExpectedEndDate = new JLabel("Start");
		lblExpectedEndDate.setBounds(37, 209, 48, 16);
		getContentPane().add(lblExpectedEndDate);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(168, 146, 176, 24);
		getContentPane().add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 209, 123, 26);
		getContentPane().add(textField_3);
		
		JLabel label = new JLabel("");
		label.setBounds(201, 209, 33, 33);
		Image img2 = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
		label.setIcon(new ImageIcon(img2));
		getContentPane().add(label);
		
		JLabel lblEnd = new JLabel("End");
		lblEnd.setBounds(37, 248, 33, 16);
		getContentPane().add(lblEnd);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(338, 209, 123, 26);
		getContentPane().add(textField_4);
		
		JLabel label_1 = new JLabel("Start");
		label_1.setBounds(290, 209, 48, 16);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("End");
		label_2.setBounds(290, 248, 33, 16);
		getContentPane().add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(338, 240, 123, 26);
		getContentPane().add(textField_5);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(460, 202, 33, 33);
		Image img5 = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
		label_3.setIcon(new ImageIcon(img5));
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(460, 240, 33, 33);
		Image img3 = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
		label_4.setIcon(new ImageIcon(img3));
		getContentPane().add(label_4);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(37, 278, 60, 16);
		getContentPane().add(lblDuration);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(102, 274, 101, 20);
		getContentPane().add(textField_6);
		
		JLabel lblEffort = new JLabel("Duration");
		lblEffort.setBounds(290, 276, 60, 16);
		getContentPane().add(lblEffort);
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(362, 276, 101, 20);
		getContentPane().add(textField_7);
		
		JLabel lblEffort1 = new JLabel("Effort");
		lblEffort1.setBounds(37, 310, 60, 16);
		getContentPane().add(lblEffort1);
		
		JLabel label_6 = new JLabel("Effort");
		label_6.setBounds(290, 310, 60, 16);
		getContentPane().add(label_6);
		JLabel lblComplete = new JLabel("% Complete");
		lblComplete.setBounds(362, 149, 80, 16);
		getContentPane().add(lblComplete);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(441, 145, 60, 27);
		getContentPane().add(comboBox_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(102, 305, 101, 20);
		getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(362, 305, 101, 20);
		getContentPane().add(textField_9);
		
		JLabel lblEffortCompleted = new JLabel("Effort Completed");
		lblEffortCompleted.setBounds(24, 365, 117, 16);
		getContentPane().add(lblEffortCompleted);
		
	
		
		JLabel lblSummaryTask = new JLabel("Summary Task");
		lblSummaryTask.setBounds(37, 401, 117, 16);
		getContentPane().add(lblSummaryTask);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(141, 383, 45, 50);
		getContentPane().add(checkBox);
		
		JLabel lblMilestone = new JLabel("Milestone");
		lblMilestone.setBounds(37, 429, 117, 16);
		getContentPane().add(lblMilestone);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox_1.isSelected()){
				lblRequirements.setText("Completion Date");
				lblEffort.setText("Effort");
				lblDuration.setText("Effort");
				lblEffort1.setVisible(false);
				label_6.setVisible(false);
				JLabel label0 = new JLabel("");
				label0.setBounds(201, 209, 20, 20);
				Image img2 = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
				label0.setIcon(new ImageIcon(img2));
				getContentPane().add(label0);
				comboBox.setVisible(false);
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(155, 149, 101, 20);
				getContentPane().add(textField_7);
				label_5 = new JLabel("");
				label_5.setBounds(255, 145, 33, 33);
				label_5.setIcon(new ImageIcon(img5));
				getContentPane().add(label_5);
				textField_9.setVisible(false);
				textField_8.setVisible(false);
				}
				else{
					lblRequirements.setText("Resource Assigned");
					lblEffort.setText("Duration");
					lblDuration.setText("Duration");
					lblEffort1.setVisible(true);
					label_6.setVisible(true);
					label_5.setVisible(false);
		
					comboBox.setVisible(true);
					
				
					
					
					textField_7.setVisible(false);
					
					textField_9.setVisible(true);
					textField_8.setVisible(true);
				}
				
			}
		});
		checkBox_1.setBounds(142, 413, 45, 50);
		getContentPane().add(checkBox_1);
		
		JLabel label_61 = new JLabel("Issue");
		label_61.setBounds(264, 383, 68, 16);
		getContentPane().add(label_61);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnAdd.setBounds(401, 507, 80, 29);
		getContentPane().add(btnAdd);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(136, 363, 107, 20);
		getContentPane().add(textField);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(128, 18, 365, 26);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_1 = new JLabel("Unique ID");
		lblNewLabel_1.setBounds(340, 340, 82, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(441, 340, 82, 16);
		contentPane.add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBounds(342, 365, 99, 130);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(443, 365, 99, 130);
		contentPane.add(list_1);
		
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
		JMenuItem mntmUpdate = new JMenuItem("Create New Task");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmSave = new JMenuItem("Save Task");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});

		mnNewMenu.add(mntmUpdate);
		mnNewMenu.add(mntmSave);
		mnNewMenu.add(mntmNewMenuItem);
		JLabel lblNewLabel_11 = new JLabel("                                                                                                                              ");
		menuBar.add(lblNewLabel_11);
		
		JLabel lblNewLabel_21 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/user1.png")).getImage();
		 lblNewLabel_21.setIcon(new ImageIcon(img));
		menuBar.add(lblNewLabel_21);
		
	}

}
