import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

public class delDisplay extends JFrame {

	private JPanel contentPane;
	private JList list;
	private JTextField textFieldSearch;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delDisplay frame = new delDisplay();
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
	Connection connection = null;
	private JTable table;
	
	public void refreshTable ()
	{
		try {
		String query="Select UniqueID, Name, Description from Deliverable";
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		pst.close();
		rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public void loadList()
	{
		try {
			String query="select UniqueID, Name, Description from Deliverable";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));

		}
		 catch (Exception e) {
		
			 e.printStackTrace();
		 }
	}

	public delDisplay() {
		connection = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 313);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createDeliverable cr= new createDeliverable();
				cr.setVisible(true);

				
			}
		});
		btnCreate.setBounds(19, 228, 117, 29);
		contentPane.add(btnCreate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int action=JOptionPane.showConfirmDialog(null, "Do You Really Want To Delete","Delete", JOptionPane.YES_NO_OPTION);
				if (action==0) {
				try{
					int row = table.getSelectedRow();
					String ID_=(table.getModel().getValueAt(row, 0)).toString();
					String name=(table.getModel().getValueAt(row, 1)).toString();
					String description=(table.getModel().getValueAt(row, 2)).toString();
					String query="delete from Deliverable where Name='"+name+ " ' ";
					PreparedStatement pst=connection.prepareStatement(query);
				
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				refreshTable();
			}
			}
		});
		btnDelete.setBounds(249, 228, 117, 29);
		contentPane.add(btnDelete);
		
		JButton btnSort = new JButton("Update");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshTable();
			}
			
		});
		btnSort.setBounds(378, 228, 117, 29);
		contentPane.add(btnSort);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createDeliverable edit = new createDeliverable();
				TableModel model=table.getModel();
				int index = table.getSelectedRow();
				String ID=model.getValueAt(index, 0).toString();
				String name=model.getValueAt(index, 1).toString();
				String description=model.getValueAt(index, 2).toString();
				edit.setVisible(true);
				edit.pack();
				edit.getTextFieldName().setText(name);
				edit.getTextFieldID().setText(ID);
				edit.getTextFieldDescription().setText(description);
			}
		});

		btnEdit.setBounds(136, 228, 117, 29);
		contentPane.add(btnEdit);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row = table.getSelectedRow();
					String ID_=(table.getModel().getValueAt(row, 0)).toString();
					String query="select * from Deliverable where UniqueID=' "+ID_+" ' ";
					PreparedStatement pst=connection.prepareStatement(query);
		            

					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		table.setBounds(19, 38, 481, 179);
		contentPane.add(table);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmFilter = new JMenuItem("Filter");
		menuBar.add(mntmFilter);
		
		textFieldSearch = new JTextField();
		menuBar.add(textFieldSearch);
		textFieldSearch.setToolTipText("search");
		textFieldSearch.setColumns(10);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cancel");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		
		loadList();
		refreshTable();
	}
}
