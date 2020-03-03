package _01_prime_or_not;

import javax.swing.JOptionPane;

public class Ilikeprimes {

	public static void main(String[] args) {
String Bob = JOptionPane.showInputDialog("Give me a number, I will tell you if it is a prime or not.");
int Bob2 = Integer.parseInt(Bob);
for(int i =2; i < 100000; i++)
{
	if(i < Bob2) 
	{
	JOptionPane.showMessageDialog(null, "This is a prime.");	
	}
	if(Bob2%i==0 && !(i == Bob2)) 
	{
	
	JOptionPane.showMessageDialog(null, "This is not a prime, unless if the next thing says 'This is a prime'");
	
	 
		
	}
	else
	JOptionPane.showMessageDialog(null, "This is a prime.");
}

	}

}
