package geometrichapes;

public class Circle {

	private double xc;
	private double yc;
	private double r;
	
	public Circle(double xc, double yc, double r) {
		this.xc = xc;
		this.yc = yc;
		this.r = r;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xc) != Double.doubleToLongBits(other.xc))
			return false;
		if (Double.doubleToLongBits(yc) != Double.doubleToLongBits(other.yc))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [xc=" + xc + ", yc=" + yc + ", r=" + r + "]";
	}
	public double getXc() {
		return xc;
	}
	public void setXc(double xc) {
		this.xc = xc;
	}
	public double getYc() {
		return yc;
	}
	public void setYc(double yc) {
		this.yc = yc;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public double getXmin(){
		double Xmin;
		return(this.xc-this.r);
	}
	public double getYmin(){
		double Ymin;
		return(this.yc-this.r);
	}
	public double getXmax(){
		double Xmax;
		return(this.xc+this.r);
	}
	public double getYmax(){
		double Ymin;
		return(this.yc+this.r);
	}
	
	public boolean contains(Circle c){
		
	}
}
