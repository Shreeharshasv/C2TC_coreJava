package Day16_ExceptionHandling;

public class StudentNotFoundException extends Exception {

	int sid;

	StudentNotFoundException()
	{		
	}

	public StudentNotFoundException(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
      return "Exception :: Student id not found!!";
	}

	@Override
	public String getMessage() {
		return "Student with id "+ sid + " Not found!!";
	}
	
	
}