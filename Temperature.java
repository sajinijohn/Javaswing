package temp;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class Temperature {
    private JFrame frame;
	private JTextField tfinput;
	private JTextField tfoutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature window = new Temperature();
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
	public Temperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 434, 0);
		frame.getContentPane().add(label);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblInput.setBounds(108, 34, 46, 20);
		frame.getContentPane().add(lblInput);
		
		tfinput = new JTextField();
		tfinput.setBounds(154, 31, 86, 20);
		frame.getContentPane().add(tfinput);
		tfinput.setColumns(10);
		
		JLabel InputScale = new JLabel("Input Scale");
		InputScale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		InputScale.setBounds(29, 80, 76, 20);
		frame.getContentPane().add(InputScale);
		
		JLabel lblOtputScale = new JLabel("Output Scale");
		lblOtputScale.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOtputScale.setBounds(325, 83, 81, 14);
		frame.getContentPane().add(lblOtputScale);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOutput.setBounds(108, 222, 46, 29);
		frame.getContentPane().add(lblOutput);
		
		tfoutput = new JTextField();
		tfoutput.setBounds(170, 227, 86, 20);
		frame.getContentPane().add(tfoutput);
		tfoutput.setColumns(10);
		
		JRadioButton rdbtnCelcius = new JRadioButton("Celcius");
		rdbtnCelcius.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnCelcius.setBounds(29, 123, 109, 23);
		frame.getContentPane().add(rdbtnCelcius);
		
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnFahrenheit.setBounds(29, 157, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit);
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnKelvin.setBounds(29, 192, 109, 23);
		frame.getContentPane().add(rdbtnKelvin);
		ButtonGroup G1=new ButtonGroup();
		G1.add(rdbtnCelcius);
		G1.add(rdbtnFahrenheit);
        G1.add(rdbtnKelvin);
		
		JRadioButton rdbtnCelcius1 = new JRadioButton("Celcius");
		rdbtnCelcius1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnCelcius1.setBounds(319, 123, 109, 23);
		frame.getContentPane().add(rdbtnCelcius1);
		
		JRadioButton rdbtnFahrenheit1 = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnFahrenheit1.setBounds(319, 157, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit1);
		
		JRadioButton rdbtnKelvin_1 = new JRadioButton("Kelvin");
		rdbtnKelvin_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnKelvin_1.setBounds(319, 192, 109, 23);
		frame.getContentPane().add(rdbtnKelvin_1);
		ButtonGroup G2=new ButtonGroup();
		G2.add(rdbtnCelcius1);
		G2.add(rdbtnFahrenheit1);
        G2.add(rdbtnKelvin_1);
        rdbtnCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=tfinput.getText();
				float a=Float.parseFloat(in);
				if(rdbtnCelcius1.isSelected())
				{
					tfoutput.setText(in);
				}
				else if(rdbtnFahrenheit1.isSelected())
				{
					float a1=(float)((1.8*a)+32);
					String a11=String.valueOf(a1);
					tfoutput.setText(a11);
				}
				else if(rdbtnKelvin_1.isSelected())
				{
					float a12=(float)(a+273.15);
					String a112=String.valueOf(a12);
					tfoutput.setText(a112);
				}
			}
		});
        rdbtnFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=tfinput.getText();
				float b=Float.parseFloat(in);
				if(rdbtnCelcius1.isSelected())
				{
					float b1=(float)(((b-32)*5)/9);
					String b11=String.valueOf(b1);
					tfoutput.setText(b11);
				}
				else if(rdbtnFahrenheit1.isSelected())
				{
					tfoutput.setText(in);
				}
				else if(rdbtnKelvin_1.isSelected())
				{
					float b12=(float)((((b-32)*5)/9)+273.15);
					String b112=String.valueOf(b12);
					tfoutput.setText(b112);
				}
			}
		});
        rdbtnKelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=tfinput.getText();
				float c=Float.parseFloat(in);
				if(rdbtnCelcius1.isSelected())
				{
					float c1=(float)(c-273.15);
					String c11=String.valueOf(c1);
					tfoutput.setText(c11);
				}
				else if(rdbtnFahrenheit1.isSelected())
				{
					float c12=(float)((((c-273.15)*9)/5)+32);
					String c112=String.valueOf(c12);
					tfoutput.setText(c112);
				}
				else if(rdbtnKelvin_1.isSelected())
				{
					tfoutput.setText(in);
				}
			}
		});
        rdbtnCelcius1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String out=tfinput.getText();
				float a=Float.parseFloat(out);
				if(rdbtnCelcius.isSelected())
				{
					tfoutput.setText(out);
				}
				else if(rdbtnFahrenheit.isSelected())
				{
					float a1=(float)(((a-32)*5)/9);
					String a11=String.valueOf(a1);
					tfoutput.setText(a11);
				}
				else if(rdbtnKelvin.isSelected())
				{
					float a12=(float)(a-273.15);
					String a112=String.valueOf(a12);
					tfoutput.setText(a112);
				}
				
			}
		});
        rdbtnFahrenheit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String out=tfinput.getText();
				float b=Float.parseFloat(out);
				if(rdbtnCelcius.isSelected())
				{
					float b1=(float)((1.8*b)+32);
					String b11=String.valueOf(b1);
					tfoutput.setText(b11);
				}
				else if(rdbtnFahrenheit.isSelected())
				{
					tfoutput.setText(out);
				}
				else if(rdbtnKelvin.isSelected())
				{
					float b12=(float)((((b-273.15)*9)/5)+32);
					String b112=String.valueOf(b12);
					tfoutput.setText(b112);
				}
			}
		});
        rdbtnKelvin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String out=tfinput.getText();
				float c=Float.parseFloat(out);
				if(rdbtnCelcius.isSelected())
				{
					float c1=(float)(c+273.15);
					String c11=String.valueOf(c1);
					tfoutput.setText(c11);
				}
				else if(rdbtnFahrenheit.isSelected())
				{
					float c12=(float)((((c-32)*5)/9)+273.15);
					String c112=String.valueOf(c12);
					tfoutput.setText(c112);
				}
				else if(rdbtnKelvin.isSelected())
				{
					tfoutput.setText(out);
				}
			}
		});
		
		
	}
}
