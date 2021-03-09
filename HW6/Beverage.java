import java.lang.Exception.*;
public class Beverage {
	public String name;
	public int legalAge;
	Beverage (String name, int legalAge){
		if(name == null || legalAge < 0)
		{
		throw new IllegalArgumentException("Give me Correct arguments");
		}
		this.name = name;
		this.legalAge = legalAge;	
	}
	public int getLeagalAge(){
		return this.legalAge;
	}
	public String getName(){
		return this.name;
	}

	
}