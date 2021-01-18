public class Student extends Person {
	int numCourses;
	String courses;
	int grades;

	Student(String name, String address) {
		super(name, address);
	}

	String toString() {
		return String.format(getName(name) + "(" + getAddress(address) + ")");
	}

	void addCourseGrade(String course, int grade) {
		System.out.println(course + ":" + grade);
	}

	void printGrades() {
		System.out.println(this.grades);
	}

	double getAverageGrade() {
		double average = grades / numCourses;
		return average;
	}

	public static void main(String[] args) {
		Person student = new Person("Agus", "Batch 7");
		System.out.println("Student : " + student.toString());
	}

}
