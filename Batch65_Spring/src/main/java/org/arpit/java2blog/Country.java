package org.arpit.java2blog;

public class Country {
    private String name;
    private long population;
 
    public Country(String name, long population) {  //Contructor Based
        super();
        this.name = name;
        this.population = population;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
