import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class hotel {

	private JFrame frame;
	private JTextField TF1;
	private JTextField TF2;
	private JTextField TF3;
	private JTextField TF4;
	private JTextField TF5;
	private JTextField TF6;
	private JTextField TF7;
	private JTextField TF8;
	private JTextField TF9;
	private JTextField TF10;
	private JTextField TF11;
	private JTextField TF12;
	public int f=0;
	public int df;
	public float chb1;
	public float chbm1;
     public float csb1;
	 public float qty1;
	 public float price;
	public String Str1,Str2,Str3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotel window = new hotel();
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
	public hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 873, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagementSystems = new JLabel("Hotel Management Systems");
		lblHotelManagementSystems.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHotelManagementSystems.setBounds(206, 11, 539, 52);
		frame.getContentPane().add(lblHotelManagementSystems);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 82, 244, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBurger.setBounds(10, 11, 99, 14);
		panel.add(lblChickenBurger);
		
		TF1 = new JTextField();
		TF1.setText("0");
		TF1.setBounds(146, 9, 63, 20);
		panel.add(TF1);
		TF1.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChickenBurgerMeal.setBounds(10, 53, 131, 20);
		panel.add(lblChickenBurgerMeal);
		
		TF2 = new JTextField();
		TF2.setText("0");
		TF2.setBounds(146, 54, 63, 20);
		panel.add(TF2);
		TF2.setColumns(10);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCheeseBurger.setBounds(10, 98, 99, 20);
		panel.add(lblCheeseBurger);
		
		TF3 = new JTextField();
		TF3.setText("0");
		TF3.setBounds(146, 99, 63, 20);
		panel.add(TF3);
		TF3.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"-Select-", "Tea", "Cofee", "Cococola", "Pepsi"}));
		cb1.setBounds(10, 166, 73, 20);
		panel.add(cb1);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrink.setBounds(10, 141, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQty.setBounds(163, 142, 46, 14);
		panel.add(lblQty);
		
		TF4 = new JTextField();
		TF4.setText("0");
		TF4.setBounds(146, 166, 63, 20);
		panel.add(TF4);
		TF4.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Home delivery");
		rb1.setBounds(6, 210, 109, 23);
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Tax");
		rb2.setBounds(146, 210, 63, 23);
		panel.add(rb2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(6, 129, 216, 1);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(264, 82, 232, 240);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConvertor = new JLabel("Currency Convertor");
		lblCurrencyConvertor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurrencyConvertor.setBounds(56, 11, 191, 19);
		panel_1.add(lblCurrencyConvertor);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"-Select-", "India", "USA", "UAE"}));
		cb2.setBounds(93, 55, 87, 20);
		panel_1.add(cb2);
		
		TF5 = new JTextField();
		TF5.setBounds(94, 109, 86, 20);
		panel_1.add(TF5);
		TF5.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(10, 337, 290, 132);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostOfDrinks.setBounds(10, 11, 93, 14);
		panel_2.add(lblCostOfDrinks);
		
		TF6 = new JTextField();
		TF6.setBounds(165, 9, 86, 20);
		panel_2.add(TF6);
		TF6.setColumns(10);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostOfMeal.setBounds(10, 54, 86, 14);
		panel_2.add(lblCostOfMeal);
		
		TF7 = new JTextField();
		TF7.setBounds(165, 52, 86, 20);
		panel_2.add(TF7);
		TF7.setColumns(10);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostOfDelivery.setBounds(10, 96, 104, 14);
		panel_2.add(lblCostOfDelivery);
		
		TF8 = new JTextField();
		TF8.setBounds(165, 94, 86, 20);
		panel_2.add(TF8);
		TF8.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(310, 337, 184, 132);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTax.setBounds(10, 11, 46, 14);
		panel_3.add(lblTax);
		
		TF9 = new JTextField();
		TF9.setBounds(91, 9, 86, 20);
		panel_3.add(TF9);
		TF9.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubTotal.setBounds(10, 55, 68, 14);
		panel_3.add(lblSubTotal);
		
		TF10 = new JTextField();
		TF10.setBounds(91, 53, 86, 20);
		panel_3.add(TF10);
		TF10.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(10, 105, 46, 14);
		panel_3.add(lblTotal);
		
		TF11 = new JTextField();
		TF11.setBounds(91, 103, 86, 20);
		panel_3.add(TF11);
		TF11.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(506, 82, 341, 385);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 321, 363);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setLayout(null);
		
		TF12 = new JTextField();
		TF12.setBounds(10, 11, 212, 53);
		panel_6.add(TF12);
		TF12.setColumns(10);
		
		JButton btn1 = new JButton("B");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=TF12.getText();
				int l=Str1.length();
				String Str2=Str1.substring(0,l-1);
				TF12.setText(Str2);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.setBounds(10, 70, 44, 39);
		panel_6.add(btn1);
		
		JButton btn2 = new JButton("C");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF12.setText("");
			}
		});
		btn2.setBackground(SystemColor.menu);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.setBounds(64, 70, 47, 39);
		panel_6.add(btn2);
		
		JButton btn3 = new JButton("New button");
		btn3.setBackground(SystemColor.menu);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn3.setBounds(121, 71, 47, 39);
		panel_6.add(btn3);
		
		JButton btn4 = new JButton("+");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Str1=TF12.getText();
				TF12.setText("");
				Str2=btn4.getText();
				df=0;
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.setBounds(177, 70, 47, 39);
		panel_6.add(btn4);
		
		JButton btn5 = new JButton("7");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn5.getText()));
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.setBounds(10, 120, 47, 41);
		panel_6.add(btn5);
		
		JButton btn6 = new JButton("8");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn6.getText()));
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.setBounds(64, 121, 47, 39);
		panel_6.add(btn6);
		
		JButton btn7 = new JButton("9");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn7.getText()));
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.setBounds(121, 121, 47, 41);
		panel_6.add(btn7);
		
		JButton btn8 = new JButton("-");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Str1=TF12.getText();
				TF12.setText("");
				Str2=btn8.getText();
				df=0;
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.setBounds(177, 120, 47, 39);
		panel_6.add(btn8);
		
		JButton btn9 = new JButton("4");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn9.getText()));
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.setBounds(10, 172, 47, 39);
		panel_6.add(btn9);
		
		JButton btn10 = new JButton("5");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn10.getText()));
			}
		});
		btn10.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn10.setBounds(64, 171, 47, 39);
		panel_6.add(btn10);
		
		JButton btn11 = new JButton("6");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn11.getText()));
			}
		});
		btn11.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn11.setBounds(121, 173, 48, 37);
		panel_6.add(btn11);
		
		JButton btn12 = new JButton("*");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Str1=TF12.getText();
				TF12.setText("");
				Str2=btn12.getText();
				df=0;
			}
		});
		btn12.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn12.setBounds(177, 170, 47, 39);
		panel_6.add(btn12);
		
		JButton btn13 = new JButton("1");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn13.getText()));
			}
		});
		btn13.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn13.setBounds(7, 222, 47, 37);
		panel_6.add(btn13);
		
		JButton btn14 = new JButton("2");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn14.getText()));
			}
		});
		btn14.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn14.setBounds(64, 222, 47, 37);
		panel_6.add(btn14);
		
		JButton btn15 = new JButton("3");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn15.getText()));
			}
		});
		btn15.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn15.setBounds(121, 222, 47, 37);
		panel_6.add(btn15);
		
		JButton btn16 = new JButton("/");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Str1=TF12.getText();
				TF12.setText("");
				Str2=btn16.getText();
				df=0;
			}
		});
		btn16.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn16.setBounds(177, 222, 47, 37);
		panel_6.add(btn16);
		
		JButton btn17 = new JButton("0");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				TF12.setText(TF12.getText().concat(btn17.getText()));
			}
		});
		btn17.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn17.setBounds(10, 270, 47, 37);
		panel_6.add(btn17);
		
		JButton btn18 = new JButton(".");
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					TF12.setText("");
					f=0;
					df=0;
				}
				if(df==0)
				{
				TF12.setText(TF12.getText().concat(btn18.getText()));
				df=1;
				}
			}
		});
		btn18.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn18.setBounds(64, 270, 47, 37);
		panel_6.add(btn18);
		
		JButton btn19 = new JButton("New button");
		btn19.setBounds(121, 270, 47, 37);
		panel_6.add(btn19);
		
		JButton btn20 = new JButton("=");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				float res1,res;
				float res2=Float.parseFloat(TF12.getText());
				f=1;
				if(Str2.equals("+"))
				{
					res1=Float.parseFloat(Str1);
					res=res1+res2;
					String str=String.valueOf(res);
					TF12.setText(str);
					
				}
				else if(Str2.equals("-"))
				{
					res1=Float.parseFloat(Str1);
					res=res1-res2;
					String str=String.valueOf(res);
					TF12.setText(str);
					
				}
				else if(Str2.equals("*"))
				{
					res1=Float.parseFloat(Str1);
					res=res1*res2;
					String str=String.valueOf(res);
					TF12.setText(str);
					
				}
				else if(Str2.equals("/"))
				{
					res1=Float.parseFloat(Str1);
					res=res1/res2;
					String str=String.valueOf(res);
					TF12.setText(str);
					
				}
			}
		});
		btn20.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn20.setBounds(177, 270, 47, 40);
		panel_6.add(btn20);
		
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 316, 335);
		panel_7.add(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(10, 480, 837, 106);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String chb=TF1.getText();
				 String chbm=TF2.getText();
				 String csb=TF3.getText();
				 String drink=(String)cb1.getSelectedItem();
				 String qty=TF4.getText();
				  chb1=Float.parseFloat(chb);
				 chbm1=Float.parseFloat(chbm);
				  csb1=Float.parseFloat(csb);
				  qty1=Float.parseFloat(qty);
				 price=0;
				 if(drink.equals("Tea"))
				 {
					 price=8;
				 }
				 else if(drink.equals("Cofee"))
				 {
					 price=10;
				 }
				 else if(drink.equals("Cococola"))
				 {
					 price=50;
				 }
				 else if(drink.equals("Pepsi"))
				 {
					 price=40;
				 }
				 float cdrink=(float)(price*qty1);
				 float cmeal=(float)(50*chb1)+(80*chbm1)+(120*csb1);
				 float cdelivery;
				 if(rb1.isSelected())
				 {
				  cdelivery=30;
				 }
				 else
				 {
					 cdelivery=0;
				 }
				 float tax=(float)(cdrink*0.03+cmeal*0.1+cdelivery*0.1);
				 float subtotal=(float)(cdrink+cmeal+cdelivery);
				 float total=(float)(tax+subtotal);
				 String cdrink1=String.valueOf(cdrink);
				 String cmeal1=String.valueOf(cmeal);
				 String cdelivery1=String.valueOf(cdelivery);
				 String tax1=String.valueOf(tax);
				 String subtotal1=String.valueOf(subtotal);
				 String total1=String.valueOf(total);
				 TF6.setText(cdrink1);
				 TF7.setText(cmeal1);
				 TF8.setText(cdelivery1);
				 TF9.setText(tax1);
				 TF10.setText(subtotal1);
				 TF11.setText(total1);
			}
			
		});
		btnTotal.setBounds(28, 29, 89, 23);
		panel_5.add(btnTotal);
		
		JButton btnNewButton = new JButton("Receipt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String drink=(String)cb1.getSelectedItem();
			float rate=0;
				if(drink.contentEquals("Tea"))
				{
					rate=8;
				}
				else if(drink.contentEquals("Cofee"))
				{
					rate=10;
				}
				else if(drink.contentEquals("Cococola"))
				{
					rate=50;
				}
				else if(drink.contentEquals("Pepsi"))
				{
					rate=40;
				}
				String rate1=String.valueOf(rate);
				textArea.append( "Item\t"+"Qty\t"+"Unit Price\t"+"Price\t"+"\n"
						+ "==========================================\n"
						+ "ChickenBurger\t"+ TF1.getText()+"\t"+"50\t"+(Float.parseFloat(TF1.getText())*50) 
						+ "\nChickenMeal\t"+TF2.getText()+"\t"+"80\t"+(Float.parseFloat(TF2.getText())*80)
						+ "\nCheeseBurger\t"+TF3.getText()+"\t"+"120\t"+(Float.parseFloat(TF3.getText())*120)
						+ "\n"+cb1.getSelectedItem()+"\t"+ TF4.getText()+"\t"+rate1+"\t"+(Float.parseFloat(TF4.getText())*rate)
						+"\n=========================================="
						+ "\nSubtotal\t" + TF10.getText()
						+ "\nTax\t" + TF9.getText()
						+ "\nTotal\t" +TF11.getText() + "\n"
						);
			}
		});
		btnNewButton.setBounds(172, 29, 89, 23);
		panel_5.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF1.setText("0");
				TF2.setText("0");
				TF3.setText("0");
				TF4.setText("0");
				TF5.setText("");
				TF6.setText("");
				TF7.setText("");
				TF8.setText("");
				TF9.setText("");
				TF10.setText("");
				TF11.setText("");
				TF12.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				rb1.setSelected(false);
				rb2.setSelected(false);
				textArea.setText("");
			}
		});
		

		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String total=TF11.getText();
				float total1=Float.parseFloat(total);
				 if(cb2.getSelectedItem()=="India")
	                {
	                	TF5.setText(total);
	                }
	                else if(cb2.getSelectedItem()=="USA")
	                {
	                	float result =(float )(total1 * 0.014);
	                	String output=String.valueOf(result);
	                	TF5.setText(output);
	                }
	                else if(cb2.getSelectedItem()=="UAE")
	                {
	                	float result = (float)(total1 * 0.051);
	                	String output=String.valueOf(result);
	                	TF5.setText(output);
	                }
			}
		});
		btnConvert.setBounds(10, 180, 86, 23);
		panel_1.add(btnConvert);
		

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF5.setText("");
				cb2.setSelectedIndex(0);
			}
		});
		btnClose.setBounds(154, 180, 71, 23);
		panel_1.add(btnClose);
		
		btnReset.setBounds(337, 29, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(500, 29, 89, 23);
		panel_5.add(btnExit);
	}
}
