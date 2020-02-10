/** things to do:
 * 
 * 1) create linkedhashmap
 * 2) put json words into linkedhashmap
 * 3) create functions to work with GUI and add to linkedhashmap
 *
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.google.gson.*;

public class GUIFrame {

	private JFrame frmDictionary;
	private JTextField searchBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField wordInfoDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFrame window = new GUIFrame();
					window.frmDictionary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDictionary = new JFrame();
		frmDictionary.setTitle("Dictionary");
		frmDictionary.setBounds(100, 100, 686, 535);
		frmDictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton addWordBtn = new JButton("Add Word");
		addWordBtn.setBounds(6, 6, 117, 29);
		addWordBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// new field/frame? appears to add word to dictionary
				
			}
		});
		addWordBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		addWordBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmDictionary.getContentPane().setLayout(null);
		frmDictionary.getContentPane().add(addWordBtn);
		
		JButton removeWordBtn = new JButton("Remove Word");
		removeWordBtn.setBounds(122, 6, 117, 29);
		removeWordBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		frmDictionary.getContentPane().add(removeWordBtn);
		
		searchBox = new JTextField("Search...");
		searchBox.setBounds(6, 34, 233, 38);
		searchBox.setFont(new Font("Chalkboard", Font.PLAIN, 18));
		searchBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(searchBox.getText().equals("Search...")) {
					searchBox.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(!searchBox.getText().equals("Search...")) {
					searchBox.setText("Search...");
				}
			}
		});
		frmDictionary.getContentPane().add(searchBox);
		searchBox.setColumns(10);
		
		JRadioButton aToZRdoBtn = new JRadioButton("A to Z");
		aToZRdoBtn.setBounds(6, 70, 141, 23);
		aToZRdoBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		aToZRdoBtn.setSelected(true);
		buttonGroup.add(aToZRdoBtn);
		frmDictionary.getContentPane().add(aToZRdoBtn);
		
		JRadioButton zToARdoBtn = new JRadioButton("Z to A");
		zToARdoBtn.setBounds(6, 95, 141, 23);
		zToARdoBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		buttonGroup.add(zToARdoBtn);
		frmDictionary.getContentPane().add(zToARdoBtn);
		
		JList wordList = new JList();
		wordList.setBounds(6, 119, 233, 388);
		wordList.setFont(new Font("Chalkboard", Font.PLAIN, 12));
		frmDictionary.getContentPane().add(wordList);
		
		wordInfoDisplay = new JTextField();
		wordInfoDisplay.setBounds(251, 70, 429, 437);
		wordInfoDisplay.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		wordInfoDisplay.setText("No word selected.");
		wordInfoDisplay.setHorizontalAlignment(JTextField.CENTER);
		wordInfoDisplay.setEditable(false);
		frmDictionary.getContentPane().add(wordInfoDisplay);
		wordInfoDisplay.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dictionary");
		lblNewLabel.setBounds(260, 11, 332, 61);
		lblNewLabel.setFont(new Font("Chalkboard", Font.BOLD, 47));
		frmDictionary.getContentPane().add(lblNewLabel);

	}
}
