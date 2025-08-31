\\# Alfa_costao
\\ java code for addition 
import java.awt.*;
import java.applet.*;
public class cadet extends Applet
{
	public void paint (Graphics d)
	{
		int x = 20,y = 40,add;
		add = x+y;
		String s1 ="Value of x is : "+String.valueOf(x);
		String s2 ="Value of y is : "+String.valueOf(y);
		String str ="Add is : "+String.valueOf(add);
		
		d.drawString(s1,100,50);
		d.drawString(s2,100,75);
		d.drawString(str,100,100);
	}
}

		
