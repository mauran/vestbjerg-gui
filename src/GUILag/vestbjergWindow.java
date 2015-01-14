package GUILag;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class vestbjergWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vestbjergWindow frame = new vestbjergWindow();
					frame.setSize(115,160);
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
	public vestbjergWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(95, 106, 21, 21);
		contentPane.add(tabbedPane);
		
		JButton btnNewButton = new JButton("Kunde");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CustomerGui.main(null);
				
			}
		});
		btnNewButton.setBounds(-1, 44, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnOrdrer = new JButton("Ordrer");
		btnOrdrer.setBounds(-1, 76, 117, 29);
		contentPane.add(btnOrdrer);
		
		JButton btnProdukt = new JButton("Produkt");
		btnProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProductGui.main(null);
				
			}
		});
		btnProdukt.setBounds(-1, 106, 117, 29);
		contentPane.add(btnProdukt);
		
		JLabel lblVestbjerg = new JLabel("Vestbjerg");
		lblVestbjerg.setBounds(23, 16, 61, 16);
		contentPane.add(lblVestbjerg);
	}
}
