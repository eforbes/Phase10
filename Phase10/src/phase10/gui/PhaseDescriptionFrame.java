package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhaseDescriptionFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhaseDescriptionFrame frame = new PhaseDescriptionFrame();
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
	public PhaseDescriptionFrame() {
		setTitle("Phase 1 Description");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel phaseLabel = new JLabel("Phase 1:");
		phaseLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		phaseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phaseLabel.setBounds(143, 11, 130, 52);
		contentPane.add(phaseLabel);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOkay.setBounds(163, 180, 89, 23);
		contentPane.add(btnOkay);
		
		JTextArea phaseDescription = new JTextArea();
		phaseDescription.setFont(new Font("Microsoft YaHei", Font.ITALIC, 19));
		phaseDescription.setLineWrap(true);
		phaseDescription.setWrapStyleWord(true);
		phaseDescription.setEditable(false);
		phaseDescription.setText("2 sets of 3");
		phaseDescription.setBounds(108, 84, 230, 66);
		contentPane.add(phaseDescription);
	}

}
