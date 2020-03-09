import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddWord {

	public JFrame addWordFrame;
	private JTextField wordTextField;
	private JTextField posTextField;
	private JTextField definitionTextField;
	private JTextField synonymsTextField;
	private JTextField antonymsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWord window = new AddWord();
					window.addWordFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddWord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addWordFrame = new JFrame();
		addWordFrame.setTitle("Add Word");
		addWordFrame.setBounds(100, 100, 450, 331);
		addWordFrame.setLocationRelativeTo(null);
		addWordFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		addWordFrame.getContentPane().setLayout(null);
		
		JLabel wordLabel = new JLabel("Word");
		wordLabel.setBounds(6, 6, 61, 16);
		wordLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(wordLabel);
		
		wordTextField = new JTextField();
		wordTextField.setBounds(6, 23, 130, 26);
		wordTextField.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(wordTextField);
		wordTextField.setColumns(10);
		
		JLabel addWordLabel = new JLabel("Add Word");
		addWordLabel.setBounds(235, 6, 166, 40);
		addWordLabel.setFont(new Font("Chalkboard", Font.PLAIN, 32));
		addWordFrame.getContentPane().add(addWordLabel);
		
		posTextField = new JTextField();
		posTextField.setBounds(6, 78, 130, 26);
		posTextField.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		posTextField.setColumns(10);
		addWordFrame.getContentPane().add(posTextField);
		
		JLabel posLabel = new JLabel("Part of Speech");
		posLabel.setBounds(6, 61, 113, 16);
		posLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(posLabel);
		
		definitionTextField = new JTextField();
		definitionTextField.setBounds(6, 133, 283, 26);
		definitionTextField.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		definitionTextField.setColumns(10);
		addWordFrame.getContentPane().add(definitionTextField);
		
		JLabel definitionLabel = new JLabel("Definition");
		definitionLabel.setBounds(6, 116, 61, 16);
		definitionLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(definitionLabel);
		
		synonymsTextField = new JTextField();
		synonymsTextField.setBounds(6, 188, 130, 26);
		synonymsTextField.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		synonymsTextField.setColumns(10);
		addWordFrame.getContentPane().add(synonymsTextField);
		
		JLabel synonymsLabel = new JLabel("Synonyms");
		synonymsLabel.setBounds(6, 171, 61, 16);
		synonymsLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(synonymsLabel);
		
		antonymsTextField = new JTextField();
		antonymsTextField.setBounds(6, 243, 130, 26);
		antonymsTextField.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		antonymsTextField.setColumns(10);
		addWordFrame.getContentPane().add(antonymsTextField);
		
		JLabel antonymsLabel = new JLabel("Antonyms");
		antonymsLabel.setBounds(6, 226, 61, 16);
		antonymsLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(antonymsLabel);
		
		JButton closeWindowButton = new JButton("Close Window");
		closeWindowButton.setBounds(327, 274, 117, 29);
		closeWindowButton.setFocusPainted(false);
		closeWindowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addWordFrame.dispose();
			}
		});
		closeWindowButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(closeWindowButton);
		
		JButton addWordButton = new JButton("Add");
		addWordButton.setBounds(133, 23, 61, 29);
		addWordButton.setFocusPainted(false);
		addWordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addWordButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(addWordButton);
		
		JButton synonymsAddButton = new JButton("Add");
		synonymsAddButton.setBounds(133, 188, 61, 29);
		synonymsAddButton.setFocusPainted(false);
		synonymsAddButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(synonymsAddButton);
		
		JButton antonymsAddButton = new JButton("Add");
		antonymsAddButton.setBounds(133, 243, 61, 29);
		antonymsAddButton.setFocusPainted(false);
		antonymsAddButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(antonymsAddButton);
		
		JButton addWordPOSbtn = new JButton("Add Word & P.O.S.");
		addWordPOSbtn.setBounds(287, 133, 157, 29);
		addWordPOSbtn.setFocusPainted(false);
		addWordPOSbtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(addWordPOSbtn);
	}
}
