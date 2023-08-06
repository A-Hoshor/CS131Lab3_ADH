package arrayList;

public class PointThreeD {
	
	private double xPoint, yPoint, zPoint;
	
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end empty argument constructor
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred argument constructor
	
	

	public double getXPoint() {
		return xPoint;
	}//end getxPoint

	public void setXPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxpoint

	public double getYPoint() {
		return yPoint;
	}//end getypoint

	public void setYPoint(double yPoint) {
		this.yPoint = yPoint;
	}//endsetypoint

	public double getZPoint() {
		return zPoint;
	}//endgetzpoint

	public void setZPoint(double zPoint) {
		this.zPoint = zPoint;
	}//endsetzpoint

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
	

}//end class
