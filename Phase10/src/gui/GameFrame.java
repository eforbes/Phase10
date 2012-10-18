package gui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class GameFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	public GameFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameFrame.class.getResource("/gui/cardImages/GameIcon.png")));
		
		setTitle("CurrentPlayer - Phase 10");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1150, 668);
		getContentPane().setLayout(null);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBounds(982, 0, 169, 534);
		getContentPane().add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel lblPlayername = new JLabel("PlayerName");
		lblPlayername.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayername.setBounds(10, 37, 149, 38);
		infoPanel.add(lblPlayername);
		
		JLabel lblPhase = new JLabel("Phase");
		lblPhase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhase.setBounds(58, 91, 53, 25);
		infoPanel.add(lblPhase);
		
		JTextArea phaseNumber = new JTextArea();
		phaseNumber.setRows(1);
		phaseNumber.setColumns(1);
		phaseNumber.setFont(new Font("Century Gothic", Font.BOLD, 36));
		phaseNumber.setText("10");
		phaseNumber.setEditable(false);
		phaseNumber.setBounds(58, 120, 53, 53);
		infoPanel.add(phaseNumber);
		
		JButton btnPhaseDescription = new JButton("Phase Description");
		btnPhaseDescription.setBounds(10, 184, 149, 23);
		infoPanel.add(btnPhaseDescription);
		
		JButton btnScoreboard = new JButton("Scoreboard");
		btnScoreboard.setBounds(25, 291, 118, 23);
		infoPanel.add(btnScoreboard);
		
		JButton btnSaveAndExit = new JButton("Save and Exit");
		btnSaveAndExit.setBounds(22, 347, 124, 23);
		infoPanel.add(btnSaveAndExit);
		
		JButton btnExitWithoutSaving = new JButton("Exit without Saving");
		btnExitWithoutSaving.setBounds(5, 392, 154, 25);
		infoPanel.add(btnExitWithoutSaving);
		
		JPanel deckPanel = new JPanel();
		deckPanel.setBounds(982, 533, 169, 107);
		getContentPane().add(deckPanel);
		deckPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton deckButton = new JButton("New button");
		deckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		deckButton.setIcon(new ImageIcon(GameFrame.class.getResource("/gui/cardImages/card back.png")));
		deckPanel.add(deckButton);
		
		JButton discardButton = new JButton("New button");
		deckPanel.add(discardButton);
		
		JPanel handPanel = new JPanel();
		handPanel.setBounds(0, 533, 976, 107);
		getContentPane().add(handPanel);
		handPanel.setLayout(new GridLayout(0, 11, 0, 0));
		
		JButton hcardButton1 = new JButton("New button");
		handPanel.add(hcardButton1);
		
		JButton hcardButton2 = new JButton("New button");
		handPanel.add(hcardButton2);
		
		JButton hcardButton3 = new JButton("New button");
		handPanel.add(hcardButton3);
		
		JButton hcardButton4 = new JButton("New button");
		handPanel.add(hcardButton4);
		
		JButton hcardButton5 = new JButton("New button");
		handPanel.add(hcardButton5);
		
		JButton hcardButton6 = new JButton("New button");
		handPanel.add(hcardButton6);
		
		JButton hcardButton7 = new JButton("New button");
		handPanel.add(hcardButton7);
		
		JButton hcardButton8 = new JButton("New button");
		handPanel.add(hcardButton8);
		
		JButton hcardButton9 = new JButton("New button");
		handPanel.add(hcardButton9);
		
		JButton hcardButton10 = new JButton("New button");
		handPanel.add(hcardButton10);
		
		JButton hcardButton11 = new JButton("New button");
		handPanel.add(hcardButton11);
		
		JPanel playersPanel = new JPanel();
		playersPanel.setBounds(10, 11, 962, 416);
		getContentPane().add(playersPanel);
		playersPanel.setLayout(new BoxLayout(playersPanel, BoxLayout.X_AXIS));
		
		JPanel yourPhasesPanel = new JPanel();
		yourPhasesPanel.setBounds(0, 427, 972, 107);
		getContentPane().add(yourPhasesPanel);
	}
}
