import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class TaskView {

	private JFrame frmIssue;
	private JTable j;

	/**
	 * Launch the application.
	 */
	public static void taskView() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskView window = new TaskView();
					window.frmIssue.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TaskView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIssue = new JFrame();
		frmIssue.setBounds(100, 100, 893, 300);
		frmIssue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmIssue.setJMenuBar(menuBar);
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Cancel");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		JMenuItem mntmCreate = new JMenuItem("Create Issue");
		mntmCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmAdd = new JMenuItem("Add Issue");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmDelete = new JMenuItem("Delete Issue");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmUpdate = new JMenuItem("Edit Issue");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmChart = new JMenuItem("Update");
		mntmChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		JMenuItem mntmSave = new JMenuItem("Help");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});


		mnNewMenu.add(mntmAdd);
		mnNewMenu.add(mntmDelete);
		mnNewMenu.add(mntmUpdate);
		
		
		mnNewMenu.add(mntmChart);
		mnNewMenu.add(mntmSave);
		mnNewMenu.add(mntmNewMenuItem);
		
		  
	        // Frame Title 
	        frmIssue.setTitle("Issue"); 
	  
	        // Data to be displayed in the JTable 
	        String[][] data = { 
	            {  "", "", "", "", "", "", "", ""}, 
	            {  "", "", "", "", "", "", "", "" } 
	        }; 
	  
	        // Column Names 
	        String[] columnNames = { "Name", "Description", "Priority", "Severity","Status", "Data Raised", "Data Assigned",  "Update Date" }; 
	        frmIssue.getContentPane().setLayout(null);
	  
	        // Initializing the JTable 
	        j = new JTable(data, columnNames);
	        j.setAutoCreateRowSorter(true);
	        j.setColumnSelectionAllowed(true);
	        j.setBounds(30, 40, 200, 300); 
	  
	        // adding it to JScrollPane 
	        JScrollPane sp = new JScrollPane(j);
	        sp.setBounds(6, 17, 688, 195);
	        frmIssue.getContentPane().add(sp); 
	        

	        // Frame Size 
	        frmIssue.setSize(700, 295); 
	        // Frame Visible = true 
	        frmIssue.setVisible(true); 
	    	JLabel lblNewLabel_1 = new JLabel("                                                                                                                                                              ");
			menuBar.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("");
			Image img2 = new ImageIcon(this.getClass().getResource("/user1.png")).getImage();
			 lblNewLabel_2.setIcon(new ImageIcon(img2));
			menuBar.add(lblNewLabel_2);
	}
}
