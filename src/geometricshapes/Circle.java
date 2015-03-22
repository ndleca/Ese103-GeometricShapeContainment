package geometricshapes;

public class Circle {

	private double xc;
	private double yc;
	private double r;
	
	public Circle(double xc, double yc, double r) {
		this.xc = xc;
		this.yc = yc;
		if(r<=0)
			throw new IllegalArgumentException("The radius must be bigger than 0.");
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
	public double getXC() {
		return xc;
	}
	public void setXC(double xc) {
		this.xc = xc;
	}
	public double getYC() {
		return yc;
	}
	public void setYC(double yc) {
		this.yc = yc;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		if(r<=0)
			throw new IllegalArgumentException("The radius must be bigger than 0.");
		this.r = r;
	}
	
	public double getXMin(){
		return(this.xc-this.r);
	}
	public double getYMin(){
		return(this.yc-this.r);
	}
	public double getXMax(){
		return(this.xc+this.r);
	}
	public double getYMax(){
		return(this.yc+this.r);
	}
	
	public boolean contains(Circle c){
		boolean pluto=false;
		if(this.getXMin()<=c.getXMin())
			if(this.getYMin()<=c.getYMin())
				if(this.getXMax()>=c.getXMax())
					if(this.getYMax()<=c.getYMax())
						pluto=true;
		return pluto;
	}
}