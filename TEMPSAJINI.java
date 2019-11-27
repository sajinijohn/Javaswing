package temp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TEMPSAJINI {

	private JFrame frame;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TEMPSAJINI window = new TEMPSAJINI();
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
	public TEMPSAJINI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegree = new JLabel("Degree :");
		lblDegree.setBounds(69, 49, 46, 14);
		frame.getContentPane().add(lblDegree);
		
		textField1 = new JTextField();
		textField1.setBounds(180, 46, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lb2 = new JLabel("");
		lb2.setBounds(180, 137, 46, 14);
		frame.getContentPane().add(lb2);
		
		JButton btnToKelvin = new JButton("To Kelvin");
		btnToKelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String degre=textField1.getText();
				float a=Float.parseFloat(degre);
				float b=(float)(a+273.15);
				String c=String.valueOf(b);
				lb2.setText(c);
				
			}
		});
		btnToKelvin.setBounds(52, 195, 89, 23);
		frame.getContentPane().add(btnToKelvin);
		
		JButton btnToFarenheit = new JButton("To Farenheit");
		btnToFarenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textField=textField1.getText();
				float a=Float.parseFloat(textField);
				float b=(float)((1.8*a)+32);
				String c=String.valueOf(b);
				lb2.setText(c);
			}
		});
		btnToFarenheit.setBounds(218, 195, 89, 23);
		frame.getContentPane().add(btnToFarenheit);
	}

}
