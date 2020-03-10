import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIFrame {

	public JRadioButton aToZRdoBtn;
	private JFrame frmDictionary;
	private JTextField searchBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	JList<String> wordList;
	JScrollPane listScroller;
	@SuppressWarnings("rawtypes")
	List jsonArray;
	String result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFrame window = new GUIFrame(true);
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
	public GUIFrame(boolean firstRun) {
		initialize(firstRun);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize(boolean firstRun) {
		frmDictionary = new JFrame();
		frmDictionary.setTitle("Dictionary");
		frmDictionary.setBounds(100, 100, 686, 535);
		frmDictionary.setLocationRelativeTo(null);
		frmDictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add word button
		JButton addWordBtn = new JButton("Add Word");
		addWordBtn.setBounds(6, 6, 117, 29);
		addWordBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		frmDictionary.getContentPane().setLayout(null);
		addWordBtn.setFocusPainted(false);
		addWordBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		frmDictionary.getContentPane().add(addWordBtn);

		// remove word button
		JButton removeWordBtn = new JButton("Remove Word");
		removeWordBtn.setBounds(122, 6, 117, 29);
		removeWordBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RemoveWord window = new RemoveWord();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		removeWordBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		removeWordBtn.setFocusPainted(false);
		frmDictionary.getContentPane().add(removeWordBtn);

		// search box
		searchBox = new JTextField("Search...");
		searchBox.setBounds(6, 34, 233, 38);
		searchBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		searchBox.setFont(new Font("Chalkboard", Font.PLAIN, 18));

		// adds/removes placeholder when focus gained/lost
		searchBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (searchBox.getText().equals("Search...")) {
					searchBox.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (!searchBox.getText().equals("Search...")) {
					searchBox.setText("Search...");
				}
			}
		});
		frmDictionary.getContentPane().add(searchBox);
		searchBox.setColumns(10);

		// A to Z radio button
		aToZRdoBtn = new JRadioButton("A to Z");
		aToZRdoBtn.setBounds(6, 70, 141, 23);
		aToZRdoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sort A to Z
				DefaultListModel<String> listModel = new DefaultListModel<>();
				ArrayList<Word> jsonArray = GSONread.returnWords(true);
				for (int i = 0; i < jsonArray.size(); i++) {
					listModel.addElement(jsonArray.get(i).getName().toString());
				}
				wordList.setModel(listModel);
			}
		});
		aToZRdoBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		aToZRdoBtn.setSelected(true);
		aToZRdoBtn.setFocusPainted(false);
		buttonGroup.add(aToZRdoBtn);
		frmDictionary.getContentPane().add(aToZRdoBtn);

		// Z to A radio button
		JRadioButton zToARdoBtn = new JRadioButton("Z to A");
		zToARdoBtn.setBounds(6, 95, 141, 23);
		zToARdoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sort Z to A
				DefaultListModel<String> listModel = new DefaultListModel<>();
				ArrayList<Word> jsonArray = GSONread.returnWords(false);
				for (int i = 0; i < jsonArray.size(); i++) {
					listModel.addElement(jsonArray.get(i).getName().toString());
				}
				wordList.setModel(listModel);
			}
		});
		zToARdoBtn.setFont(new Font("Chalkboard", Font.PLAIN, 13));
		zToARdoBtn.setFocusPainted(false);
		buttonGroup.add(zToARdoBtn);
		frmDictionary.getContentPane().add(zToARdoBtn);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Chalkboard", Font.PLAIN, 16));
		textPane.setBounds(251, 70, 429, 437);
		frmDictionary.getContentPane().add(textPane);

		jsonArray = GSONread.returnWords(true);

		wordList = new JList();
		DefaultListModel<String> listModel = new DefaultListModel<>();
		ArrayList<Word> jsonArray = GSONread.returnWords(true);
		for (int i = 0; i < jsonArray.size(); i++) {
			listModel.addElement(jsonArray.get(i).getName().toString());
		}
		wordList.setModel(listModel);
		wordList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = wordList.locationToIndex(e.getPoint());
				result = "Word: " + Dictionary.getNames().get(index);
				result += "\n" + Dictionary.getFormattedWordDefinitions(index);
				result += "\n" + Dictionary.getFormattedSyns(index);
				result += "\n" + Dictionary.getFormattedAnts(index);
				textPane.setText(result);
			}
		});
		wordList.setBounds(6, 119, 233, 388);
		wordList.setFont(new Font("Chalkboard", Font.PLAIN, 12));

		listScroller = new JScrollPane();
		listScroller.setBounds(6, 119, 233, 388);
		listScroller.setViewportView(wordList);
		wordList.setLayoutOrientation(JList.VERTICAL);
		frmDictionary.getContentPane().add(listScroller);

		// label at the top of window
		JLabel lblNewLabel = new JLabel("Dictionary");
		lblNewLabel.setBounds(260, 11, 332, 61);
		lblNewLabel.setFont(new Font("Chalkboard", Font.BOLD, 47));
		frmDictionary.getContentPane().add(lblNewLabel);

	}
}