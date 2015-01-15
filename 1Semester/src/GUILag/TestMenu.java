package GUILag;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Color;

public class TestMenu {

	private JFrame frmSemesterProjekt;
	private JTextField txtCustomerNo;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtZip;
	private JTextField txtCity;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtOrderNo;
	private JTextField txtEmpNo;
	private JTextField txtCusNo;
	private JTextField txtpackDate;
	private JTextField txtReceiveDate;
	
	private JPanel CreateCustomer = new JPanel();
	private JPanel CreateOrder = new JPanel();
	private JPanel FindOrder = new JPanel();
	private JPanel FindOrderResults = new JPanel();
	private JPanel DeleteOrder = new JPanel();
	private JTextField txtSletOrder;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestMenu window = new TestMenu();
					window.frmSemesterProjekt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSemesterProjekt = new JFrame();
		frmSemesterProjekt.setTitle("Semester Projekt");
			
		frmSemesterProjekt.setBounds(100, 100, 913, 560);
		frmSemesterProjekt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmSemesterProjekt.setJMenuBar(menuBar);
		
		JMenu mnKunde = new JMenu("Kunde");
		menuBar.add(mnKunde);
		
		JMenuItem mntmOpretKunde = new JMenuItem("Opret Kunde");
		mntmOpretKunde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSemesterProjekt.setContentPane(CreateCustomer);
				CreateCustomer.setVisible(true);
			}
		});
		mnKunde.add(mntmOpretKunde);
		
		JMenu mnOrder = new JMenu("Order");
		menuBar.add(mnOrder);
		
		JMenuItem mntmOpretOrder = new JMenuItem("Opret Order");
		mntmOpretOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSemesterProjekt.setContentPane(CreateOrder);
				CreateOrder.setVisible(true);
			}
		});
		mnOrder.add(mntmOpretOrder);
		
		JMenuItem mntmSletOrder = new JMenuItem("Slet Order");
		mntmSletOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSemesterProjekt.setContentPane(DeleteOrder);
				DeleteOrder.setVisible(true);
			}
		});
		
		JMenuItem mntmFindOrder = new JMenuItem("Find Order");
		mntmFindOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSemesterProjekt.setContentPane(FindOrder);
				FindOrder.setVisible(true);
			}
		});
		mnOrder.add(mntmFindOrder);
		mnOrder.add(mntmSletOrder);
		
		frmSemesterProjekt.getContentPane().setLayout(new CardLayout(0, 0));			
		JPanel panel = new JPanel();
		frmSemesterProjekt.getContentPane().add(panel, "name_3995678943760");
		
		
		frmSemesterProjekt.getContentPane().add(CreateCustomer, "name_1426575964304");
		CreateCustomer.setLayout(null);
		
		JLabel lblCustomerNo = new JLabel("Kunde Nr");
		lblCustomerNo.setBounds(50, 61, 46, 14);
		CreateCustomer.add(lblCustomerNo);
		
		txtCustomerNo = new JTextField();
		txtCustomerNo.setBounds(123, 58, 86, 20);
		txtCustomerNo.setColumns(10);
		CreateCustomer.add(txtCustomerNo);
		
		JLabel lblName = new JLabel("Navn");
		lblName.setBounds(50, 92, 46, 14);
		CreateCustomer.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(123, 89, 289, 20);
		txtName.setColumns(10);
		CreateCustomer.add(txtName);
		
		JLabel lblAddress = new JLabel("Addresse");
		lblAddress.setBounds(50, 117, 46, 14);
		CreateCustomer.add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(123, 114, 289, 20);
		txtAddress.setColumns(10);
		CreateCustomer.add(txtAddress);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(50, 145, 46, 14);
		CreateCustomer.add(lblZip);
		
		txtZip = new JTextField();
		txtZip.setBounds(123, 142, 86, 20);
		txtZip.setColumns(10);
		CreateCustomer.add(txtZip);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(50, 170, 46, 14);
		CreateCustomer.add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setBounds(123, 167, 86, 20);
		txtCity.setColumns(10);
		CreateCustomer.add(txtCity);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(50, 195, 46, 14);
		CreateCustomer.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(123, 192, 86, 20);
		txtPhone.setColumns(10);
		CreateCustomer.add(txtPhone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50, 220, 46, 14);
		CreateCustomer.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(123, 217, 86, 20);
		txtEmail.setColumns(10);
		CreateCustomer.add(txtEmail);
		
		JButton btnNewCus = new JButton("Opret");
		btnNewCus.setBounds(50, 308, 89, 23);
		CreateCustomer.add(btnNewCus);
		
		
		frmSemesterProjekt.getContentPane().add(CreateOrder, "name_1439565337166");
		CreateOrder.setLayout(null);
		
		JLabel lblOrderNo = new JLabel("OrderNr");
		lblOrderNo.setBounds(38, 65, 86, 14);
		CreateOrder.add(lblOrderNo);
		
		txtOrderNo = new JTextField();
		txtOrderNo.setColumns(10);
		txtOrderNo.setBounds(134, 62, 86, 20);
		CreateOrder.add(txtOrderNo);
		
		JLabel lblEmpNo = new JLabel("MedarbejderNr");
		lblEmpNo.setBounds(38, 90, 86, 14);
		CreateOrder.add(lblEmpNo);
		
		txtEmpNo = new JTextField();
		txtEmpNo.setColumns(10);
		txtEmpNo.setBounds(134, 87, 86, 20);
		CreateOrder.add(txtEmpNo);
		
		JLabel lblCusNo = new JLabel("kundeNr");
		lblCusNo.setBounds(38, 115, 86, 14);
		CreateOrder.add(lblCusNo);
		
		txtCusNo = new JTextField();
		txtCusNo.setColumns(10);
		txtCusNo.setBounds(134, 112, 86, 20);
		CreateOrder.add(txtCusNo);
		
		JLabel lblpackDate = new JLabel("Pakkedato");
		lblpackDate.setBounds(38, 140, 86, 14);
		CreateOrder.add(lblpackDate);
		
		txtpackDate = new JTextField();
		txtpackDate.setColumns(10);
		txtpackDate.setBounds(134, 137, 86, 20);
		CreateOrder.add(txtpackDate);
		
		JLabel lblReceiveDate = new JLabel("Modtagelsesdato");
		lblReceiveDate.setBounds(38, 165, 86, 14);
		CreateOrder.add(lblReceiveDate);
		
		txtReceiveDate = new JTextField();
		txtReceiveDate.setColumns(10);
		txtReceiveDate.setBounds(134, 162, 86, 20);
		CreateOrder.add(txtReceiveDate);
		
		JButton btnNewOrder = new JButton("Opret Order");
		btnNewOrder.setBounds(38, 229, 97, 32);
		CreateOrder.add(btnNewOrder);
		
		
		frmSemesterProjekt.getContentPane().add(DeleteOrder, "name_4185044033497");
		DeleteOrder.setLayout(null);
		
		txtSletOrder = new JTextField();
		txtSletOrder.setText("Slet Order");
		txtSletOrder.setBounds(342, 188, 97, 20);
		DeleteOrder.add(txtSletOrder);
		txtSletOrder.setColumns(10);
		
		
		frmSemesterProjekt.getContentPane().add(FindOrder, "name_33138426616895");
		FindOrder.setLayout(null);
		
		JLabel label = new JLabel("OrderNr");
		label.setBounds(10, 14, 86, 14);
		FindOrder.add(label);
		
		textField = new JTextField();
		textField.setBounds(106, 11, 86, 20);
		textField.setColumns(10);
		FindOrder.add(textField);
		
		
		FindOrderResults.setBackground(Color.BLUE);
		FindOrderResults.setForeground(Color.BLACK);
		FindOrderResults.setBounds(10, 68, 877, 421);
		FindOrder.add(FindOrderResults);
	}
}
