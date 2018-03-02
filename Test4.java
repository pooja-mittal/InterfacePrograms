interface Computer
{
	void getConfig();
}

class Pc implements Computer
{
	String ram;
	String HDD, CPU;
	Pc(String ram, String HDD, String CPU) {
		this.ram=ram;
		this.HDD=HDD;
		this.CPU=CPU;
	}
	
	public void getConfig()
	{
		System.out.println("Pc config : Ram= " + this.ram + " , " + this.HDD + " , " + this.CPU);
	}
}

class Server implements Computer
{
	String ram;
	String HDD, CPU;
	Server(String ram, String HDD, String CPU) {
		this.ram=ram;
		this.HDD=HDD;
		this.CPU=CPU;
	}
	
	public void getConfig()
	{
		System.out.println("server config : Ram= " + this.ram + " , " + this.HDD + " , " + this.CPU);
	}
}

class ComputerFactory
{
	public static Computer getObject(String type,String Ram, String HDD, String CPU)
	{
		if(type.equals("pc"))
			return new Pc(Ram,HDD,CPU);
		else if(type.equals("server"))
			return new Server(Ram,HDD,CPU);
		return null;

	}
}

class Test4
{
	public static void main(String[] args)
	{
		Computer c=ComputerFactory.getObject("pc","2 GB", "500 GB" , "2.4 ghz");
		c.getConfig();
		c=ComputerFactory.getObject("server","16 GB", "1 TB" , "2.9 ghz");
		c.getConfig();
	}
}





