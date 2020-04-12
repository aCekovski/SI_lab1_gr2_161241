class Student {
	String index;
	String firstName;
	String lastName;
	Integer []grades;

	//TODO constructor
	public Student(String index, String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//TODO seters & getters
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		//TODO
	}

	public int ECTSCredits() {
		//TODO
	}
}
