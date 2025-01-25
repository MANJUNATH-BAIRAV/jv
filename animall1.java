class animalm
{
String name;
int age;

	public animalm(String aniname, int age)
	{
	this.name = aniname;
	this.age = age;
	}

	public void display()
 	{
	System.out.println(" The animal is dharani " +name);
	System.out.println(" The age is " +age);
	}
}

public class animall1
{
public static void main(String[] args)
{
animalm objanimal = new animalm("Lion",12);
objanimal.display();
}
}
