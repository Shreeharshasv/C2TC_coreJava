package CgDemoPrograms;

class Superman

{

	public String name = "AB Dewilliers";

	public String country = "South Africa";

	public int matches = 300;
}

class King {
	public String name = "Virat Kohli";

	public String country = "India";

	public int matches = 200;
}

class classic {
	public String name = "KL Rahul";

	public String country = "India";

	public int matches = 150;
}

class Gun {
	public String name = "Dale Steyn";

	public String country = "South Africa";

	public int matches = 250;
}

class pacer {
	public String name = "Brett Lee";

	public String country = "Australia";

	public int matches = 250;
}

public class cricketer {
	public static void main(String args[]) {

		Superman cricketer = new Superman();
		King cricketer1 = new King();
		classic cricketer2 = new classic();
		Gun cricketer3 = new Gun();
		pacer cricketer4 = new pacer();
		System.out.println(cricketer.name + "from" + cricketer.country + "has played" + cricketer.matches + "matches");
		System.out
				.println(cricketer1.name + "from" + cricketer1.country + "has played" + cricketer1.matches + "matches");
		System.out
				.println(cricketer2.name + "from" + cricketer2.country + "has played" + cricketer2.matches + "matches");
		System.out
				.println(cricketer3.name + "from" + cricketer3.country + "has played" + cricketer3.matches + "matches");
		System.out
				.println(cricketer4.name + "from" + cricketer4.country + "has played" + cricketer4.matches + "matches");
	}
}
