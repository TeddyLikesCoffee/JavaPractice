
public class Area {
 private static final double PI=3.14;
 //private double radius=0.0;
  
  Area(){
  }
  
  public double calcArea(double radius) {
	  return PI*Math.pow(radius, 2);
  }
  
  public boolean checkUserInput(double radius) {
	  if(radius > 0) {
		  return true;
	  }else {
		  return false;
	  }
	  
  }
}
