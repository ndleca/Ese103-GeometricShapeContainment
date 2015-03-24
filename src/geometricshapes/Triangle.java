package geometricshapes;

public class Triangle{
	private double xV;
	private double yV;
	private double l;
	
	public Triangle(double xV, double yV, double l){
		this.xV = xV;
		this.yV = yV;
		if(l <= 0)
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0.");
		this.l = l;
	}

  public double getXV(){
		return xV;
	}
	
	public double getYV(){
		return yV;
	}
	
	public double getL(){
		return l;
	}

	public void setXV(double xV){
		this.xV = xV;
	}
	
	public void setYV(double yV){
		this.yV = yV;
	}
	
	public void setL(double l){
		if(l <= 0)
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		this.l = l;
	}
	
	public double getXMin(){
		return this.xV;
	}
	
	public double getXMax(){
		return this.xV+this.l;
	}

	public double getYMin(){
		return this.yV;
	}

	public double getYMax(){
		return this.yV+(l*Math.sqrt(3)/2);
	}

	public boolean contains(Triangle t){
		boolean contain = false;
		if(this.getXMin() <= t.getXMin() && this.getYMin() <= t.getYMin())
			if(this.getXMax() >= t.getXMax() && this.getYMax() >= t.getYMax())
				contain = true;
		return contain;	
	}
	
	public boolean contains(Circle c){
		boolean contain = false;
		if(this.getXMin() <= c.getXMin() && this.getYMin() <= c.getYMin())
			if(this.getXMax() >= c.getXMax() && this.getYMax() >= c.getYMax())
				contain = true;
		return contain;	
	}

	@Override
	public String toString(){
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
}
