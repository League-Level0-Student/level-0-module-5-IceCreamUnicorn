package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class HIFORLOOPGAUNTLET {

	public static void main(String[] args) {
		
		for(int i = 1; i < 9; i++)
		{
			i+=2;
			for(int j = 23; j < 1000; j++)
			{
				j+=2;
				System.out.println(i+ " " + j + " " + i);
			}
		}
	}
}
