import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Hi, my name is Arvic Micah Gingoyon. I would appreciate it if you informed me if you would like to use my code for your own profit. 
 * I spent hours of my time to create this, hence, I would like to ask you to give at least enough respect to give me the credit that I am due.
 * 
 * Regarding the code below, for OOP purposes, I will point out that there is no need for exception handling regarding inputs in this program
 * since I will not be asking any input from the user other than the manipulation of buttons. 
 */

public class ThankYou extends JFrame {

	private JPanel contentPane;
	private JTextField txtThankYou;
	private JTextField txtYourOrderNumber;
	private JTextField txtIs;
	
	private int ordNum = Main.orderNum+1;
	Border emptyborder = BorderFactory.createEmptyBorder();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThankYou frame = new ThankYou();
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
	public ThankYou() {
		setTitle("Thank you!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.frmMcdonaldsMenu.setLocation(getX(),getY());
				Main repeat = new Main(ordNum);
				dispose();
				repeat.frmMcdonaldsMenu.setVisible(true);
			}
		});
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtThankYou = new JTextField();
		txtThankYou.setEditable(false);
		txtThankYou.setBackground(Color.ORANGE);
		txtThankYou.setHorizontalAlignment(SwingConstants.CENTER);
		txtThankYou.setFont(new Font("Poppins Black", Font.PLAIN, 30));
		txtThankYou.setText("Thank you!");
		txtThankYou.setBorder(emptyborder);
		txtThankYou.setBounds(203, 174, 241, 61);
		contentPane.add(txtThankYou);
		txtThankYou.setColumns(10);
		
		txtYourOrderNumber = new JTextField();
		txtYourOrderNumber.setEditable(false);
		txtYourOrderNumber.setBackground(Color.ORANGE);
		txtYourOrderNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtYourOrderNumber.setFont(new Font("Poppins Black", Font.PLAIN, 30));
		txtYourOrderNumber.setText("Your order number");
		txtYourOrderNumber.setBounds(148, 232, 351, 61);
		txtYourOrderNumber.setBorder(emptyborder);
		contentPane.add(txtYourOrderNumber);
		txtYourOrderNumber.setColumns(10);
		
		txtIs = new JTextField();
		txtIs.setEditable(false);
		txtIs.setBackground(Color.ORANGE);
		txtIs.setFont(new Font("Poppins Black", Font.PLAIN, 35));
		txtIs.setText("is #" + Main.orderNum);
		txtIs.setHorizontalAlignment(SwingConstants.CENTER);
		txtIs.setBorder(emptyborder);
		txtIs.setBounds(203, 287, 241, 61);
		contentPane.add(txtIs);
		txtIs.setColumns(10);
	}
}
