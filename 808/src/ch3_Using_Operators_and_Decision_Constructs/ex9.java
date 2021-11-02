package ch3_Using_Operators_and_Decision_Constructs;

public class ex9 {

	public static void main(String[] args) {
		 Planet[] planets = {
			        new Planet("Mercury", 0),
			        new Planet("Venus", 0),
			        new Planet("Earth", 1),
			        new Planet("Mars", 2)
			    };
			 
			    System.out.println(planets);
			    System.out.println(planets[2]);
			    System.out.println(planets[2].moons);

	}

}
class Planet {
	 
    public String name;
    public int moons;
 
    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }
}
/*
public class Planet {
 
    public String name;
    public int moons;
 
    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }
}
And the following main method:

public static void main(String[] args) {
    Planet[] planets = {
        new Planet("Mercury", 0),
        new Planet("Venus", 0),
        new Planet("Earth", 1),
        new Planet("Mars", 2)
    };
 
    System.out.println(planets);
    System.out.println(planets[2]);
    System.out.println(planets[2].moons);
}
What is the output?

A.

planets
Earth
1

B.

[LPlanets.Planet;@15db9742
Earth
1

C.

[LPlanets.Planet;@15db9742
Planets.Planet@6d06d69c
1

D.

[LPlanets.Planet;@15db9742
Planets.Planet@6d06d69c
[LPlanets.Moon;@7852e922

E.

[LPlanets.Planet;@15db9742
Venus
0



*/