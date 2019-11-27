import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
public class Ticketbook {

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
	private JTable table;
	public int v=2121;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketbook window = new Ticketbook();
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
	public Ticketbook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 872, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel1.setBounds(206, 11, 391, 62);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTicketBooking.setBounds(89, 0, 292, 62);
		panel1.add(lblTicketBooking);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel2.setBounds(369, 104, 477, 333);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(10, 41, 58, 14);
		panel2.add(lblName);
		
		TF1 = new JTextField();
		TF1.setBounds(98, 40, 130, 20);
		panel2.add(TF1);
		TF1.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(10, 95, 46, 14);
		panel2.add(lblFrom);
		
		TF2 = new JTextField();
		TF2.setBounds(98, 93, 111, 20);
		panel2.add(TF2);
		TF2.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(10, 138, 46, 14);
		panel2.add(lblTo);
		
		TF3 = new JTextField();
		TF3.setBounds(98, 136, 111, 20);
		panel2.add(TF3);
		TF3.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(10, 182, 46, 14);
		panel2.add(lblDate);
		
		TF4 = new JTextField();
		TF4.setBounds(98, 180, 111, 20);
		panel2.add(TF4);
		TF4.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(10, 235, 46, 14);
		panel2.add(lblTime);
		
		TF5 = new JTextField();
		TF5.setBounds(98, 233, 111, 20);
		panel2.add(TF5);
		TF5.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicketNo.setBounds(352, 74, 74, 14);
		panel2.add(lblTicketNo);
		
		TF6 = new JTextField();
		TF6.setBounds(352, 93, 115, 20);
		panel2.add(TF6);
		TF6.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(352, 124, 46, 14);
		panel2.add(lblPrice);
		
		TF7 = new JTextField();
		TF7.setBounds(352, 146, 115, 20);
		panel2.add(TF7);
		TF7.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoute.setBounds(352, 183, 46, 14);
		panel2.add(lblRoute);
		
		TF8 = new JTextField();
		TF8.setBounds(352, 208, 115, 20);
		panel2.add(TF8);
		TF8.setColumns(10);
		
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(0, 0, 205));
		panel3.setBounds(10, 463, 836, 119);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No.of.Seats", "Time", "Date", "Ac/Non Ac", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 816, 97);
		panel3.add(table);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName_1.setBounds(10, 104, 60, 14);
		frame.getContentPane().add(lblName_1);
		
		TF9 = new JTextField();
		TF9.setBounds(96, 101, 151, 20);
		frame.getContentPane().add(TF9);
		TF9.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Standard");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb1.setBounds(6, 138, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Single Ticket");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb2.setBounds(117, 138, 109, 23);
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Adult");
		rb3.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb3.setBounds(239, 138, 109, 23);
		frame.getContentPane().add(rb3);
		
		JRadioButton rb7 = new JRadioButton("Child");
		rb7.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb7.setBounds(266, 174, 75, 23);
		frame.getContentPane().add(rb7);
		ButtonGroup G1=new ButtonGroup();
		G1.add(rb1);
		G1.add(rb2);
		G1.add(rb3);
		G1.add(rb7);
		
		JRadioButton rb4 = new JRadioButton("First Class");
		rb4.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb4.setBounds(6, 174, 109, 23);
		frame.getContentPane().add(rb4);
		
		JRadioButton rb5 = new JRadioButton("AC");
		rb5.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb5.setBounds(116, 174, 48, 23);
		frame.getContentPane().add(rb5);
		
		JRadioButton rb6 = new JRadioButton("Sleeper");
		rb6.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb6.setBounds(171, 174, 75, 23);
		frame.getContentPane().add(rb6);
		ButtonGroup G2=new ButtonGroup();
		G2.add(rb4);
		G2.add(rb5);
		G2.add(rb6);
		
		
		JComboBox cb1 = new JComboBox();
		cb1.setToolTipText("from");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"-From-", "kollam", "kayamkulam", "alappuzha", ""}));
		cb1.setBounds(6, 217, 95, 20);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"-To-", "kayamkulam", "kollam", "alappuzha", ""}));
		cb2.setBounds(132, 217, 86, 20);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"-No of seats-", "1", "2", "3", "4", "5", "6", "7", "8"}));
		cb3.setBounds(239, 217, 109, 20);
		frame.getContentPane().add(cb3);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTax.setBounds(10, 292, 28, 14);
		frame.getContentPane().add(lblTax);
		
		TF10 = new JTextField();
		TF10.setBounds(96, 290, 86, 20);
		frame.getContentPane().add(TF10);
		TF10.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubTotal.setBounds(10, 329, 66, 14);
		frame.getContentPane().add(lblSubTotal);
		
		TF11 = new JTextField();
		TF11.setBounds(96, 327, 86, 20);
		frame.getContentPane().add(TF11);
		TF11.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setBounds(10, 367, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		TF12 = new JTextField();
		TF12.setBounds(96, 365, 86, 20);
		frame.getContentPane().add(TF12);
		TF12.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 129, 349, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 265, 349, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 392, 349, 2);
		frame.getContentPane().add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=(String)cb1.getSelectedItem();
				String data2=(String)cb2.getSelectedItem();
				float price=0;
				if(data1.equals("kollam")&&data2.equals("kayamkulam"))
				{
					price=45;
				}
				else if(data1.equals("kollam")&&data2.equals("alappuzha"))
				{ 
					price=60;
				}
				else if(data1.equals("kayamkulam")&&data2.equals("kollam"))
				{
					price=45;
				}
				else if(data1.equals("kayamkulam")&&data2.equals("alappuzha"))
				{
					price=55;
				}
				else if(data1.equals("alappuzha")&&data2.equals("kollam"))
				{
					price=60;
				}
				else if(data1.equals("alappuzha")&&data2.equals("kayamkulam"))
				{
					price=55;
				}
				else
				{
					if(data1.equals("kollam")&&data2.contentEquals("kollam"))
					{
						JOptionPane.showMessageDialog(null, "Invalid Entry",
								"Ticket details",JOptionPane.OK_OPTION);
					}
					else if(data1.equals("kayamkulam")&&data2.contentEquals("kayamkulam"))
					{
						JOptionPane.showMessageDialog(null, "Invalid Entry",
								"Ticket details",JOptionPane.OK_OPTION);
					}
					else if(data1.equals("alappuzha")&&data2.contentEquals("alappuzha"))
					{
						JOptionPane.showMessageDialog(null, "Invalid Entry",
								"Ticket details",JOptionPane.OK_OPTION);
					}
				}
				String d1=TF9.getText();
				TF1.setText(d1);
				String d2=(String)cb3.getSelectedItem();
				float d3=Float.parseFloat(d2);
				float rate1=0,rate2=0,TR=0,tax=0,total1=0;
				String tax1,stotal,total;
				if(rb4.isSelected())
				{
					 TR=(float)(price+(price*0.3));
					 tax=(float)(TR*0.3);
					 rate1=(float)(TR*d3);
					rate2=(float)(tax*d3);
					 total1=rate1+rate2;
					 
				}
				else if(rb5.isSelected())
				{
					TR=(float)(price+(price*0.2));
					 tax=(float)(TR*0.2);
					 rate1=(float)(TR*d3);
					 rate2=(float)(tax*d3);
					 total1=rate1+rate2;
					
				}
				else if(rb6.isSelected())
				{
					TR=(float)(price);
					 tax=(float)(TR*0.1);
					 rate1=(float)(TR*d3);
					 rate2=(float)(tax*d3);
					  total1=rate1+rate2;
				}
				tax1=String.valueOf(rate2);
				stotal=String.valueOf(rate1);
				 total=String.valueOf(total1);
				TF10.setText(tax1);
				TF11.setText(stotal);
				TF12.setText(total);
				TF7.setText(total);
				String d4=(String)cb1.getSelectedItem();
				TF2.setText(d4);
				String d5=(String)cb2.getSelectedItem();
				TF3.setText(d5);
				LocalTime m=java.time.LocalTime.now();
				String q=String.valueOf(m);
				TF5.setText(q);
				LocalDate m1=java.time.LocalDate.now();
				String q1=String.valueOf(m1);
				TF4.setText(q1);
				TF8.setText("-any-");
				v++;
				String d6=String.valueOf(v);
				TF6.setText(d6);
			}
			
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(10, 414, 89, 23); 
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF1.setText("");
				TF2.setText("");
				TF3.setText("");
				TF4.setText("");
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
				cb3.setSelectedIndex(0);
				G1.clearSelection();
				G2.clearSelection();
			}
		});
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=TF1.getText();
				String data2=TF6.getText();
				String data3=TF2.getText();
				String data4=TF3.getText();
				String data5=(String)cb3.getSelectedItem();
				String data6=TF5.getText();
				String data7=TF4.getText();
				String data9=TF7.getText();
				String data8="";
				if(rb4.isSelected())
				{
					data8="Ac" ;
				}
				else if(rb5.isSelected())
				{
					 data8="Ac" ;
				}
				if(rb6.isSelected())
				{
					 data8="Non Ac" ;
				}
				String[] row= {data1,data2,data3,data4,data5,data6,data7,data8,data9};
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				model1.addRow(row);
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConfirm.setBounds(225, 288, 89, 23);
		panel2.add(btnConfirm);
		
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(132, 416, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(252, 416, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBackground(Color.BLACK);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(358, 137, 1, 315);
		frame.getContentPane().add(separator_3);
	}
}
