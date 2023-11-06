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

public class Cafe extends JFrame {

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
	
	
	//Americano
	ImageIcon ii = new ImageIcon(getClass().getResource("/images/Cafe1.jpeg"));
	Image image = (ii).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon = new ImageIcon(image);
	
	//Cappucino
	ImageIcon i1 = new ImageIcon(getClass().getResource("/images/Cafe2.jpeg"));
	Image image1 = (i1).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon1 = new ImageIcon(image1);
	
	//Espresso
	ImageIcon i2 = new ImageIcon(getClass().getResource("/images/Cafe3.jpeg"));
	Image image2 = (i2).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon2 = new ImageIcon(image2);
	
	//Latte
	ImageIcon i3 = new ImageIcon(getClass().getResource("/images/Cafe4.jpeg"));
	Image image3 = (i3).getImage().getScaledInstance(290, 245, Image.SCALE_SMOOTH);
	Icon icon3 = new ImageIcon(image3);
	
	//Icons
	//Americano
	Image image4 = (ii).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon4 = new ImageIcon(image4);
	
	//Cappucino
	Image image5 = (i1).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon5 = new ImageIcon(image5);
	
	//Espresso
	Image image6 = (i2).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon6 = new ImageIcon(image6);
	
	//Latte
	Image image7 = (i3).getImage().getScaledInstance(113,100, Image.SCALE_SMOOTH);
	Icon icon7 = new ImageIcon(image7);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe frame = new Cafe();
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
	public Cafe() {
		setTitle("McCafe");
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
		itemDesc.setText("Almost as strong as an espresso, but topped with hot water for a full-bodied flavor.");
		itemName.setBounds(340, 27, 264, 80);
		panel.add(itemName);
		
		
		itemName.setEditable(false);
		itemName.setFont(new Font("Poppins Black", Font.PLAIN, 26));
		itemName.setText("McCaf� Americano");
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(item1 == 1) {
					Main.Receipt.setText(Main.Receipt.getText()+"\nMcCAFE AMERICANO");
					CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\nMcCAFE AMERICANO\t\t\t\t\t\t90.00");
					CheckOut.Total+= 90;
					CheckOut.TextTotal.setText("Total: " + CheckOut.Total);
					}else if (item2 == 1) {
						Main.Receipt.setText(Main.Receipt.getText()+"\nMcCAFE CAPPUCINO");
						CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\nMcCAFE CAPPUCINO\t\t\t\t\t\t95.00");
						CheckOut.Total+= 95;
						CheckOut.TextTotal.setText("Total: " + CheckOut.Total);
					}else if (item3 == 1) {
						Main.Receipt.setText(Main.Receipt.getText()+"\nMcCAFE ESPRESSO");
						CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\nMcCAFE ESPRESSO\t\t\t\t\t\t80.00");
						CheckOut.Total+= 80;
						CheckOut.TextTotal.setText("Total: " + CheckOut.Total);
					}else if (item4 == 1) {
						Main.Receipt.setText(Main.Receipt.getText()+"\nMcCAFE LATTE");
						CheckOut.CheckReceipt.setText(CheckOut.CheckReceipt.getText()+"\nMcCAFE LATTE\t\t\t\t\t\t95.00");
						CheckOut.Total+= 95;
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
				itemDesc.setText("Perk up with a rich, creamy shot 100% pure arabice coffee. Its small in size but really strong.");
				itemName.setText("McCaf� Espresso");
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
				itemDesc.setText("It�s the right mix of strong espresso and velvety steamed milk with a touch of froth.");
				itemName.setText("McCaf� Cafe Latte");
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
				itemDesc.setText("Rich espresso topped with hot frothy milk, sprinkled with chocolate powder.");
				itemName.setText("McCaf� Capuccino");
				item1 = 0; item2 = 1; item3 = 0; item4 = 0;
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img.setIcon(icon);
				itemDesc.setText("Almost as strong as an espresso, but topped with hot water for a full-bodied flavor.");
				itemName.setText("McCaf� Americano");
				item1 = 1; item2 = 0; item3 = 0; item4 = 0;
			}
		});
	}
}