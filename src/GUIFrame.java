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

public class GUIFrame {

	private JFrame frmDictionary;
	private JTextField txtThe;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;

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
		frmDictionary.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add Word");
		btnNewButton.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(6, 6, 117, 29);
		frmDictionary.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Word");
		btnNewButton_1.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		btnNewButton_1.setBounds(122, 6, 117, 29);
		frmDictionary.getContentPane().add(btnNewButton_1);
		
		txtThe = new JTextField("Search...");
		txtThe.setFont(new Font("Chalkboard", Font.PLAIN, 18));
		txtThe.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtThe.getText().equals("Search...")) {
					txtThe.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(!txtThe.getText().equals("Search...")) {
					txtThe.setText("Search...");
				}
			}
		});
		txtThe.setBounds(6, 34, 233, 38);
		frmDictionary.getContentPane().add(txtThe);
		txtThe.setColumns(10);
		
		JRadioButton aToZRdoBtn = new JRadioButton("A to Z");
		aToZRdoBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		aToZRdoBtn.setSelected(true);
		buttonGroup.add(aToZRdoBtn);
		aToZRdoBtn.setBounds(6, 70, 141, 23);
		frmDictionary.getContentPane().add(aToZRdoBtn);
		
		JRadioButton zToARdoBtn = new JRadioButton("Z to A");
		zToARdoBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		buttonGroup.add(zToARdoBtn);
		zToARdoBtn.setBounds(6, 95, 141, 23);
		frmDictionary.getContentPane().add(zToARdoBtn);
		
		JList list = new JList();
		list.setFont(new Font("Chalkboard", Font.PLAIN, 12));
		list.setBounds(6, 119, 233, 388);
		frmDictionary.getContentPane().add(list);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(251, 70, 429, 437);
		frmDictionary.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dictionary");
		lblNewLabel.setFont(new Font("Chalkboard", Font.BOLD, 47));
		lblNewLabel.setBounds(260, 11, 332, 61);
		frmDictionary.getContentPane().add(lblNewLabel);
//        textField.setPlaceholder("All your base are belong to us!");

	}
}
