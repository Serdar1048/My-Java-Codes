/**
 * Write a program to answer questions like the following: Suppose the species
 * Klingon ox has a population of 100 and a growth rate of 15 percent, and it
 * lives in an area of 1500 square miles. How long would it take for the
 * population density to exceed 1 per square mile? The formula for population
 * density is population divided by area.
 * 
 * Test your program with the following values: Population: 100 Growth rate: 15%
 * Area: 1500 square miles
 */
public class SpeciesTest {
	public static void main(String[] args)
    {
    	Species s1 = new Species(100, 0.15,1500);
    	s1.increment();
       
    }
}
