package vista;

import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Ex04_pane extends JFrame implements WindowListener{

	private JPanel contentPane;
	public TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex04_pane frame = new Ex04_pane();
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
	public Ex04_pane() {
		
		addWindowListener(this);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label_Eventos = new JLabel("Eventos");
		Label_Eventos.setBounds(10, 124, 45, 13);
		contentPane.add(Label_Eventos);
		
		textArea = new TextArea();
		textArea.setBounds(65, 10, 337, 243);
		contentPane.add(textArea);
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		textArea.append("\nFinestra oberta!\n");		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		textArea.append("\nTancant finestra!\n");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		textArea.append("\nFinestra tancada!\n");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		textArea.append("\nFinestra minimitzada!\n");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		textArea.append("\nFinestra desminimitzada!\n");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		textArea.append("\nFinestra activada!");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		textArea.append("\nFinestra desactivada!\n");
	}
}
