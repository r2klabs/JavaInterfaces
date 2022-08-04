/**
 * This class represents a racehorse, 
 * @author Robert Kelley
 * @version 0.1
 * Programming Problem 2
 * Summer 2022
 *
 */

//single line comment
/*
 * Multiple line comment
 */

public class RaceHorse extends Animal implements Comparable<RaceHorse>, Raceable {
		
	private String name;
	private HennekeScore hScore; 
	
	private enum Status {STAT1, STAT2, STAT3}
	
	public RaceHorse() {
		super();
		this.name = "";
		hScore = HennekeScore.MODERATE;
		
	}//empty-argument constructor

	/**
	 * 
	 * @param weight
	 * @param height
	 */
	public RaceHorse(int weight, int height) {
		//
		super(weight, height);
		name = "";
		hScore = HennekeScore.MODERATE;
		
	}//preferred constructor

	/**
	 * This is the preferred constructor for this class.
	 * @param name -String
	 * @param hScore - Henneke
	 * @param weight - 
	 * @param height
	 */
	public RaceHorse(String name, HennekeScore hScore, int weight, int height) {
		super(weight, height);
		this.name = name;
		this.hScore = hScore;
	}//preferred constructor

	/**
	 * 
	 * @return name of the object
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
		
	public HennekeScore gethScore() {
		return hScore;
	}

	public void sethScore(HennekeScore hScore) {
		this.hScore = hScore;
	}

	
	@Override
	public String toString() {
		return "RaceHorse [name=" + name + ", hScore=" + hScore + ", weight=" + weight + ", height=" + height + "]";
	}

	@Override
	public int compareTo(RaceHorse o) {
		
		if(this.hScore == o.gethScore()){
			return 1;
		}		
		
		return -1;
		
	}//end compareTo

	@Override
	public void move(int distance) {
		System.out.println("I'm moving at " + distance + "MPH");
		
	}
	
	


}//end class
