import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
public class currency {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency window = new currency();
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
	public currency() {
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
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblInput.setBounds(39, 26, 46, 14);
		frame.getContentPane().add(lblInput);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"rupee", "dollar", "AED"}));
		comboBox1.setBounds(142, 24, 81, 20);
		frame.getContentPane().add(comboBox1);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAmount.setBounds(39, 70, 57, 14);
		frame.getContentPane().add(lblAmount);
		
		textField1 = new JTextField();
		textField1.setBounds(142, 68, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOutput.setBounds(39, 127, 46, 14);
		frame.getContentPane().add(lblOutput);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"rupee", "dollar", "AED"}));
		comboBox2.setBounds(147, 125, 81, 20);
		frame.getContentPane().add(comboBox2);
		
		
		
		textField2 = new JTextField();
		textField2.setBounds(228, 200, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField1.getText();
				float input = Float.parseFloat(in);
				 if(comboBox1.getSelectedItem()=="rupee")
		            {
		                if(comboBox2.getSelectedItem()=="rupee")
		                {
		                	textField2.setText(in);
		                }
		                else if(comboBox2.getSelectedItem()=="dollar")
		                {
		                	float result =(float )(input * 0.014);
		                	String output=String.valueOf(result);
		                	textField2.setText(output);
		                }
		                else if(comboBox2.getSelectedItem()=="AED")
		                {
		                	float result = (float)(input * 0.051);
		                	String output=String.valueOf(result);
		                	textField2.setText(output);
		                }
		            }
		            else if(comboBox1.getSelectedItem()=="dollar")
		            {
		            	if(comboBox2.getSelectedItem()=="rupee")
		                {
		            		float result = (float)(input * 71.78);
		                	String output=String.valueOf(result);
		                	textField2.setText(output);
		                }
		                else if(comboBox2.getSelectedItem()=="dollar")
		                {
		                	textField2.setText(in);
		                }
		                else if(comboBox2.getSelectedItem()=="AED")
		                {
		                	float result =(float) (input *3.67);
		                	String output=String.valueOf(result);
		                	textField2.setText(output);
		                }
		            }
		            else if(comboBox1.getSelectedItem()=="AED")
		            {

		            	if(comboBox2.getSelectedItem()=="rupee")
		                {
		            		float result = (float)(input * 19.53);
		                	String output=String.valueOf(result);
		                	textField2.setText(output);
		                }
		                else if(comboBox2.getSelectedItem()=="dollar")
		                {
		                	float result = (float)(input *0.27);
		                	String output=String.valueOf(result);
		                	textField2.setText(output);
		                }
		                else if(comboBox2.getSelectedItem()=="AED")
		                {
		                	textField2.setText(in);
		                }
		            }
			}
		});
		
		btnConvert.setBounds(53, 199, 89, 23);
		frame.getContentPane().add(btnConvert);
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(158, 228, 70, 23);
		frame.getContentPane().add(btnExit);
	}
}
