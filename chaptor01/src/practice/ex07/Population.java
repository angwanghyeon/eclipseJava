package practice.ex07;

import java.util.List;

public class Population {
	private String name;
	private double po;
	
	public Population(String name, double po) {
		this.name = name;
		this.po = po;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPo() {
		return po;
	}

	public void setPo(double po) {
		this.po = po;
	}

	@Override
	public String toString() {
		return name + "(" + po + ")";
	}
	
	public static final List<Population> pop = List.of(
			new Population("서울", 973.7),
			new Population("워싱턴", 63.2),
			new Population("베이징", 2115.0),
			new Population("파리", 224.4),
			new Population("마드리드", 326.5),
			new Population("런던", 853.9)
			
			);
			
}
