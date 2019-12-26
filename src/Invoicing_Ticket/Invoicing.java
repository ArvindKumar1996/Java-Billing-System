package Invoicing_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;

import Invoice_Sys.Invoice_S;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Invoicing {

	private JFrame frame;
	private JTextField textCustRef;
	private JTextField Cust_First_Name;
	private JTextField Cust_Surname;
	private JTextField Cust_Address;
	private JTextField Cust_Postal_Code;
	private JTextField Cust_Mobile;
	private JTextField Cust_Email;
	private JTextField textApple;
	private JTextField textBanana;
	private JTextField textMango;
	private JTextField textOrange;
	private JTextField textPineApple;
	private JTextField textGrapes;
	private JTextField textGuvava;
	private JTextField textOther;
	private JTextField textTax;
	private JTextField textSubTotal;
	private JTextField textTotal;

	String iTax, iSubTotal, iTotal;
	
	double[] itemcost = new double[20];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoicing window = new Invoicing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Invoicing() {
		initialize();
		
		textCustRef.setText(null);
		textCustRef.setEditable(false);
		int refs = 5015 + (int) (Math.random()*17238);
		String cRef = "";
		cRef += refs + 1560;
		textCustRef.setText(cRef);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(1214, 72, 104, 38);
		frame.getContentPane().add(btnLogOut);
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Invoice_S info2 = new Invoice_S();
				Invoice_S.main(null);
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =    new JFrame();
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.setBounds(0, 0, 1400, 750);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblManagementSystem = new JLabel("Management System");
		lblManagementSystem.setBackground(SystemColor.inactiveCaptionBorder);
		lblManagementSystem.setFont(new Font("Arial", Font.BOLD, 24));
		lblManagementSystem.setBounds(522, 11, 325, 35);
		frame.getContentPane().add(lblManagementSystem);
		
		JLabel label = new JLabel("");
		label.setBounds(53, 156, 46, 14);
		frame.getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 57, 1350, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 134, 342, 450);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCustmerRef = new JLabel("Customer Ref");
		lblCustmerRef.setFont(new Font("Arial", Font.BOLD, 12));
		lblCustmerRef.setBounds(10, 35, 103, 14);
		panel.add(lblCustmerRef);
		
		textCustRef = new JTextField();
		textCustRef.setBounds(123, 29, 209, 27);
		panel.add(textCustRef);
		textCustRef.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Arial", Font.BOLD, 12));
		lblFirstName.setBounds(10, 87, 103, 14);
		panel.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Arial", Font.BOLD, 12));
		lblSurname.setBounds(10, 138, 103, 14);
		panel.add(lblSurname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Arial", Font.BOLD, 12));
		lblAddress.setBounds(10, 186, 103, 14);
		panel.add(lblAddress);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setFont(new Font("Arial", Font.BOLD, 12));
		lblPostalCode.setBounds(10, 237, 103, 14);
		panel.add(lblPostalCode);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Arial", Font.BOLD, 12));
		lblMobile.setBounds(10, 293, 103, 14);
		panel.add(lblMobile);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(10, 343, 103, 14);
		panel.add(lblEmail);
		
		Cust_First_Name = new JTextField();
		Cust_First_Name.setColumns(10);
		Cust_First_Name.setBounds(123, 81, 209, 27);
		panel.add(Cust_First_Name);
		
		Cust_Surname = new JTextField();
		Cust_Surname.setColumns(10);
		Cust_Surname.setBounds(123, 132, 209, 27);
		panel.add(Cust_Surname);
		
		Cust_Address = new JTextField();
		Cust_Address.setColumns(10);
		Cust_Address.setBounds(123, 180, 209, 27);
		panel.add(Cust_Address);
		
		Cust_Postal_Code = new JTextField();
		Cust_Postal_Code.setColumns(10);
		Cust_Postal_Code.setBounds(123, 231, 209, 27);
		panel.add(Cust_Postal_Code);
		
		Cust_Mobile = new JTextField();
		Cust_Mobile.setColumns(10);
		Cust_Mobile.setBounds(123, 287, 209, 27);
		panel.add(Cust_Mobile);
		
		Cust_Email = new JTextField();
		Cust_Email.setColumns(10);
		Cust_Email.setBounds(123, 337, 209, 27);
		panel.add(Cust_Email);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Arial", Font.BOLD, 12));
		lblGender.setBounds(10, 401, 103, 14);
		panel.add(lblGender);
		
		JComboBox Cust_Gender = new JComboBox();
		Cust_Gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		Cust_Gender.setFont(new Font("Arial", Font.PLAIN, 12));
		Cust_Gender.setBounds(123, 392, 209, 27);
		panel.add(Cust_Gender);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(351, 134, 394, 450);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxApple = new JCheckBox("Apple");
		chckbxApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxApple.isSelected()) {
					textApple.setEnabled(true);
					textApple.setText("");
					textApple.requestFocus();
				}
				else {
					textApple.setEnabled(false);
					textApple.setText("0");
				}
			}
		});
		chckbxApple.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxApple.setBackground(SystemColor.window);
		chckbxApple.setBounds(22, 31, 97, 23);
		panel_1.add(chckbxApple);
		
		JCheckBox chckbxBanana = new JCheckBox("Banana");
		chckbxBanana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxApple.isSelected()) {
					textBanana.setEnabled(true);
					textBanana.setText("");
					textBanana.requestFocus();
				}
				else {
					textBanana.setEnabled(false);
					textBanana.setText("0");
				}
			}
		});
		chckbxBanana.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxBanana.setBackground(SystemColor.window);
		chckbxBanana.setBounds(22, 85, 97, 23);
		panel_1.add(chckbxBanana);
		
		JCheckBox chckbxMango = new JCheckBox("Mango");
		chckbxMango.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxApple.isSelected()) {
					textMango.setEnabled(true);
					textMango.setText("");
					textMango.requestFocus();
				}
				else {
					textMango.setEnabled(false);
					textMango.setText("0");
				}
			}
		});
		chckbxMango.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxMango.setBackground(SystemColor.window);
		chckbxMango.setBounds(22, 132, 97, 23);
		panel_1.add(chckbxMango);
		
		JCheckBox chckbxOrange = new JCheckBox("Orange");
		chckbxOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxApple.isSelected()) {
					textOrange.setEnabled(true);
					textOrange.setText("");
					textOrange.requestFocus();
				}
				else {
					textOrange.setEnabled(false);
					textOrange.setText("0");
				}
			}
		});
		chckbxOrange.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxOrange.setBackground(SystemColor.window);
		chckbxOrange.setBounds(22, 181, 97, 23);
		panel_1.add(chckbxOrange);
		
		JCheckBox chckbxPineapple = new JCheckBox("PineApple");
		chckbxPineapple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxApple.isSelected()) {
					textPineApple.setEnabled(true);
					textPineApple.setText("");
					textPineApple.requestFocus();
				}
				else {
					textPineApple.setEnabled(false);
					textPineApple.setText("0");
				}
			}
		});
		chckbxPineapple.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxPineapple.setBackground(SystemColor.window);
		chckbxPineapple.setBounds(22, 232, 97, 23);
		panel_1.add(chckbxPineapple);
		
		JCheckBox chckbxGrapes = new JCheckBox("Grapes");
		chckbxGrapes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxApple.isSelected()) {
					textGrapes.setEnabled(true);
					textGrapes.setText("");
					textGrapes.requestFocus();
				}
				else {
					textGrapes.setEnabled(false);
					textGrapes.setText("0");
				}
			}
		});
		chckbxGrapes.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxGrapes.setBackground(SystemColor.window);
		chckbxGrapes.setBounds(22, 288, 97, 23);
		panel_1.add(chckbxGrapes);
		
		JCheckBox chckbxGuvava = new JCheckBox("Guava");
		chckbxGuvava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxApple.isSelected()) {
					textGuvava.setEnabled(true);
					textGuvava.setText("");
					textGuvava.requestFocus();
				}
				else {
					textGuvava.setEnabled(false);
					textGuvava.setText("0");
				}
			}
		});
		chckbxGuvava.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxGuvava.setBackground(SystemColor.window);
		chckbxGuvava.setBounds(22, 339, 97, 23);
		panel_1.add(chckbxGuvava);
		
		JCheckBox chckbxOther = new JCheckBox("Other");
		chckbxOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxApple.isSelected()) {
					textOther.setEnabled(true);
					textOther.setText("");
					textOther.requestFocus();
				}
				else {
					textOther.setEnabled(false);
					textOther.setText("0");
				}
			}
		});
		chckbxOther.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxOther.setBackground(SystemColor.window);
		chckbxOther.setBounds(22, 392, 97, 23);
		panel_1.add(chckbxOther);
		
		textApple = new JTextField();
		textApple.setHorizontalAlignment(SwingConstants.CENTER);
		textApple.setText("0");
		textApple.setBounds(157, 32, 140, 27);
		panel_1.add(textApple);
		textApple.setColumns(10);
		
		textBanana = new JTextField();
		textBanana.setHorizontalAlignment(SwingConstants.CENTER);
		textBanana.setText("0");
		textBanana.setColumns(10);
		textBanana.setBounds(157, 86, 140, 27);
		panel_1.add(textBanana);
		
		textMango = new JTextField();
		textMango.setHorizontalAlignment(SwingConstants.CENTER);
		textMango.setText("0");
		textMango.setColumns(10);
		textMango.setBounds(157, 133, 140, 27);
		panel_1.add(textMango);
		
		textOrange = new JTextField();
		textOrange.setHorizontalAlignment(SwingConstants.CENTER);
		textOrange.setText("0");
		textOrange.setColumns(10);
		textOrange.setBounds(157, 182, 140, 27);
		panel_1.add(textOrange);
		
		textPineApple = new JTextField();
		textPineApple.setHorizontalAlignment(SwingConstants.CENTER);
		textPineApple.setText("0");
		textPineApple.setColumns(10);
		textPineApple.setBounds(157, 233, 140, 27);
		panel_1.add(textPineApple);
		
		textGrapes = new JTextField();
		textGrapes.setHorizontalAlignment(SwingConstants.CENTER);
		textGrapes.setText("0");
		textGrapes.setColumns(10);
		textGrapes.setBounds(157, 289, 140, 27);
		panel_1.add(textGrapes);
		
		textGuvava = new JTextField();
		textGuvava.setHorizontalAlignment(SwingConstants.CENTER);
		textGuvava.setText("0");
		textGuvava.setColumns(10);
		textGuvava.setBounds(157, 340, 140, 27);
		panel_1.add(textGuvava);
		
		textOther = new JTextField();
		textOther.setHorizontalAlignment(SwingConstants.CENTER);
		textOther.setText("0");
		textOther.setColumns(10);
		textOther.setBounds(157, 393, 140, 27);
		panel_1.add(textOther);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(745, 134, 615, 450);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textReceipt = new JTextArea();
		textReceipt.setBounds(10, 11, 595, 428);
		panel_2.add(textReceipt);
		textReceipt.setEditable(false);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.window);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 583, 342, 96);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnCalculator = new JButton("Calculator");
		btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculator.setForeground(Color.BLACK);
		btnCalculator.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalculator.setBackground(Color.WHITE);
		btnCalculator.setBounds(20, 29, 104, 38);
		panel_3.add(btnCalculator);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textReceipt.setEditable(false);
				
				itemcost[0] = Double.parseDouble(textApple.getText())*1.50;
				itemcost[1] = Double.parseDouble(textBanana.getText())*1.87;
				itemcost[2] = Double.parseDouble(textMango.getText())*1.95;
				itemcost[3] = Double.parseDouble(textOrange.getText())*2.10;
				itemcost[4] = Double.parseDouble(textPineApple.getText())*1.20;
				itemcost[5] = Double.parseDouble(textGrapes.getText())*1.24;
				itemcost[6] = Double.parseDouble(textGuvava.getText())*1.67;
				itemcost[7] = Double.parseDouble(textOther.getText())*1.67;
				
				itemcost[8] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3];
				itemcost[9] = itemcost[4] + itemcost[5] + itemcost[6] + itemcost[7];
				
				itemcost[10] = itemcost[8] + itemcost[9];
				iTax = String.format("Rs. %.2f", itemcost[10]/100);
				iSubTotal = String.format("Rs. %.2f", itemcost[10]);
				iTotal = String.format("Rs. %.2f", itemcost[10] + itemcost[10]/100);
				
				textTax.setText(iTax);
				textSubTotal.setText(iSubTotal);
				textTotal.setText(iTotal);
				
				
				//==================================================================
				textReceipt.setEnabled(true);
				//==================================================================
				int refs =1325 + (int)(Math.random()*4238);
				//==================================================================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				Tdate.format(timer.getTime());
				//==================================================================
				
				textReceipt.append("\tCustomer Billing System\n"+
				"Reference:\t\t\t" + refs +
				"\n=========================================================\t" +
				         "\nCustomer Ref:\t\t\t" + textCustRef.getText() +
				         "\nCustomer Name:\t\t" + Cust_First_Name.getText() +
				         "\nMobile Number:\t\t\t" + Cust_Mobile.getText() +
				"\n---------------------------------------------------------------------------------------------------\t" +
				         
				         "\nApple:\t\t\t" + textApple.getText() +
				         "\nBanana:\t\t\t" + textBanana.getText() +
				         "\nMango:\t\t\t" + textMango.getText() +
				         "\nOrange:\t\t\t" + textOrange.getText()+
				         "\nPineApple:\t\t\t" + textPineApple.getText() +
				         "\nGrapes:\t\t\t" + textGrapes.getText() +
				         "\nGuava:\t\t\t" + textGuvava.getText() +
				         "\nOthers:\t\t\t" + textOther.getText()+
				"\n---------------------------------------------------------------------------------------------------\t" +
				         
				         "\nTax:\t\t\t" + iTax+
				         "\nSubTotal:\t\t\t" + iSubTotal+
				"\n---------------------------------------------------------------------------------------------------\t" +
				         "\nTotal:\t\t\t" + iTotal+
				"\n---------------------------------------------------------------------------------------------------\t" +
				         
				         "\nDate: "+ Tdate.format(timer.getTime())+
				         "\t\tTime: "+ tTime.format(timer.getTime())+
				         "\n\n\tThank You For Shopping\n"
						);
				
			}
		});
		btnTotal.setForeground(Color.BLACK);
		btnTotal.setFont(new Font("Arial", Font.BOLD, 12));
		btnTotal.setBackground(Color.WHITE);
		btnTotal.setBounds(185, 29, 104, 38);
		panel_3.add(btnTotal);
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.window);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(351, 583, 394, 96);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Arial", Font.BOLD, 12));
		lblTax.setBounds(30, 14, 81, 14);
		panel_4.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("SubTotal");
		lblSubTotal.setFont(new Font("Arial", Font.BOLD, 12));
		lblSubTotal.setBounds(30, 39, 81, 14);
		panel_4.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
		lblTotal.setBounds(30, 64, 81, 14);
		panel_4.add(lblTotal);
		
		textTax = new JTextField();
		textTax.setHorizontalAlignment(SwingConstants.CENTER);
		textTax.setColumns(10);
		textTax.setBounds(157, 8, 140, 27);
		panel_4.add(textTax);
		textTax.setEditable(false);
		
		textSubTotal = new JTextField();
		textSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textSubTotal.setColumns(10);
		textSubTotal.setBounds(157, 33, 140, 27);
		panel_4.add(textSubTotal);
		textSubTotal.setEditable(false);
		
		textTotal = new JTextField();
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setColumns(10);
		textTotal.setBounds(157, 58, 140, 27);
		panel_4.add(textTotal);
		textTotal.setEditable(false);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.window);
		panel_5.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(745, 583, 615, 96);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textReceipt.print();
				}
				catch(java.awt.print.PrinterException e1) {
					System.err.format("No Printer Found", e1.getMessage());
				}
			}
		});
		btnPrint.setForeground(SystemColor.window);
		btnPrint.setBackground(new Color(51, 102, 0));
		btnPrint.setFont(new Font("Arial", Font.BOLD, 12));
		btnPrint.setBounds(24, 31, 104, 38);
		panel_5.add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cust_First_Name.setText(null);
				Cust_Surname.setText(null);
				Cust_Address.setText(null);
				Cust_Postal_Code.setText(null);
				Cust_Mobile.setText(null);
				Cust_Email.setText(null);
				textReceipt.setText(null);
				
//					textApple.setEnabled(false);
//					textBanana.setEnabled(false);
//					textMango.setEnabled(false);
//					textOrange.setEnabled(false);
//					textPineApple.setEnabled(false);
//					textGrapes.setEnabled(false);
//					textGuvava.setEnabled(false);
//					textOther.setEnabled(false);
				
				textApple.setText("0");
				textBanana.setText("0");
				textMango.setText("0");
				textOrange.setText("0");
				textPineApple.setText("0");
				textGrapes.setText("0");
				textGuvava.setText("0");
				textOther.setText("0");
				
				chckbxApple.setSelected(false);
				chckbxBanana.setSelected(false);
				chckbxMango.setSelected(false);
				chckbxOrange.setSelected(false);
				chckbxPineapple.setSelected(false);
				chckbxGrapes.setSelected(false);
				chckbxGuvava.setSelected(false);
				chckbxOther.setSelected(false);
				
				textCustRef.setText(null);
				textCustRef.setEnabled(false);
				int refs = 5015 + (int) (Math.random()*17238);
				String cRef = "";
				cRef += refs + 1560;
				textCustRef.setText(cRef);
				
			}
		});
		btnReset.setForeground(SystemColor.window);
		btnReset.setFont(new Font("Arial", Font.BOLD, 12));
		btnReset.setBackground(new Color(255, 153, 51));
		btnReset.setBounds(327, 31, 104, 38);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(SystemColor.window);
		btnExit.setFont(new Font("Arial", Font.BOLD, 12));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(478, 31, 104, 38);
		panel_5.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Customer Billing System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(SystemColor.window);
		btnSave.setFont(new Font("Arial", Font.BOLD, 12));
		btnSave.setBackground(new Color(51, 102, 51));
		btnSave.setBounds(174, 31, 104, 38);
		panel_5.add(btnSave);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 121, 1350, 2);
		frame.getContentPane().add(separator_1);
	}
}
