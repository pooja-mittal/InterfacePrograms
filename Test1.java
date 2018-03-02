interface Dog
{
	void speak();
}

class Poodle implements Dog
{
	public void speak()
	{
		System.out.println("poddle speak");
	}
}

class Rottweiler implements Dog
{
	public void speak()
	{
		System.out.println("Rottweiler speak");
	}
}

class German implements Dog
{
	public void speak()
	{
		System.out.println("German speak");
	}
}

class DogFactory
{
	public static Dog getDog(String c)
	{
		if(c.equals("small")) 
			return new Poodle();
		else if(c.equals("large")) 
			return new Rottweiler();
		else if(c.equals("walking")) 
			return new German();
		return null;
	}
}

class Test1
{
	public static void main(String[] args)
	{
		Dog d=DogFactory.getDog("small");
		d.speak();
		d=DogFactory.getDog("large");
		d.speak();
		d=DogFactory.getDog("walking");
		d.speak();
	}
}

