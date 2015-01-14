package GUILag;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CustomerGui {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField txtOpretKunde;
	private static JTextField textField_2;
	private static JTextField txtPostnr;
	private static JTextField textField_3;
	private static JTextField txtTlfnr;
	private static JTextField txtEmail;
	private static JButton btnOpret;
	private static JTable table;
	private static JScrollPane scrollPane_1;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Vestbjerg");
		
		frame.setSize(1000,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOpretKunde = new JLabel("Kunde");
		lblOpretKunde.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblOpretKunde.setBounds(6, 16, 135, 35);
		frame.getContentPane().add(lblOpretKunde);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 242, 1, 16);
		frame.getContentPane().add(textArea);
		
		txtOpretKunde = new JTextField();
		txtOpretKunde.setText("Navn");
		txtOpretKunde.setBounds(6, 75, 134, 28);
		frame.getContentPane().add(txtOpretKunde);
		txtOpretKunde.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("Addresse");
		textField_2.setBounds(7, 110, 134, 28);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		txtPostnr = new JTextField();
		txtPostnr.setText("Postnr");
		txtPostnr.setBounds(7, 150, 134, 28);
		frame.getContentPane().add(txtPostnr);
		txtPostnr.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("By");
		textField_3.setBounds(7, 186, 134, 28);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		txtTlfnr = new JTextField();
		txtTlfnr.setText("TLF-nr");
		txtTlfnr.setBounds(6, 226, 134, 28);
		frame.getContentPane().add(txtTlfnr);
		txtTlfnr.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(7, 266, 134, 28);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		btnOpret = new JButton("Opret");
		btnOpret.setBounds(6, 319, 117, 29);
		frame.getContentPane().add(btnOpret);
		
		table = new JTable();
		table.setBounds(557, 233, 1, 1);
		frame.getContentPane().add(table);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(176, 16, 818, 433);
		frame.getContentPane().add(scrollPane_1);

		
	}
}
