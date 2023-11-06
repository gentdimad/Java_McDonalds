import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * Hi, my name is Arvic Micah Gingoyon. I would appreciate it if you informed me if you would like to use my code for your own profit. 
 * I spent hours of my time to create this, hence, I would like to ask you to give at least enough respect to give me the credit that I am due.
 * 
 * Regarding the code below, for OOP purposes, I will point out that there is no need for exception handling regarding inputs in this program
 * since I will not be asking any input from the user other than the manipulation of buttons. 
 */

public class Main {
	
	public static int orderNum = 1;
	public static JFrame frmMcdonaldsMenu;
	public static JFrame CheckOut;
	String strDate = new SimpleDateFormat("MMM-yyyy").format(new Date());
	
	
	//Receipt
	public static JTextPane Receipt;
	
	private JFrame Burg = new Burger();
	private JFrame Breakfast = new Breakfast();
	private JFrame Chicken = new Chicken();
	private JFrame Dessert = new Dessert();
	private JFrame Cafe = new Cafe();
	private JFrame Fries = new Fries();
	
	
	//Empty Border
	Border emptyborder = BorderFactory.createEmptyBorder();
	
	//McDonalds
	ImageIcon i = new ImageIcon(getClass().getResource("/images/McDonalds.png"));
	Image img = (i).getImage().getScaledInstance(185, 120, Image.SCALE_SMOOTH);
	Icon ic = new ImageIcon(img);
	
	
	//Burger Button
	ImageIcon ii = new ImageIcon(getClass().getResource("/images/Burger.jpg"));
	JButton btn = new JButton(ii);
	Image image = (ii).getImage().getScaledInstance(138, 124, Image.SCALE_SMOOTH);
	Icon icon = new ImageIcon(image);
	
	//Breakfast Button
	ImageIcon i1 = new ImageIcon(getClass().getResource("/images/Breakfast.jpg"));
	JButton btn_1 = new JButton(i1);
	Image image1 = (i1).getImage().getScaledInstance(138, 124, Image.SCALE_SMOOTH);
	Icon icon1 = new ImageIcon(image1);
	
	//Chicken & Platters Button
	ImageIcon i2 = new ImageIcon(getClass().getResource("/images/Chicken.jpg"));
	JButton btn_2 = new JButton(i2);
	Image image2 = (i2).getImage().getScaledInstance(138, 124, Image.SCALE_SMOOTH);
	Icon icon2 = new ImageIcon(image2);
	
	//Dessert Button
	ImageIcon i3 = new ImageIcon(getClass().getResource("/images/Dessert.jpg"));
	JButton btn_3 = new JButton(i3);
	Image image3 = (i3).getImage().getScaledInstance(138, 124, Image.SCALE_SMOOTH);
	Icon icon3 = new ImageIcon(image3);
	
	//McCafe
	ImageIcon i4 = new ImageIcon(getClass().getResource("/images/Cafe.jpg"));
	JButton btn_4 = new JButton(i4);
	Image image4 = (i4).getImage().getScaledInstance(138, 124, Image.SCALE_SMOOTH);
	Icon icon4 = new ImageIcon(image4);
	
	//Fries
	ImageIcon i5 = new ImageIcon(getClass().getResource("/images/Fries.jpg"));
	JButton btn_5 = new JButton(i5);
	Image image5 = (i5).getImage().getScaledInstance(138, 124, Image.SCALE_SMOOTH);
	Icon icon5 = new ImageIcon(image5);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmMcdonaldsMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	
	public Main(int ordNum) {
		orderNum = ordNum;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMcdonaldsMenu = new JFrame();
		frmMcdonaldsMenu.getContentPane().setBackground(Color.ORANGE);
		frmMcdonaldsMenu.getContentPane().setLayout(null);
		
		CheckOut = new CheckOut();
		
		
		btn = new JButton(icon);
		btn.setFont(new Font("Poppins Black", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMcdonaldsMenu.setVisible(false);
				Burg.setLocation(frmMcdonaldsMenu.getX(),frmMcdonaldsMenu.getY());
				Burg.setVisible(true);
			}
		});
		btn.setBounds(31, 138, 138, 124);
		btn.setBorder(emptyborder);
		frmMcdonaldsMenu.getContentPane().add(btn);
		
		btn_1 = new JButton(icon1);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMcdonaldsMenu.setVisible(false);
				Breakfast.setLocation(frmMcdonaldsMenu.getX(),frmMcdonaldsMenu.getY());
				Breakfast.setVisible(true);
				
			}
		});
		btn_1.setBackground(Color.WHITE);
		btn_1.setBounds(201, 138, 138, 124);
		btn_1.setBorder(emptyborder);
		frmMcdonaldsMenu.getContentPane().add(btn_1);
		
		btn_2 = new JButton(icon2);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMcdonaldsMenu.setVisible(false);
				Chicken.setLocation(frmMcdonaldsMenu.getX(),frmMcdonaldsMenu.getY());
				Chicken.setVisible(true);
			}
		});
		btn_2.setBackground(Color.WHITE);
		btn_2.setBounds(31, 273, 138, 124);
		btn_2.setBorder(emptyborder);
		frmMcdonaldsMenu.getContentPane().add(btn_2);
		
		btn_3 = new JButton(icon3);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMcdonaldsMenu.setVisible(false);
				Dessert.setLocation(frmMcdonaldsMenu.getX(),frmMcdonaldsMenu.getY());
				Dessert.setVisible(true);
			}
		});
		btn_3.setBounds(201, 273, 138, 124);
		btn_3.setBorder(emptyborder);
		frmMcdonaldsMenu.getContentPane().add(btn_3);
		
		btn_4 = new JButton(icon4);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMcdonaldsMenu.setVisible(false);
				Cafe.setLocation(frmMcdonaldsMenu.getX(),frmMcdonaldsMenu.getY());
				Cafe.setVisible(true);
			}
		});
		btn_4.setBounds(31, 408, 138, 124);
		btn_4.setBorder(emptyborder);
		frmMcdonaldsMenu.getContentPane().add(btn_4);
		
		btn_5 = new JButton(icon5);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMcdonaldsMenu.setVisible(false);
				Fries.setLocation(frmMcdonaldsMenu.getX(),frmMcdonaldsMenu.getY());
				Fries.setVisible(true);
			}
		});
		btn_5.setBounds(201, 408, 138, 124);
		btn_5.setBorder(emptyborder);
		frmMcdonaldsMenu.getContentPane().add(btn_5);
		
		Receipt = new JTextPane();
		Receipt.setEditable(false);
		Receipt.setFont(new Font("Monospaced", Font.PLAIN, 11));
		Receipt.setText("\t   RECEIPT\r\n\r\n------------------------------------\r\n GINGOYON "+ orderNum + "\t" + strDate +  "\r\n------------------------------------\r\n CURRENT ORDER:");
		Receipt.setBounds(372, 56, 235, 403);
		frmMcdonaldsMenu.getContentPane().add(Receipt);
		
		JButton btnNewButton = new JButton("Check Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMcdonaldsMenu.setVisible(false);
				CheckOut.setLocation(frmMcdonaldsMenu.getX(),frmMcdonaldsMenu.getY());
				CheckOut.setVisible(true);
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
		
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Poppins Black", Font.PLAIN, 20));
		btnNewButton.setBounds(372, 482, 235, 50);
		btnNewButton.setBorder(emptyborder);
		frmMcdonaldsMenu.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(ic);
		lblNewLabel.setBounds(90, 24, 187, 90);
		frmMcdonaldsMenu.getContentPane().add(lblNewLabel);
		
		
		frmMcdonaldsMenu.setTitle("McDonald's Menu");
		frmMcdonaldsMenu.setBounds(100, 100, 650, 600);
		frmMcdonaldsMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
