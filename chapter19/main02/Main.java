package sukkiri.chapter19.main02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("SampleWindow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contPane = new JPanel();
		contPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contPane);
		contPane.setLayout(new BorderLayout(0, 0));
		
		JLabel label1 = new JLabel("Hello");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		contPane.add(label1, BorderLayout.NORTH);
		
		JButton button = new JButton("New button");
		contPane.add(button, BorderLayout.CENTER);

	}

}
