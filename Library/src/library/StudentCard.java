package library;

public class StudentCard {
private int id;

private Student student;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public StudentCard(int id, Student student) {
	super();
	this.id = id;
	this.student = student;
}

public StudentCard() {
	super();
}

}
