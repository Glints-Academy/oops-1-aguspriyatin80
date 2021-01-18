public class Person {
	String name;
	String address;

	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	String getName(String name) {
		return name;
	}

	String getAddress(String address) {
		return address;
	}

	void setAddress(String address) {
		address = "Cirebon";
	}

	public String toString() {
		return String.format(getName(name) + "(" + getAddress(address) + ")");
	}

	public static void main(String[] args) {
		Person p = new Person("Agus", "Batch 7");
		System.out.println(p.toString());
	}
}
