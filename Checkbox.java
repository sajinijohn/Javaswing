package temp;
import java.awt.event.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkbox window = new Checkbox();
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
	public Checkbox() {
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
		
		JCheckBox chckbxC = new JCheckBox("c++");
		chckbxC.setBounds(38, 59, 97, 23);
		frame.getContentPane().add(chckbxC);
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(38, 100, 97, 23);
		frame.getContentPane().add(chckbxJava);
		
		JLabel label = new JLabel("");
		label.setBounds(31, 206, 375, 34);
		frame.getContentPane().add(label);
		chckbxC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("c++ "+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		chckbxJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("Java "+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
	}
}
