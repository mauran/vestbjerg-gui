package GUILag;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LogInGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmpNo;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInGUI frame = new LogInGUI();
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
	public LogInGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("Bruger");
		lblUser.setBounds(73, 74, 46, 14);
		contentPane.add(lblUser);
		
		txtEmpNo = new JTextField();
		txtEmpNo.setText("Medarbejder Nummer");
		txtEmpNo.setBounds(129, 71, 130, 20);
		contentPane.add(txtEmpNo);
		txtEmpNo.setColumns(10);
		
		btnNewButton = new JButton("Log Ind");
		btnNewButton.setBounds(95, 132, 189, 61);
		contentPane.add(btnNewButton);
	}

}
