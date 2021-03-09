import java.lang.Exception.*;
public class Guest {
	protected String name;
	protected int age;
	public Guest (String name, int age){
		if(name == null || age < 0)
		{
		throw new IllegalArgumentException("Give me Correct arguments");
		}
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
}
class Adult extends Guest {
	public Adult (String name, int age){
		super(name,age);
	}
	private String feeligs = "You can drink";
}
class Minor extends Guest {
	public Minor (String name, int age){
		super(name,age);
	}
	private String feeligs = "You are  under aged you can't";
	
}