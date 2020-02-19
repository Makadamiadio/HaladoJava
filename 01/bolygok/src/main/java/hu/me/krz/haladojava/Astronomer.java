package hu.me.krz.haladojava;

import java.util.*;

public class Astronomer {
	private String name;
	private List<Planet> discovery = new ArrayList<>();
	
	public List<Planet> getDisc(){
		return this.discovery;
	}
	
	public Astronomer(String name, List<Planet> discovery){
		this.discovery.addAll(discovery);
		this.name = name;
	}
	
	public Astronomer(String name){
		this.name = name;
	}
	
	public void observeTheSky(){
		Random r = new Random();
		String[] bolygoname = {"Easy Come", "Easy Go", "Will you let me go", "Bismillah, NO", "We will not let you go", "Let him GOOOOO", "We will not let you go", "Let me go", "No no no no no no no", "O mamma mia, mamma mia"};

		for (int i = 0; i < 10; i++) {
			double radius = r.nextDouble() * 100;
			String name = bolygoname[i];
			Point p = new Point(0, 0, 0);
			Point t = new Point(((i + 1) * 10), 0, 0);
			p.translate(t);

			
			this.discovery.add(new Planet(p, (int) radius, name));

			System.out.println(discovery);
		}
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return name +"altal felfedezett bolygok: " + discovery;
	}

}
