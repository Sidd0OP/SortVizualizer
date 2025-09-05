package drawable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

import sort.BubbleSort;
import sort.CountSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.SelectionSort;

public class Canvas extends JPanel implements Runnable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame window;
	private Thread thread = new Thread(this);
	
	private long deltaTime = 0l;	
	private long timeStart = 0l;
	private long timeEnd = 0l;
	
	private long nano = 1000000000;
	private long timeLeftToWait = 0;
	
	private final int ARRAY_LENGTH = 250; 
	
	
	/* |---------- FPS ---------------| */
	private int FPS =  120; //30 , 60 , 120 FPS
	
	
	
	BubbleSort bSort = new BubbleSort(0,0 , "Bubble");
	SelectionSort sSort = new SelectionSort(1,0 , "Selection");
	InsertionSort iSort = new InsertionSort(2,0 , "Insertion");
	QuickSort qSort = new QuickSort(0,1 , "Quick");
	MergeSort mSort = new MergeSort(1,1 , "Merge");
	CountSort cSort = new CountSort(1,1 , "Count");
	
	public Canvas(JFrame window) 
	{
		this.window = window;
		this.setBackground(Color.BLACK);
		
		this.setDoubleBuffered(true);
		this.setPreferredSize(new Dimension(1500,600));
		this.setFocusable(true);
		
	
	}
	
	
	
	
	
	private void initializeSorts() 
	{
		bSort.initializeList(ARRAY_LENGTH);
		sSort.initializeList(ARRAY_LENGTH);
		iSort.initializeList(ARRAY_LENGTH);
		qSort.initializeList(ARRAY_LENGTH);
		mSort.initializeList(ARRAY_LENGTH);
		cSort.initializeList(ARRAY_LENGTH);
	}
	
	
	public void start() 
	{
		initializeSorts(); 
		this.thread.start();
	}

	@Override
	public void run() 
	{
		long actualRunTime = nano / FPS;
		
		while(this.thread != null) 
		{
			timeStart = System.nanoTime();

			repaint();
			
			timeEnd = System.nanoTime();
			
			//IN nano seconds			
			deltaTime = timeEnd - timeStart ;
			
		
			
			if(actualRunTime > deltaTime) 
			{
				timeLeftToWait  = actualRunTime - deltaTime;
				
								
				try {
					Thread.sleep((long)timeLeftToWait/1000000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);		
		Graphics2D graphic2D = (Graphics2D) g;		
		graphic2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		        					RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		/*
		 * ||--------------------ALL SORT OBJECTS---------------------------------||
		 */
		bSort.draw(graphic2D);
		sSort.draw(graphic2D);
		iSort.draw(graphic2D);
		qSort.draw(graphic2D);
		mSort.draw(graphic2D);
		cSort.draw(graphic2D);
	}
	
	

}
