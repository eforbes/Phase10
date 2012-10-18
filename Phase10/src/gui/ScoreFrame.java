package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ScoreFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreFrame frame = new ScoreFrame();
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
	public ScoreFrame() {
		setResizable(false);
		setTitle("Scores after round + roundNum");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setRowHeight(48);
		table.setShowHorizontalLines(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Place", "Name", "Current Phase", "Score"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.setBounds(36, 54, 370, 195);
		contentPane.add(table);
		
		JLabel lblPlace = new JLabel("Place");
		lblPlace.setBounds(53, 29, 46, 14);
		contentPane.add(lblPlace);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(142, 29, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblCurrentPhase = new JLabel("Current Phase");
		lblCurrentPhase.setBounds(220, 29, 88, 14);
		contentPane.add(lblCurrentPhase);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(333, 29, 46, 14);
		contentPane.add(lblScore);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setBounds(174, 300, 89, 23);
		contentPane.add(btnOkay);
	}
}
