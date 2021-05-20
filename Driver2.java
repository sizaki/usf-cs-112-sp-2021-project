package DataAnalytics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Driver2 {
public static void main(String[] args) {
	System.out.println("enter what k is");
	Scanner input = new Scanner(System.in);
	int k = input.nextInt();
	KNNPredictor test =new KNNPredictor(k);
	ArrayList<DataPoint> data = test.readData("titanic.csv");
	System.out.println(test.getAccuracy(data));
	System.out.println(test.getPrecision(data));
	
	JLabel label = new JLabel("Choose the majority value");
	label.setVisible(true);



	 final int MIN = 2;
	 final int MAX = 25;
	 final int INIT = 5;    

	JSlider slider = new JSlider(JSlider.HORIZONTAL, MIN, MAX, INIT);
	//slider.addChangeListener(Slider);


	slider.setMajorTickSpacing(5);
	slider.setMinorTickSpacing(1);
	slider.setPaintTicks(true);
	slider.setPaintLabels(true);
	slider.setSnapToTicks(true);




	JButton b=new JButton("Run Test");
	  b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	    int value = slider.getValue(); 
	    value = value * 2 + 1;
	    
	    KNNPredictor model = new KNNPredictor(value);
	    ArrayList<DataPoint> list = model.readData("titanic.csv");
	    System.out.println(model.getAccuracy(list));
	    System.out.println(model.getPrecision(list));
	        }  
	    });  
}
}

