import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/*
 * Hi, my name is Arvic Micah Gingoyon. I would appreciate it if you informed me if you would like to use my code for your own profit. 
 * I spent hours of my time to create this, hence, I would like to ask you to give at least enough respect to give me the credit that I am due.
 * 
 * Regarding the code below, for OOP purposes, I will point out that there is no need for exception handling regarding inputs in this program
 * since I will not be asking any input from the user other than the manipulation of buttons. 
 */

public class Breakfast extends JFrame {
	
	private JPanel contentPane;
	JTextPane itemName = new JTextPane();
	JTextPane itemDesc = new JTextPane();
	JLabel img = new JLabel("Item Picture");
	
	//Add To Cart System
		int item1 = 1;
		int item2 = 0;
		int item3 = 0;
		int item4 = 0;
		
	
	
	//Empty Border
	Border emptyborder = BorderFactory.createEmptyBorder();
	
	
	//Eggdesal
	ImageIcon ii = new ImageIcon(getClass().getResource("/images/Eggdesal.jpeg"));
	Image image = (ii).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon = new ImageIcon(image);
	
	//Sausage
	ImageIcon i1 = new ImageIcon(getClass().getResource("/images/Sausage.jpeg"));
	Image image1 = (i1).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon1 = new ImageIcon(image1);
	
	//Hotcakes
	ImageIcon i2 = new ImageIcon(getClass().getResource("/images/Hotcakes.jpeg"));
	Image image2 = (i2).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon2 = new ImageIcon(image2);
	
	//EggMuffin
	ImageIcon i3 = new ImageIcon(getClass().getResource("/images/EggMuffin.jpeg"));
	Image image3 = (i3).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon3 = new ImageIcon(image3);
	
	//Icons
	//Eggdesal
	Image image4 = (ii).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon4 = new ImageIcon(image4);
	
	//Sausage
	Image image5 = (i1).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon5 = new ImageIcon(image5);
	
	//Hotcakes
	Image image6 = (i2).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon6 = new ImageIcon(image6);
	
	//EggMuffin
	Image image7 = (i3).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon7 = new ImageIcon(image7);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breakfast frame = new Breakfast();
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
	public Breakfast() {
		setTitle("Breakfast Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 614, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		img.setBounds(28, 27, 290, 245);
		img.setIcon(icon);
		panel.add(img);
		itemDesc.setBounds(340, 120, 243, 88);
		panel.add(itemDesc);
		
		
		itemDesc.setEditable(false);
		itemDesc.setFont(new Font("Poppins Light", Font.PLAIN, 11));
		itemDesc.setText("Melty cheese wrapped in a fluffy, folded egg, sandwiched between a soft, toasted pandesal bun.");
		itemName.setBounds(340, 27, 264, 80);
		panel.add(itemName);
		
		
		itemName.setEditable(false);
		itemName.setFont(new Font("Poppins Black", Font.PLAIN, 26));
		itemName.setText("Cheesy Eggdesal");
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item1 == 1) {
					Main.Receipt.setText(Main.Receipt.getText()+"\nCHEESY EGGDESAL");
					CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\nCHEESY EGGDESAL\t\t\t\t\t\t132.00");
					CheckOut.Total+= 132;
					CheckOut.TextTotal.setText("Total: " + CheckOut.Total);
					}else if (item2 == 1) {
						Main.Receipt.setText(Main.Receipt.getText()+"\nSAUSAGE MCMUFFIN");
						CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\nSAUSAGE MCMUFFIN\t\t\t\t\t\t144.00");
						CheckOut.Total+= 144;
						CheckOut.TextTotal.setText("Total: " + CheckOut.Total);
					}else if (item3 == 1) {
						Main.Receipt.setText(Main.Receipt.getText()+"\n2PC HOTCAKES W/ SAUSAGE");
						CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\n2PC HOTCAKES W/ SAUSAGE\t\t\t\t\t\t\t143.00");
						CheckOut.Total+= 143;
						CheckOut.TextTotal.setText("Total: " + CheckOut.Total);
					}else if (item4 == 1) {
						Main.Receipt.setText(Main.Receipt.getText()+"\nEGG MCMUFFIN");
						CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\nEGG MCMUFFIN\t\t\t\t\t\t135.00");
						CheckOut.Total+= 135;
						CheckOut.TextTotal.setText("Total: " + CheckOut.Total);
					}	
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
		
		btnNewButton.setBounds(339, 219, 216, 53);
		panel.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Poppins Black", Font.PLAIN, 17));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBorder(emptyborder);
		
		JButton btnNewButton_1 = new JButton(icon4);
		btnNewButton_1.setBorder(emptyborder);
		btnNewButton_1.setBounds(28, 337, 113, 100);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(icon5);
		btnNewButton_2.setBorder(emptyborder);
		btnNewButton_2.setBounds(172, 337, 113, 100);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(icon6);
		btnNewButton_3.setBorder(emptyborder);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(icon2);
				itemDesc.setText("Two golden brown hotcakes with butter and the sweet flavor of maple plus savory sausage hot off the griddle.");
				itemName.setText("2pc. Hotcakes with Sausage");
				item1 = 0; item2 = 0; item3 = 1; item4 = 0;
			}
		});
		btnNewButton_3.setBounds(318, 337, 113, 100);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton(icon7);
		btnNewButton_6.setBorder(emptyborder);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(icon3);
				itemDesc.setText("Freshly toasted English muffin, tender and lean Canadian bacon, a slice of creamy, real American cheese and a freshly cooked Grade A egg");
				itemName.setText("Egg McMuffin");
				item1 = 0; item2 = 0; item3 = 0; item4 = 1;
			}
		});
		btnNewButton_6.setBounds(470, 337, 113, 100);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Check Out");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.CheckOut.setLocation(Main.frmMcdonaldsMenu.getX(),Main.frmMcdonaldsMenu.getY());
				Main.CheckOut.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_5.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_5.setForeground(Color.BLACK);
			}
		});
		btnNewButton_5.setBounds(28, 480, 113, 35);
		panel.add(btnNewButton_5);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setBorder(emptyborder);
		btnNewButton_5.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		btnNewButton_5.setBackground(Color.ORANGE);
		
		JButton btnNewButton_4 = new JButton("Go Back");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_4.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_4.setForeground(Color.BLACK);
			}
		});
		btnNewButton_4.setBounds(470, 480, 113, 35);
		panel.add(btnNewButton_4);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBorder(emptyborder);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frmMcdonaldsMenu.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(icon1);
				itemDesc.setText("Freshly toasted English muffin, savory sausage hot off the griddle with a slice of creamy, real American cheese and a freshly cooked Grade A egg.");
				itemName.setText("Sausage McMuffin");
				item1 = 0; item2 = 1; item3 = 0; item4 = 0;
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(icon);
				itemDesc.setText("Melty cheese wrapped in a fluffy, folded egg, sandwiched between a soft, toasted pandesal bun.");
				itemName.setText("Cheesy Eggdesal");
				item1 = 1; item2 = 0; item3 = 0; item4 = 0;
			}
		});
	}
}
