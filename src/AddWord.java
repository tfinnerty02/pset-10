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
		addWordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		textField = new JTextField();
		textField.setBounds(6, 78, 130, 26);
		textField.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		textField.setColumns(10);
		addWordFrame.getContentPane().add(textField);
		
		JLabel posTextField = new JLabel("Part of Speech");
		posTextField.setBounds(6, 61, 113, 16);
		posTextField.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(posTextField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 133, 283, 26);
		textField_1.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		textField_1.setColumns(10);
		addWordFrame.getContentPane().add(textField_1);
		
		JLabel definitionLabel = new JLabel("Definition");
		definitionLabel.setBounds(6, 116, 61, 16);
		definitionLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(definitionLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(6, 188, 130, 26);
		textField_2.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		textField_2.setColumns(10);
		addWordFrame.getContentPane().add(textField_2);
		
		JLabel synonymsLabel = new JLabel("Synonyms");
		synonymsLabel.setBounds(6, 171, 61, 16);
		synonymsLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(synonymsLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(6, 243, 130, 26);
		textField_3.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		textField_3.setColumns(10);
		addWordFrame.getContentPane().add(textField_3);
		
		JLabel antonymsLabel = new JLabel("Antonyms");
		antonymsLabel.setBounds(6, 226, 61, 16);
		antonymsLabel.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(antonymsLabel);
		
		JButton closeWindowButton = new JButton("Close Window");
		closeWindowButton.setBounds(327, 274, 117, 29);
		closeWindowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addWordFrame.dispose();
			}
		});
		closeWindowButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(closeWindowButton);
		
		JButton addWordButton = new JButton("Add");
		addWordButton.setBounds(133, 23, 61, 29);
		addWordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addWordButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(addWordButton);
		
		JButton synoynmsAddButton = new JButton("Add");
		synoynmsAddButton.setBounds(133, 188, 61, 29);
		synoynmsAddButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(synoynmsAddButton);
		
		JButton antonymsAddButton = new JButton("Add");
		antonymsAddButton.setBounds(133, 243, 61, 29);
		antonymsAddButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(antonymsAddButton);
		
		JButton addWordPOSbtn = new JButton("Add Word & P.O.S.");
		addWordPOSbtn.setBounds(287, 133, 157, 29);
		addWordPOSbtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordFrame.getContentPane().add(addWordPOSbtn);
	}
}
