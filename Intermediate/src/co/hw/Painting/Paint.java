package co.hw.Painting;

import java.util.ArrayList;

public class Paint {

	private int litre;
	private double price;
	private int size;
	public static ArrayList<Paint> paintList = new ArrayList<Paint>();

	public int getLitre() {
		return litre;
	}

	public void setLitre(int litre) {
		this.litre = litre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String price() {
		String cheapest = "";
		double cost = 0;
		for (int i = 0; i < paintList.size(); i++) {

			if (paintList.get(i) instanceof CheapoMax) {
				double price = paintList.get(i).getPrice();
				int size = paintList.get(i).getSize();
				int litre = paintList.get(i).getLitre();
//				price * 2/ Litres to find price of 2 L's
				cost = (price * 2) / litre;
				cheapest = "CheapMax";

			} else if (paintList.get(i) instanceof DuluxPaint) {
				double price = paintList.get(i).getPrice();
				int size = paintList.get(i).getSize();
				int litre = paintList.get(i).getLitre();
				double result = (price * 2) / litre;
				if (cost > result) {
					cost = result;
					cheapest = "DuluxPaint";
				}
			} else if (paintList.get(i) instanceof AverageJoes) {
				double price = paintList.get(i).getPrice();
				int size = paintList.get(i).getSize();
				int litre = paintList.get(i).getLitre();
				double result = (price * 2) / litre;
				if (cost > result) {
					cost = result;
					cheapest = "AverageJoes";
				}
			}
		}
		return cheapest;

	}

}
