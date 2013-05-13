package ernesto.design.patterns.observedJava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserver {
	
	JFrame frame;
	
	public SwingObserver() {		
	}
	
	public static void main(String[] args) {
		SwingObserver so = new SwingObserver();
		so.go();
	}
	
	public void go() {
		frame = new JFrame();
		int windowWidth = 400;
		int windowHeight= 150;
		frame.setBounds(50, 100, windowWidth, windowHeight);
		
		JButton button = new JButton("Cliquea");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			System.out.println("Tu puedes!");
		}
	}
	
	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			System.out.println("No puedes!");
		}
	}
}
