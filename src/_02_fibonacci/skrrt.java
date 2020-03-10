package _02_fibonacci;

import javax.swing.JOptionPane;

public class skrrt {

	public static void main(String[] args) {
        int ff = 0;
		int sf = 1;
		JOptionPane.showMessageDialog(null, ("0 1"));
		for(int i = 0; i < 1000; i++)
			
		{	
			int c = ff+sf;
			ff=sf;
			sf=c;
			JOptionPane.showMessageDialog(null, ( sf));
		}

	}

}
