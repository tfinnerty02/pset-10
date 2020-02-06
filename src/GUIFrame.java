import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GUIFrame {

	private JFrame frame;
	private JTextField txtThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFrame window = new GUIFrame();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 686, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add Word");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Word");
		btnNewButton_1.setBounds(122, 6, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		txtThe = new JTextField("Search...");
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
		frame.getContentPane().add(txtThe);
		txtThe.setColumns(10);
//        textField.setPlaceholder("All your base are belong to us!");

	}
}
