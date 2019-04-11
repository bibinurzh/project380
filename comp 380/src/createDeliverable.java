import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class createDeliverable extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldName;
	private JList list;
	private JTextField textFieldDueDate;
	private JTextField textFieldDescription;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createDeliverable frame = new createDeliverable();
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
	Connection connection=null;
	private JTextField textFieldID;
	public createDeliverable() {
		setTitle("Deliverable - New Item");
		connection = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 500, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JLabel lbl = new JLabel("");
		lbl.setBounds(201, 177, 150, 153);
		contentPane.setLayout(null);
		
		setTextFieldName(new JTextField());
		getTextFieldName().setBounds(180, 51, 216, 26);
		getTextFieldName().setColumns(10);
		getContentPane().add(getTextFieldName());
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(76, 56, 92, 16);
		getContentPane().add(lblName);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(76, 84, 92, 16);
		getContentPane().add(lblDescription);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setBounds(76, 154, 92, 16);
		getContentPane().add(lblDueDate);
		
		
		JLabel lblRequirements = new JLabel("Associated");
		lblRequirements.setBounds(76, 222, 92, 26);
		getContentPane().add(lblRequirements);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(363, 149, 33, 33);
		Image img = new ImageIcon(this.getClass().getResource("/calen.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		getContentPane().add(lblNewLabel);
		
		textFieldDueDate = new JTextField();
		textFieldDueDate.setBounds(180, 149, 187, 33);
		textFieldDueDate.setColumns(10);
		getContentPane().add(textFieldDueDate);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(95, 569, 117, 29);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into Deliverable (UniqueId,Name,Description) values (?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,getTextFieldID().getText() );
					pst.setString(2,getTextFieldName().getText() );
					pst.setString(3,getTextFieldDescription().getText() );
					//pst.setString(4, textFieldDueDate.getText() );
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Saved");
					pst.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnCancel.setBounds(294, 569, 117, 29);
		getContentPane().add(btnCancel);
		
		JLabel lblRequirements_1 = new JLabel("Requirements");
		lblRequirements_1.setBounds(76, 240, 92, 26);
		getContentPane().add(lblRequirements_1);
		
		JLabel lblTasks = new JLabel("Tasks");
		lblTasks.setBounds(76, 410, 55, 16);
		getContentPane().add(lblTasks);

		
		JLabel lblAssociated = new JLabel("Associated ");
		lblAssociated.setBounds(76, 392, 79, 16);
		getContentPane().add(lblAssociated);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(401, 264, 66, 26);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="select * from Task";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					DefaultListModel DLM = new DefaultListModel();
					while (rs.next()) {
						DLM.addElement(rs.getString ("UniqueID"));
						
					}
					list.setModel(DLM);
					pst.close();
					rs.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	
			}
		});
		
		getContentPane().add(btnAdd);
		
		JButton button = new JButton("Add");
		button.setBounds(401, 434, 66, 26);
		getContentPane().add(button);
		
		JLabel lblUniqueId = new JLabel("Unique ID");
		lblUniqueId.setBounds(76, 24, 92, 16);
		contentPane.add(lblUniqueId);
		
		setTextFieldID(new JTextField());
		getTextFieldID().setColumns(10);
		getTextFieldID().setBounds(180, 19, 216, 26);
		contentPane.add(getTextFieldID());
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(180, 79, 216, 58);
		contentPane.add(scrollPane);
		
		setTextFieldDescription(new JTextField());
		scrollPane.setViewportView(getTextFieldDescription());
		getTextFieldDescription().setColumns(10);
		
		list = new JList();
		list.setBounds(180, 227, 107, 132);
		contentPane.add(list);
		
		JLabel label_2 = new JLabel("Unique ID");
		label_2.setBounds(180, 205, 101, 16);
		contentPane.add(label_2);
		
		JList list_1 = new JList();
		list_1.setBounds(289, 227, 107, 132);
		contentPane.add(list_1);
		
		JLabel label_3 = new JLabel("Name");
		label_3.setBounds(294, 205, 82, 16);
		contentPane.add(label_3);
		
		JList list_2 = new JList();
		list_2.setBounds(180, 410, 107, 132);
		contentPane.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(289, 410, 107, 132);
		contentPane.add(list_3);
		
		JLabel label = new JLabel("Unique ID");
		label.setBounds(180, 390, 101, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setBounds(294, 392, 82, 16);
		contentPane.add(label_1);
		
	

		
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
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into Deliverable (UniqueId,Name,Description) values (?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,getTextFieldID().getText() );
					pst.setString(2,getTextFieldName().getText() );
					pst.setString(3,getTextFieldDescription().getText() );
					
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Saved");
					pst.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	
			}
		});
		
		JLabel lblNewLabel_123 = new JLabel("                                                                                                           ");
		menuBar.add(lblNewLabel_123);
		JLabel lblNewLabel_21 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/user1.png")).getImage();
		 lblNewLabel_21.setIcon(new ImageIcon(img2));
		menuBar.add(lblNewLabel_21);


		mnNewMenu.add(mntmUpdate);
		mnNewMenu.add(mntmSave);
		mnNewMenu.add(mntmNewMenuItem);
		

	}
	public JTextField getTextFieldName() {
		return textFieldName;
	}
	public void setTextFieldName(JTextField textFieldName) {
		this.textFieldName = textFieldName;
	}
	public JTextField getTextFieldID() {
		return textFieldID;
	}
	public void setTextFieldID(JTextField textFieldID) {
		this.textFieldID = textFieldID;
		textFieldID.setEditable(false);
	}
	public JTextField getTextFieldDescription() {
		return textFieldDescription;
	}
	public void setTextFieldDescription(JTextField textFieldDescription) {
		this.textFieldDescription = textFieldDescription;
	}
}
