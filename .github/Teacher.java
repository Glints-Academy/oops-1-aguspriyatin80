class Teacher extends Person {
	int numCourses;
	String courses[];
	
	Teacher(String name, String address){
		super(name,address);
	}
		
	public String toString() {
		return String.format(getName(name) + "(" + getAddress(address) + ")");
	}
	
	boolean addCourse(String course) {		
		for(int i=0; i<courses.length; i++) {
			if(courses[i].equals(course)) {
				return false;
			}
		}		
		return true;
	}
	
	boolean removeCourse(String course) {		
		for(int i=0; i<courses.length; i++) {
			if(courses[i].equals(course)) {
				return true;
			}
		}		
		return false;
	}
		
	public static void main(String[] args) {
		Person teacher = new Person("Agus", "Batch 7");
		System.out.println(teacher.toString());
	}

}
