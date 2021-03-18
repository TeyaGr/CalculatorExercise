package library;

public class Student extends Person{

	
	private String studentId;
	
	private String user;
	private String pass;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Student() {

	}

	public Student(String studentId, String user, String pass) {
		super();
		this.studentId = studentId;
		this.user = user;
		this.pass= pass;
	}

	
	
}
