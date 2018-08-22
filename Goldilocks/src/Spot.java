
public class Spot {
	
	private Porridge Porridge;
	private Chair Chair;
	private Lighting Lighting;
	
	public void setPorridge(Porridge Porridge) {
		this.Porridge = Porridge;
	}
	
	public void setChair(Chair Chair) {
		this.Chair = Chair;
	}
	
	public void setLighting(Lighting Lighting) {
		this.Lighting = Lighting;
	}
	
	public Porridge  getPorridge() {
		return Porridge;
	}
	
	public Chair getChair() {
		return Chair;
	}
	
	public Lighting getLighting() {
		return Lighting;
	}

	@Override
	public String toString() {
		return "Spot [Porridge=" + Porridge + ", Chair=" + Chair + ", Lighting=" + Lighting + "]";
	}
	

}
