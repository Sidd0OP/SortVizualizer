package drawable;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sort implements Runnable
{
	
	public int[] list;
	public String sortName = "Sort";
	
	int xPos = 0;
	int yPos = 0;
	
	int width = 520;
	int height = 310;
	
	int xOffset = 0;
	int yOffset = 0;
	
	int gap = 5;
	
	
	private int x1,y1,x2,y2;
	
	
	
	Thread thread = new Thread(this);
		
	public Sort(int xOffset, int yOffset , String name) {
		super();
		this.sortName =  name;
		this.xPos = (width * xOffset) + gap;
		this.yPos = (height * yOffset) + gap;

	}
	
	
	//some guys on stack overflow wrote this,ik that it shuffles array lol 
	private void shuffleArray(int[] array)
	{
	    int index;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        if (index != i)
	        {
	            array[index] ^= array[i];
	            array[i] ^= array[index];
	            array[index] ^= array[i];
	        }
	    }
	}
	
	
	public void initializeList(int size) 
	{
		list = new int[size];
		
		for(int i = 0; i < size; i++) 
		{
			list[i] = i;
		}
		
		shuffleArray(list);
		thread.start();

	}
	
	
	

	@Override
	public void run() 
	{
		
		sortFunction();
		
	}
	
	public void sortFunction() 
	{

	}
	
	public void draw(Graphics2D g2d) 
	{
		
		g2d.setColor(Color.DARK_GRAY);
		g2d.setStroke(new BasicStroke(1.5f));
		g2d.fillRoundRect(xPos, yPos, width - gap/2, height - gap/2 , 10 , 10);
		
		g2d.setColor(Color.white);
		g2d.setFont(new Font("SansSerif", Font.BOLD, 36));
		g2d.drawString(sortName, xPos + 20, yPos + 50);
		
		x1 = xPos + gap;
		
		g2d.setColor(Color.white);
		for(int i = 0; i < list.length; i++) 
		{
			x1 = x1 + 2;
			x2 = x1;
			
			y1 = yPos + height - gap;
			y2 = y1 - list[i];
			
			g2d.drawLine(x1, y1, x2, y2);
		}
		
		
		
				
	}
	
	
	
	
}
