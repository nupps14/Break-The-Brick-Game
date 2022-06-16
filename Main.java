package breakbricker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj=new JFrame();
		Gameplay Gameplay1=new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Break The Brick");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(Gameplay1);
		
		
	}

}