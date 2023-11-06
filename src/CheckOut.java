import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Hi, my name is Arvic Micah Gingoyon. I would appreciate it if you informed me if you would like to use my code for your own profit. 
 * I spent hours of my time to create this, hence, I would like to ask you to give at least enough respect to give me the credit that I am due.
 * 
 * Regarding the code below, for OOP purposes, I will point out that there is no need for exception handling regarding inputs in this program
 * since I will not be asking any input from the user other than the manipulation of buttons. 
 */

public class CheckOut extends JFrame {

	
	private JFrame ThankYou;
	private JPanel contentPane;
	public static JTextPane CheckReceipt;
	public static JTextPane TextTotal;
	public static float Total = 0;
	private JButton btnNewButton;
	
	Border emptyborder = BorderFactory.createEmptyBorder();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckOut frame = new CheckOut();
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
	public CheckOut() {
		ThankYou = new ThankYou();
		setTitle("Receipt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CheckReceipt = new JTextPane();
		CheckReceipt.setText("\t\t\t      RECEIPT\r\n---------------------------------------------------------------------------------\r\nGINGOYON " + Main.orderNum + "\t\t\t\t\t\t          JUN 2022\r\n---------------------------------------------------------------------------------\r\nORDER:\r\n\r\n");
		CheckReceipt.setFont(new Font("Monospaced", Font.PLAIN, 11));
		CheckReceipt.setEditable(false);
		CheckReceipt.setBounds(31, 24, 573, 431);
		contentPane.add(CheckReceipt);
		
		TextTotal = new JTextPane();
		TextTotal.setBackground(Color.ORANGE);
		TextTotal.setFont(new Font("Poppins Black", Font.PLAIN, 30));
		TextTotal.setText("Total: " + Total);
		TextTotal.setBounds(31, 481, 230, 51);
		contentPane.add(TextTotal);
		
		btnNewButton = new JButton("Place Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThankYou.setLocation(Main.CheckOut.getX(),Main.CheckOut.getY());
				ThankYou.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(Color.BLACK);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(emptyborder);
		btnNewButton.setFont(new Font("Poppins Black", Font.PLAIN, 20));
		btnNewButton.setBounds(339, 481, 265, 51);
		contentPane.add(btnNewButton);
	}

}
