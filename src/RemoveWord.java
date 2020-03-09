import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveWord {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public RemoveWord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 164);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel exclamation = new JLabel("!");
		exclamation.setBounds(31, 6, 25, 130);
		exclamation.setFont(new Font("Chalkboard", Font.PLAIN, 99));
		frame.getContentPane().add(exclamation);
		
		JLabel warning = new JLabel("WARNING!");
		warning.setBounds(68, 19, 105, 16);
		warning.setFont(new Font("Chalkboard", Font.BOLD, 18));
		frame.getContentPane().add(warning);
		
		JTextArea txtrYouAreAbout = new JTextArea();
		txtrYouAreAbout.setLineWrap(true);
		txtrYouAreAbout.setText("You are about to delete a word. This action cannot be undone.\n\nAre you sure you wish to proceed?");
		txtrYouAreAbout.setBounds(68, 47, 321, 70);
		txtrYouAreAbout.setBackground(new Color(238, 238, 238));
		frame.getContentPane().add(txtrYouAreAbout);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		cancelButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		cancelButton.setBounds(370, 113, 80, 29);
		frame.getContentPane().add(cancelButton);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		deleteButton.setBounds(296, 113, 80, 29);
		frame.getContentPane().add(deleteButton);
	}
}
