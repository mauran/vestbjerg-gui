package GUILag;
import CTRLag.*;
import ModelLag.*;

import java.awt.Container;
//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Menu;
















//import javax.lang.model.element.Name;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ListDataEvent;
import javax.swing.text.html.ListView;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;

import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class MenuGUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PersonCTRL customer = new PersonCTRL();
	
	
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> list = new JList<>(listModel);
	
	

	private JLabel lblError = new JLabel();
	

	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JPanel pnlCreateCustomer = new JPanel();
	private JPanel pnlFindCustomer = new JPanel();
	private JPanel pnlCreateOrdre = new JPanel();
	
	private JTextField txtCustomerNo;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtZip;
	private JTextField txtCity;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtCustomer;
	private JTable tblProduct;
	private JTable tblOrder;
	private JTextField txtFindProduct;
//	private JLabel lblError; // = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGUI frame = new MenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void Create(){
		
		     String name =  txtName.getText();
		     String  address = txtAddress.getText();
		     String zip = txtZip.getText();
		     String city = txtCity.getText();
		     String phone = txtPhone.getText();
		     String email = txtEmail.getText();
		     String cusNo = txtCustomerNo.getText();
		
		   // PersonCTRL customer = new PersonCTRL();
	        customer.createCustomer(name, address, zip, city, phone, email, cusNo);
	        
	        ClearFields();
	       
		
	}
	
	private void findCustomer(){
		String cus = txtCustomer.getText();
		Customer c = customer.findCustomer(cus);
		
		if(c != null){
			
		}
	}
	
	//private List<Customer> findAllCustomers(){
	//	return customer.findAllCustomers();
	//}
	
	
	private void Find(){
		
		
		if(txtCustomerNo != null){
			
			String cusNo = txtCustomerNo.getText();
			
			Customer c = customer.findCustomer(cusNo);
			
			if(c != null){
     			txtName.setText(c.getName());
			    txtAddress.setText(c.getAddress());
		        txtZip.setText(c.getZip());
		        txtCity.setText(c.getCity());
		        txtPhone.setText(c.getPhone());
		        txtEmail.setText(c.getEmail());
     		}else{
	     		lblError.setText("Kunde findes ikke");
			
     		}
		}
		
		else if(txtPhone != null){
			
			String phone = txtPhone.getText();
	     	
	     	Customer ph = customer.findCustomer(phone);
			
	     	if(ph != null){
     			txtCustomerNo.setText(ph.getCustomerNumber());
     			txtName.setText(ph.getName());
			    txtAddress.setText(ph.getAddress());
		        txtZip.setText(ph.getZip());
		        txtCity.setText(ph.getCity());
		        txtEmail.setText(ph.getEmail());
     		}else{
	     		lblError.setText("Kunde findes ikke");
	     	}
	     	
		}	
	}
	
	private void ClearFields(){

		    txtName.setText(null);
	        txtAddress.setText(null);
	        txtZip.setText(null);
	        txtCity.setText(null);
	        txtPhone.setText(null);
	        txtEmail.setText(null);
	        txtCustomerNo.setText(null);
     }
	 
	private void Menu(){
		 JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			JMenu mnKunde = new JMenu("Kunde");
			menuBar.add(mnKunde);
			
			JMenuItem mntmOpretKunde = new JMenuItem("Opret Kunde");
			mntmOpretKunde.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panel.setVisible(false);
					pnlCreateCustomer.setVisible(true);
					pnlFindCustomer.setVisible(false);
				}
			});
			mnKunde.add(mntmOpretKunde);
			
			JMenuItem mntmFindKunde = new JMenuItem("Find Kunde");
			mntmFindKunde.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel.setVisible(false);
					pnlCreateCustomer.setVisible(false);
					pnlFindCustomer.setVisible(true);
				    fillList();
				}
			});
			mnKunde.add(mntmFindKunde);
			
			JMenu mnOrder = new JMenu("Order");
			menuBar.add(mnOrder);
			
			JMenuItem mntmOpretOrder = new JMenuItem("Opret Order");
			mntmOpretOrder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel.setVisible(false);
					pnlCreateCustomer.setVisible(false);
					pnlFindCustomer.setVisible(false);
					pnlCreateOrdre.setVisible(true);
				}
			});
			mnOrder.add(mntmOpretOrder);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new CardLayout(0, 0));
	 }
	
	private void fillList(){
		pnlFindCustomer.remove(list);
		list.removeAll();
		listModel = new DefaultListModel<>();
		

		List<Customer> blah = customer.findAllCustomers();
		
		
			for(Customer cus : blah){
	        	String name = cus.getName();
	        	listModel.addElement(name);
	        }
		 
		list = new JList<String>(listModel);
		list.setBounds(74, 154, 173, 213);
		pnlFindCustomer.add(list);
	}

	
	

	/**
	 * Create the frame.
	 */
	public MenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 537);
		
		Menu();
		
		
		panel = new JPanel();
		contentPane.add(panel, "name_127255472499055");
		panel.setLayout(null);
		
		
		//Create Customer Panel starts {
	
		
	    pnlCreateCustomer = new JPanel();
		contentPane.add(pnlCreateCustomer, "name_127258014224397");
		pnlCreateCustomer.setLayout(null);
		
		JLabel lblLblcustomerno = new JLabel("Kunde Nummer");
		lblLblcustomerno.setBounds(35, 27, 86, 14);
		pnlCreateCustomer.add(lblLblcustomerno);
		
		txtCustomerNo = new JTextField();
		txtCustomerNo.setBounds(131, 24, 86, 20);
		pnlCreateCustomer.add(txtCustomerNo);
		txtCustomerNo.setColumns(10);
		
		JLabel lblLblname = new JLabel("Navn");
		lblLblname.setBounds(35, 52, 86, 14);
		pnlCreateCustomer.add(lblLblname);
		
		txtName = new JTextField();
		txtName.setBounds(131, 49, 86, 20);
		pnlCreateCustomer.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblLbladdress = new JLabel("Addresse");
		lblLbladdress.setBounds(35, 77, 86, 14);
		pnlCreateCustomer.add(lblLbladdress);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(131, 74, 86, 20);
		pnlCreateCustomer.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblLblzip = new JLabel("Zip");
		lblLblzip.setBounds(35, 102, 86, 14);
		pnlCreateCustomer.add(lblLblzip);
		
		txtZip = new JTextField();
		txtZip.setBounds(131, 99, 86, 20);
		pnlCreateCustomer.add(txtZip);
		txtZip.setColumns(10);
		
		JLabel lblLblcity = new JLabel("By");
		lblLblcity.setBounds(35, 127, 58, 14);
		pnlCreateCustomer.add(lblLblcity);
		
		txtCity = new JTextField();
		txtCity.setBounds(131, 124, 86, 20);
		pnlCreateCustomer.add(txtCity);
		txtCity.setColumns(10);
		
		JLabel lblLblemail = new JLabel("E-mail");
		lblLblemail.setBounds(35, 152, 58, 14);
		pnlCreateCustomer.add(lblLblemail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(131, 149, 86, 20);
		pnlCreateCustomer.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblLblphone = new JLabel("Tlf.");
		lblLblphone.setBounds(35, 177, 58, 14);
		pnlCreateCustomer.add(lblLblphone);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(131, 174, 86, 20);
		pnlCreateCustomer.add(txtPhone);
		txtPhone.setColumns(10);
		
		JButton btnBtncreate = new JButton("Opret");
		btnBtncreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Create();
			}
		});
		btnBtncreate.setBounds(47, 241, 89, 23);
		pnlCreateCustomer.add(btnBtncreate);
		
		JButton btnBtnfind = new JButton("Find");
		btnBtnfind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Find();
			}
		});
		btnBtnfind.setBounds(160, 241, 89, 23);
		pnlCreateCustomer.add(btnBtnfind);
		
	    lblError = new JLabel();
		lblError.setBounds(255, 27, 165, 14);
		pnlCreateCustomer.add(lblError);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClearFields();
			}
		});
		btnClear.setBounds(259, 241, 89, 23);
		pnlCreateCustomer.add(btnClear);
		
		//Find Customer Panel starts
		
		
		contentPane.add(pnlFindCustomer, "name_127260089288318");
		pnlFindCustomer.setLayout(null);
		
		JLabel lblCustomer = new JLabel("Kunde");
		lblCustomer.setBounds(58, 36, 46, 14);
		pnlFindCustomer.add(lblCustomer);
		
		txtCustomer = new JTextField();
		txtCustomer.setBounds(121, 33, 168, 20);
		pnlFindCustomer.add(txtCustomer);
		txtCustomer.setColumns(10);
		
		JButton btnFindCustomer = new JButton("Find Kunde");
		btnFindCustomer.setBounds(74, 91, 108, 23);
		btnFindCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findCustomer();
			}
		});
		pnlFindCustomer.add(btnFindCustomer);

		
		contentPane.add(pnlCreateOrdre, "name_3449796216716");
		pnlCreateOrdre.setLayout(null);
		
		
		
		tblProduct = new JTable();
		tblProduct.setBounds(23, 145, 314, 225);
		
		
		
		
		pnlCreateOrdre.add(tblProduct);
		
		tblOrder = new JTable();
		tblOrder.setBounds(569, 46, 231, 328);
		pnlCreateOrdre.add(tblOrder);
		
		txtFindProduct = new JTextField();
		txtFindProduct.setBounds(52, 32, 200, 27);
		pnlCreateOrdre.add(txtFindProduct);
		txtFindProduct.setColumns(10);
		
		JButton btnFindProduct = new JButton("Find Produkt");
		btnFindProduct.setBounds(104, 86, 113, 23);
		pnlCreateOrdre.add(btnFindProduct);
	
	}
	
}
