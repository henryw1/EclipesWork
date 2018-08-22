
public class Chair {

	private int weightCap;
	
	public void setWeightCap(int weightCap) {
		this.weightCap = weightCap;
	}
	
	public int getWeightCap() {
		return weightCap;
	}

	@Override
	public String toString() {
		return "Chair [weightCap=" + weightCap + "]";
	}
	
}
