package helloPack;
import java.awt.Font;

import javax.swing.*;


public class HelloWorld extends JFrame{

	
	public static void main(String[] args) {
		
        JFrame jf = new JFrame("Hello World GUI");

        jf.setVisible(true);
        jf.setSize(400, 400);
        JLabel jl = new JLabel("EasyReserveVineet");
      
       
       Font labelFont = jl.getFont();
       jl.setFont(new Font("Courier New", Font.PLAIN, 35));
        jf.add(jl);
     
		System.out.println("Hello World Vineet !");


		

	}

}
