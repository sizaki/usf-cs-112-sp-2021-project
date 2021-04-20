package DataAnalytics;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {
public static void main(String[] args) {
	System.out.println("enter what k is");
	Scanner input = new Scanner(System.in);
	int k = input.nextInt();
	KNNPredictor test =new KNNPredictor(k);
	ArrayList<DataPoint> data = test.readData("titanic.csv");
	System.out.println(test.getAccuracy(data));
	System.out.println(test.getPrecision(data));
}
}
