import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Are you EMIYA?");
		System.out.println("Then you may enter!");

		Board gb = new Board();
        JFrame frame = new JFrame("FATE - XO.DIUS");
        JComponent board = gb.getGui();
        frame.add(board);
        frame.setLocationByPlatform(true);
        //frame.setMinimumSize(frame.getSize());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //frame.setPreferredSize(new Dimension(100, 100));
        board.setMinimumSize(new Dimension(300, 300));
        board.setPreferredSize(new Dimension(300, 300));
        frame.setMinimumSize(new Dimension(300, 300));
        frame.setLocation(50, 50);
        frame.pack();
        frame.setVisible(true);
	}
}
