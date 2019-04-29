package exercicio6.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class MenuSobre extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSobre frame = new MenuSobre();
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
	public MenuSobre() {
		setBounds(100, 100, 450, 300);

	}

}
