import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTable j;
	private JTable table;
	private JTable table2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setTitle("Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 String[][] data = { 
		            {"Project Lead", "Thomas", }, 
		            {   "Start Date" ,"Dec. 11, 2011" } ,
		            {"Due Date", "Mar. 23, 2012"}
		        }; 
		  
		        // Column Names 
		        String[] columnNames = { "",""}; 
		        
		        JScrollPane scrollPane_1 = new JScrollPane();
	              scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
	              scrollPane_1.setBounds(154, 104, 256, 57);
	              contentPane.add(scrollPane_1);
		    j = new JTable(data, columnNames);
	        scrollPane_1.setViewportView(j);
	        j.setColumnSelectionAllowed(true);
		    JMenuBar menuBar = new JMenuBar();
	        menuBar.setBounds(0, 0, 1075, 22);
			JMenu mnNewProject = new JMenu("Project");
			menuBar.add(mnNewProject);
			
			JMenu mnNew = new JMenu("New");
			mnNewProject.add(mnNew);
			
			JMenuItem mntmProject = new JMenuItem("Project");
			mnNew.add(mntmProject);
			
			JMenuItem mntmDeliverable_1 = new JMenuItem("Deliverable");
			mnNew.add(mntmDeliverable_1);
			
			JMenuItem mntmTask_1 = new JMenuItem("Task");
			mnNew.add(mntmTask_1);
			
			JMenuItem mntmResource_1 = new JMenuItem("Resource");
			mnNew.add(mntmResource_1);
			
			JMenuItem mntmIssue_1 = new JMenuItem("Issue");
			mnNew.add(mntmIssue_1);
			
		

			
			JMenuItem mntmDeliverable = new JMenuItem("Deliverable");
			mntmDeliverable.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delDisplay del = new delDisplay();
					del.setVisible(true);
				}
			});
			menuBar.add(mntmDeliverable);
			
			JMenuItem mntmTask = new JMenuItem("Task");
			mntmTask.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TaskView theory=new TaskView();
					theory.taskView() ;
				}
			});
			menuBar.add(mntmTask);

			

			
			JMenuItem mntmResource = new JMenuItem("Resource");
			menuBar.add(mntmResource);
			
			JMenuItem mntmRisk = new JMenuItem("Risk");
			menuBar.add(mntmRisk);
			
			JMenuItem mntmIssue = new JMenuItem("Issue");
			menuBar.add(mntmIssue);
			
			JMenuItem mntmActionItem = new JMenuItem("Action Item");
			menuBar.add(mntmActionItem);
			
			JMenuItem mntmDecision = new JMenuItem("Decision");
			menuBar.add(mntmDecision);
			
			JMenuItem mntmRequirement = new JMenuItem("Requirement");
			menuBar.add(mntmRequirement);
			JMenu mnNewRep = new JMenu("Reports");
			menuBar.add(mnNewRep);
			 JMenu mnNewHelp = new JMenu("Help System");
			 mnNewHelp.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		System.exit(JFrame.EXIT_ON_CLOSE);
			 	}
			 });



				menuBar.add(mnNewHelp);
				
			JMenuItem mntmStat = new JMenuItem("Status Report");
		    mnNewRep.add(mntmStat); 
		    JMenuItem mntmRR = new JMenuItem("Risk Report");
		    mnNewRep.add(mntmRR);
		    JMenuItem mntmBER = new JMenuItem("Board Executive Report");
		    mnNewRep.add(mntmBER);
		    JMenuItem mntmRe = new JMenuItem("Resource Report");
		    mnNewRep.add(mntmRe);
	        
	        JMenuItem mntmAdd = new JMenuItem("New Project");
	        //mnNewProject.add(mntmAdd);
			mntmAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		
				}
			});
	        getContentPane().setLayout(null);
	       contentPane.setLayout(null);
			
			
	       getContentPane().add(menuBar);
	        
	        JLabel lblNewLabel_1 = new JLabel("");
	        Image img2 = new ImageIcon(this.getClass().getResource("/user1.png")).getImage();
	        Image img3 = new ImageIcon(this.getClass().getResource("/se.png")).getImage();
	        JMenuItem mntmExit = new JMenuItem("Exit");
	        mntmExit.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		System.exit(JFrame.EXIT_ON_CLOSE);
	        	}
	        });
	        menuBar.add(mntmExit);
	        lblNewLabel_1.setIcon(new ImageIcon(img2));
	        menuBar.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel = new JLabel("");
            lblNewLabel.setBounds(383, 34, 27, 29);
            lblNewLabel.setIcon(new ImageIcon(img3));
            contentPane.add(lblNewLabel);
	        
	        JTextArea txtrInProgressOverdue = new JTextArea();
	        txtrInProgressOverdue.setBackground(Color.LIGHT_GRAY);
	        txtrInProgressOverdue.setLineWrap(true);
	        txtrInProgressOverdue.setForeground(Color.RED);
	        txtrInProgressOverdue.setEditable(false);
	        txtrInProgressOverdue.setText(" \n     In Progress\n");
	        txtrInProgressOverdue.setBounds(45, 104, 109, 57);
	        getContentPane().add(txtrInProgressOverdue);
	        
	        JTextArea txtrCustomSolutionDevelopment = new JTextArea();
	        txtrCustomSolutionDevelopment.setBackground(new Color(204, 255, 255));
	        txtrCustomSolutionDevelopment.setText("                    Custom Solution Development");
	        txtrCustomSolutionDevelopment.setBounds(45, 88, 365, 16);
	        getContentPane().add(txtrCustomSolutionDevelopment);
	        
	        JTextArea txtrInsuranceProductLaunch = new JTextArea();
	        txtrInsuranceProductLaunch.setText("                    Insurance Product Launch");
	        txtrInsuranceProductLaunch.setBackground(new Color(204, 255, 255));
	        txtrInsuranceProductLaunch.setBounds(448, 88, 344, 16);
	        getContentPane().add(txtrInsuranceProductLaunch);
	        
	        JTextArea txtrFinished = new JTextArea();
	        txtrFinished.setText(" \n     Finished\n");
	        txtrFinished.setLineWrap(true);
	        txtrFinished.setForeground(Color.BLACK);
	        txtrFinished.setEditable(false);
	        txtrFinished.setBackground(Color.LIGHT_GRAY);
	        txtrFinished.setBounds(448, 104, 111, 57);
	        getContentPane().add(txtrFinished);
	        
	
	        
	      
	        String[][] data2 = { 
		            {"Project Lead", "Thomas", }, 
		            {   "Start Date" ,"Nov. 11, 2013" } ,
		            {"Due Date", "Mar. 23, 2016"}
		        }; 
		        // Column Names 
		        String[] columnNames2 = { "",""}; 
		        getContentPane().setLayout(null);
		  
		        // adding it to JScrollPane 
		        JScrollPane sp2 = new JScrollPane();
		        sp2.setBounds(558, 104, 234, 57);
		        sp2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		        getContentPane().add(sp2); 
		        
		              // Initializing the JTable 
		              table = new JTable(data, columnNames);
		              sp2.setViewportView(table);
		              table.setColumnSelectionAllowed(true);
		              
		              JButton btnAddNewProject = new JButton("Add New Project");
		              btnAddNewProject.setBounds(922, 36, 147, 24);
		              getContentPane().add(btnAddNewProject);
		              
		              JTextArea textArea = new JTextArea();
		              textArea.setText(" \n     In Progress\n");
		              textArea.setLineWrap(true);
		              textArea.setForeground(Color.RED);
		              textArea.setEditable(false);
		              textArea.setBackground(Color.LIGHT_GRAY);
		              textArea.setBounds(45, 216, 109, 57);
		              getContentPane().add(textArea);
		              
		              JTextArea textArea_1 = new JTextArea();
		              textArea_1.setText("                    Custom Solution Development");
		              textArea_1.setBackground(new Color(204, 255, 255));
		              textArea_1.setBounds(45, 197, 365, 16);
		              getContentPane().add(textArea_1);
		              String[][] data23 = { 
		  		            {"Project Lead", "Bob", }, 
		  		            {   "Start Date" ,"Jul. 11, 2014" } ,
		  		            {"Due Date", "Mar. 23, 2018"}
		  		        }; 
		  		  
		  		        // Column Names 

		  		  
		  		        // Column Names 
		  		      String[] columnNames23 = { "",""}; 
		  		      getContentPane().setLayout(null);
		              JScrollPane scrollPane = new JScrollPane();
		              scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		              scrollPane.setBounds(154, 216, 256, 57);
		              getContentPane().add(scrollPane);
		              table2 = new JTable(data23, columnNames23);
		              scrollPane.setViewportView(table2);
		              table2.setColumnSelectionAllowed(true);
		              
		              JButton btnNewButton = new JButton("Open");
		              btnNewButton.setBounds(39, 158, 135, 29);
		              getContentPane().add(btnNewButton);
		              
		              JButton btnEdit = new JButton("Edit");
		              btnEdit.setBounds(164, 158, 135, 29);
		              getContentPane().add(btnEdit);
		              
		              JButton btnDelete = new JButton("Delete");
		              btnDelete.addActionListener(new ActionListener() {
		              	public void actionPerformed(ActionEvent e) {
		              		JOptionPane.showMessageDialog(null, "You are not allowed to edit or delete project. Ask for Permission","User Permission", JOptionPane.ERROR_MESSAGE);
		              	}
		              });
		              btnDelete.setBounds(289, 158, 128, 29);
		              getContentPane().add(btnDelete);
		              
		              JButton button = new JButton("Open");
		              button.setBounds(39, 272, 135, 29);
		              getContentPane().add(button);
		              
		              JButton button_1 = new JButton("Edit");
		              button_1.setBounds(164, 272, 135, 29);
		              getContentPane().add(button_1);
		              
		              JButton button_2 = new JButton("Delete");
		              button_2.setBounds(289, 272, 128, 29);
		              getContentPane().add(button_2);
		              
		              JButton button_3 = new JButton("Delete");
		              button_3.setBounds(671, 158, 128, 29);
		              getContentPane().add(button_3);
		              
		              JButton button_4 = new JButton("Edit");
		              button_4.setBounds(558, 158, 126, 29);
		              getContentPane().add(button_4);
		              
		              JButton button_5 = new JButton("Open");
		              button_5.setBounds(441, 158, 128, 29);
		              getContentPane().add(button_5);
		              
		              textField_1 = new JTextField();
		              textField_1.setToolTipText("Search");
		              textField_1.setBounds(45, 34, 365, 26);
		              contentPane.add(textField_1);
		              textField_1.setColumns(10);
		              
		       
		              

		              
		
	}
}
