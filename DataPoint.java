package DataAnalytics;
public class DataPoint {

private String label;

private Boolean isTest;

private Double f1;

private Double f2;

public DataPoint() {
	f1=0.0;
	f2=0.0;
	label="";
	isTest=false;
}

public DataPoint(double num1, double num2, String a, Boolean answer) {
	f1=num1;
	f2=num2;
	label=a;
	isTest=answer;
}
	
public String getlabel() {
	return label;
}
public void setlabel(String a) {
	label=a;
}

public Boolean getisTest() {
	return isTest;	
}
public void setisTest(Boolean answer) {
	isTest=answer;
}
public double getf1() {
	return f1;
}
public void setf1(double num1) {
	f1=num1;
}
public double getf2() {
	return f2;
}
public void setf2(double num2) {
	f2=num2;
}
}

