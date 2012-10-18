package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class SettingsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingsFrame frame = new SettingsFrame();
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
	public SettingsFrame() {
		setResizable(false);
		setTitle("Game Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(143, 61, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel name1Label = new JLabel("Your Name:");
		name1Label.setBounds(27, 64, 92, 14);
		contentPane.add(name1Label);
		
		JLabel languageLabel = new JLabel("Language:");
		languageLabel.setBounds(314, 64, 90, 14);
		contentPane.add(languageLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"English", "Spanish", "French", "German"}));
		comboBox.setBounds(438, 58, 92, 20);
		contentPane.add(comboBox);
		
		JButton btnAddPlayer = new JButton("Add Player");
		btnAddPlayer.setBounds(143, 291, 109, 23);
		contentPane.add(btnAddPlayer);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 129, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 104, 503, 2);
		contentPane.add(separator);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 186, 128, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(143, 244, 128, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblOpponent = new JLabel("Opponent 1:");
		lblOpponent.setBounds(27, 132, 92, 14);
		contentPane.add(lblOpponent);
		
		JLabel lblOpponent_1 = new JLabel("Opponent 2:");
		lblOpponent_1.setBounds(27, 185, 92, 14);
		contentPane.add(lblOpponent_1);
		
		JLabel lblOpponent_2 = new JLabel("Opponent 3:");
		lblOpponent_2.setBounds(27, 247, 92, 14);
		contentPane.add(lblOpponent_2);
		
		JTextArea txtrWelcomeToPhase = new JTextArea();
		txtrWelcomeToPhase.setEditable(false);
		txtrWelcomeToPhase.setWrapStyleWord(true);
		txtrWelcomeToPhase.setText("Welcome to Phase 10! Select your options for the game \nand we will begin!");
		txtrWelcomeToPhase.setBounds(60, 11, 436, 39);
		contentPane.add(txtrWelcomeToPhase);
		
		JRadioButton radioButton = new JRadioButton("Human");
		radioButton.setBounds(295, 178, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Computer");
		radioButton_1.setSelected(true);
		radioButton_1.setBounds(295, 198, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Human");
		radioButton_2.setBounds(295, 113, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Computer");
		radioButton_3.setSelected(true);
		radioButton_3.setBounds(295, 133, 109, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Human");
		radioButton_4.setBounds(295, 238, 109, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Computer");
		radioButton_5.setSelected(true);
		radioButton_5.setBounds(295, 258, 109, 23);
		contentPane.add(radioButton_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(438, 129, 28, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(438, 186, 28, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(438, 244, 28, 20);
		contentPane.add(comboBox_3);
		
		JButton btnNewButton = new JButton("Begin!");
		btnNewButton.setBounds(227, 333, 109, 42);
		contentPane.add(btnNewButton);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
