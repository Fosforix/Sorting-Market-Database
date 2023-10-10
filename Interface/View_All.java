import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_All extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable beneficiar;
	private JTable det_factura;
	JTable currentlyDisplayedTable;
	private JTable factura;
	private JTable produse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_All frame = new View_All();
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
	public View_All() {
		setTitle("View All");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox.getSelectedItem();
				
				
				currentlyDisplayedTable.setVisible(false);
				if (selectedOption.equals("beneficiar")) {
					
				  
                  beneficiar.setVisible(true);
                  currentlyDisplayedTable = beneficiar;
                  
                   
                   
                }
				if (selectedOption.equals("det_factura")) {
	            det_factura.setVisible(true);
	            currentlyDisplayedTable = det_factura;
			} 
				
				
				if (selectedOption.equals("factura")) {
		            factura.setVisible(true);
		            currentlyDisplayedTable = factura;
				} 
				
				
				if (selectedOption.equals("produse")) {
		            produse.setVisible(true);
		            currentlyDisplayedTable = produse;
				} 
		}});
		
		comboBox.setFocusable(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"beneficiar", "det_factura", "factura", "produse"}));
		comboBox.setBounds(46, 45, 203, 38);
		contentPane.add(comboBox);
		
		JButton Show = new JButton("Show");
		Show.setFocusPainted(false);
		Show.setBounds(568, 47, 109, 35);
		contentPane.add(Show);
		
		beneficiar = new JTable();
		beneficiar.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"New column"
			}
		));
		beneficiar.setBounds(46, 146, 631, 284);
		contentPane.add(beneficiar);
		currentlyDisplayedTable = beneficiar;
		
		det_factura = new JTable();
		det_factura.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		det_factura.setBounds(46, 146, 631, 285);
		contentPane.add(det_factura);
		
		factura = new JTable();
		factura.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		factura.setBounds(46, 147, 631, 284);
		contentPane.add(factura);
		
		produse = new JTable();
		produse.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		produse.setBounds(46, 147, 631, 284);
		contentPane.add(produse);
		
		
	}
}
