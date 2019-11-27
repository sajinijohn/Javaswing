import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JOptionPane;

public class StudentReport {

	private JFrame frame;
	private JTable table;
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
	private JTextField TF13;
	private JTextField TF14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentReport window = new StudentReport();
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
	public StudentReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(100, 100, 876, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(128, 128, 128));
		panel1.setForeground(new Color(0, 0, 0));
		panel1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel1.setBounds(11, 9, 395, 336);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStudentid.setBounds(10, 25, 73, 14);
		panel1.add(lblStudentid);
		
		TF1 = new JTextField();
		TF1.setBounds(93, 22, 86, 20);
		panel1.add(TF1);
		TF1.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(10, 64, 73, 14);
		panel1.add(lblFirstName);
		
		TF2 = new JTextField();
		TF2.setBounds(93, 61, 86, 20);
		panel1.add(TF2);
		TF2.setColumns(10);
		
		JLabel lblSurName = new JLabel("Sur name");
		lblSurName.setFont(new Font("Tahoma", Font.BOLD, 11));
		 lblSurName.setBounds(10, 98, 61, 14);
		panel1.add(lblSurName);
		
		TF3 = new JTextField();
		TF3.setBounds(93, 95, 86, 20);
		panel1.add(TF3);
		TF3.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourseCode.setBounds(10, 140, 73, 14);
		panel1.add(lblCourseCode);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"1110032A", "1110034B", "1110036C"}));
		CB1.setBounds(93, 137, 86, 20);
		panel1.add(CB1);
		
		JLabel lblTotalScore = new JLabel("Total score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalScore.setBounds(10, 215, 63, 14);
		panel1.add(lblTotalScore);
		
		TF4 = new JTextField();
		TF4.setBounds(93, 212, 86, 20);
		panel1.add(TF4);
		TF4.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAverage.setBounds(10, 252, 61, 14);
		panel1.add(lblAverage);
		
		TF5 = new JTextField();
		TF5.setBounds(93, 249, 86, 20);
		panel1.add(TF5);
		TF5.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRanking.setBounds(10, 297, 54, 14);
		panel1.add(lblRanking);
		
		TF6 = new JTextField();
		TF6.setBounds(93, 294, 86, 20);
		panel1.add(TF6);
		TF6.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMaths.setBounds(226, 25, 46, 14);
		panel1.add(lblMaths);
		
		TF7 = new JTextField();
		TF7.setBounds(294, 22, 86, 20);
		panel1.add(TF7);
		TF7.setColumns(10);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnglish.setBounds(226, 64, 46, 14);
		panel1.add(lblEnglish);
		
		TF8 = new JTextField();
		TF8.setBounds(294, 61, 86, 20);
		panel1.add(TF8);
		TF8.setColumns(10);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBiology.setBounds(226, 98, 46, 14);
		panel1.add(lblBiology);
		
		TF9 = new JTextField();
		TF9.setBounds(294, 95, 86, 20);
		panel1.add(TF9);
		TF9.setColumns(10);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComputer.setBounds(226, 140, 61, 14);
		panel1.add(lblComputer);
		
		TF10 = new JTextField();
		TF10.setBounds(294, 137, 86, 20);
		panel1.add(TF10);
		TF10.setColumns(10);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChemistry.setBounds(226, 179, 61, 14);
		panel1.add(lblChemistry);
		
		TF11 = new JTextField();
		TF11.setBounds(294, 176, 86, 20);
		panel1.add(TF11);
		TF11.setColumns(10);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhysics.setBounds(226, 215, 46, 14);
		panel1.add(lblPhysics);
		
		TF12 = new JTextField();
		TF12.setBounds(294, 212, 86, 20);
		panel1.add(TF12);
		TF12.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(10, 179, 181, 2);
		panel1.add(separator);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamil.setBounds(226, 252, 46, 14);
		panel1.add(lblTamil);
		
		TF13 = new JTextField();
		TF13.setBounds(294, 249, 86, 20);
		panel1.add(TF13);
		TF13.setColumns(10);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMalayalam.setBounds(214, 297, 73, 14);
		panel1.add(lblMalayalam);
		
		TF14 = new JTextField();
		TF14.setBounds(294, 294, 86, 20);
		panel1.add(TF14);
		TF14.setColumns(10);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(106, 90, 205));
		panel2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel2.setBounds(416, 9, 434, 334);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JTextArea txtrStudentRecordStudent = new JTextArea();
		txtrStudentRecordStudent.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtrStudentRecordStudent.setBounds(10, 23, 414, 270);
		panel2.add(txtrStudentRecordStudent);
		
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setBorder(new CompoundBorder(new LineBorder(new Color(50, 205, 50)), null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(92);
		table.getColumnModel().getColumn(1).setMinWidth(25);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(8).setPreferredWidth(59);
		table.getColumnModel().getColumn(10).setPreferredWidth(82);
		table.setBounds(11, 388, 840, 64);
		frame.getContentPane().add(table);
		
		JButton bttn1 = new JButton("Add report");
		bttn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=TF1.getText();
				String data2=(String)CB1.getSelectedItem();
				String data3=TF7.getText();
				String data4=TF8.getText();
				String data5=TF9.getText();
				String data6=TF10.getText();
				String data7=TF11.getText();
				String data8=TF12.getText();
				String data9=TF13.getText();
				String data10=TF14.getText();
				float data31=Float.parseFloat(data3);
				float data41=Float.parseFloat(data4);
				float data51=Float.parseFloat(data5);
				float data61=Float.parseFloat(data6);
				float data71=Float.parseFloat(data7);
				float data81=Float.parseFloat(data8);
				float data91=Float.parseFloat(data9);
				float data101=Float.parseFloat(data10);
				float data11=(float)(data31+data41+data51+data61+data71+data81+data91+data101);
				float data12=(float)((data31+data41+data51+data61+data71+data81+data91+data101)/8);
				String data15="";
				if(data11>700)
				{
					 data15="1";
				}
				else if(data11>=600&&data11<=700)
				{
					 data15="2";
				}
				else if(data11>=500&&data11<600)
				{
					data15="3";
				}
				else if(data11>=400&&data11<500)
				{
					 data15="4";
				}
				else if(data11<400)
				{
					 data15="Fail";
				}
				String data13=String.valueOf(data11);
				String data14=String.valueOf(data12);
				String[] row= {data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data13,data14,data15};
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				model1.addRow(row);
				TF4.setText(data13);
				TF5.setText(data14);
				TF6.setText(data15);
			}
		});
		bttn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttn1.setForeground(new Color(51, 153, 0));
		bttn1.setBounds(40, 518, 101, 23);
		frame.getContentPane().add(bttn1);
		
		
		JButton bttn2 = new JButton("Delete");
		bttn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1)
				{
				if(table.getRowCount()>0)
				{
					JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
					JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(table.getSelectedRow());
				}			}
		});
		bttn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttn2.setForeground(new Color(255, 0, 0));
		bttn2.setBounds(178, 518, 89, 23);
		frame.getContentPane().add(bttn2);
		
		JButton bttn3 = new JButton("Show report");
		bttn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*int row=table.getSelectedRow();
				String data1=(String)table.getValueAt(row,0);
				String data2=(String)table.getValueAt(row,1);
				String data3=(String)table.getValueAt(row,2);
				String data4=(String)table.getValueAt(row,3);
				String data5=(String)table.getValueAt(row,4);
				String data6=(String)table.getValueAt(row,5);
				String data7=(String)table.getValueAt(row,6);
				String data8=(String)table.getValueAt(row,7);
				String data9=(String)table.getValueAt(row,8);
				String data10=(String)table.getValueAt(row,9);
				String data11=(String)table.getValueAt(row,10);
				String data12=(String)table.getValueAt(row,11);
				String data13=(String)table.getValueAt(row,12);
				String data14=(String)table.getValueAt(row,13);*/
				txtrStudentRecordStudent.append("Student Record\n"
						+ "Student Name :\t\t"+TF2.getText()+" "+TF3.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + TF7.getText()
						+ "\nEnglish:\t\t" + TF8.getText()
						+ "\nBiology:\t\t" + TF9.getText()
						+ "\nComputer:\t\t" +TF10.getText()
						+ "\nChemistry:\t\t" + TF11.getText()
						+ "\nPysics:\t\t" + TF12.getText()
						+ "\nTamil:\t\t" + TF13.getText()
						+ "\nMalayalam:\t\t" + TF14.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + TF4.getText()
						+ "\nAverage:\t\t" + TF5.getText()
						+ "\nRanking:\t\t" +TF6.getText() + "\n"
						);
			}
		});
		bttn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttn3.setForeground(new Color(0, 0, 205));
		bttn3.setBounds(304, 518, 113, 23);
		frame.getContentPane().add(bttn3);
		
		JButton bttn4 = new JButton("exit");
		bttn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bttn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttn4.setForeground(new Color(220, 20, 60));
		bttn4.setBounds(449, 518, 89, 23);
		frame.getContentPane().add(bttn4);
		
		JButton bttn5 = new JButton("reset");
		bttn5.addActionListener(new ActionListener() {
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
				TF13.setText("");
				TF14.setText("");
				
			}
		});
		bttn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		bttn5.setForeground(new Color(148, 0, 211));
		bttn5.setBounds(594, 518, 89, 23);
		frame.getContentPane().add(bttn5);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrStudentRecordStudent.setText("");
			}
		});
		btnClear.setForeground(new Color(0, 0, 255));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(173, 300, 89, 23);
		panel2.add(btnClear);
		
		
	}
}
