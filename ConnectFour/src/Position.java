
public class Position {
	private int xAxis; 
	private int yAxis;
	
	public Position(int xAxis, int yAxix) {
		this.xAxis=xAxis;
		this.yAxis=yAxix;
	}
	
	
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}


	@Override
	public String toString() {
		return "Position [xAxis=" + xAxis + ", yAxis=" + yAxis + "]";
	} 
	

}
