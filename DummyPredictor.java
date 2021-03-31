package DataAnalytics;
import java.util.ArrayList;
public class DummyPredictor extends Predictor{
public ArrayList<DataPoint> readData(String filename){
	System.out.println(filename);
	return new ArrayList();
}
public String test(DataPoint data) {
	return "";
}
public Double getAccuracy(ArrayList<DataPoint> data){
	return 0.0;
}
public Double getPrecision(ArrayList<DataPoint> data) {
	return 0.0;
}
}
