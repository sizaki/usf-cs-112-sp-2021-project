package DataAnalytics;
import javax.swing.*;
import java.util.ArrayList;
public class driver {
public static void main(String args[]) {
	DummyPredictor a=new DummyPredictor();
	a.readData("Dataset");
	JFrame MyFrame= new JFrame();
	JLabel label1=new JLabel("Accuracy="+ a.getAccuracy(new ArrayList())+" Precison="+a.getPrecision(new ArrayList()));
	
}
}
