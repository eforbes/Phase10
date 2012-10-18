package gui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SkipInputFrame extends JFrame {
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkipInputFrame frame = new SkipInputFrame();
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
	public SkipInputFrame() {
		
		setTitle("Skip Player");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//begin message
		JTextPane txtpnHello = new JTextPane();
		txtpnHello.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHello.setEditable(false);
		txtpnHello.setText("You have discarded a skip card. Who \nwould you like to skip?");
		txtpnHello.setBounds(89, 25, 255, 44);
		contentPane.add(txtpnHello);
		//end message
		
		//begin radio buttons
		JRadioButton opponent1 = new JRadioButton("opponent1Name");
		opponent1.setSelected(true);
		buttonGroup.add(opponent1);
		opponent1.setBounds(45, 102, 109, 23);
		contentPane.add(opponent1);
		
		JRadioButton opponent2 = new JRadioButton("opponent2Name");
		buttonGroup.add(opponent2);
		opponent2.setBounds(45, 128, 109, 23);
		contentPane.add(opponent2);
		
		JRadioButton opponent3 = new JRadioButton("opponent3Name");
		buttonGroup.add(opponent3);
		opponent3.setBounds(45, 154, 109, 23);
		contentPane.add(opponent3);
		
		//begin buttons
		JButton btnOkay = new JButton("Okay");

		btnOkay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {  //what happens when the okay button is clicked is specified here

			}
		});
		btnOkay.setBounds(106, 202, 89, 23);
		contentPane.add(btnOkay);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {  //what happens when the cancel button is clicked is specified here
			}
		});
		btnCancel.setBounds(238, 202, 89, 23);
		contentPane.add(btnCancel);
		//end buttons
		
	}
}
