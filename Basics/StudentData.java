package CgDemoPrograms;

public class StudentData {
		int USN;
		String name;
		String email;
		public StudentData() {
			
		}
		public StudentData(int id, String name, String email) {
			this.USN=USN;
			this.name= name;
			this.email= email;
		}
	public StudentData(int USN) {
		this.USN=USN;
		
	}
	public String tostring() {
		String str = "("+USN+"," + name+ "," + email+ ")";
		return str;
		
	}
	public static void main(String[] args) {
		//StudentData s1= new StudentData();
		//s1.USN=100;
		//s1.name="shree";
		//s1.email="shreeharsha";
		//System.out.println(s1.tostring());
		
		StudentData s2 = new StudentData(5, "harsha", "mymail");
		System.out.println(s2.tostring());
				
	}
	}


