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
		double Prosek = 0.0;
		for(int i = 0; i < grades.length; i++) {
		   Prosek += grades[i];
		}
	return (double) (Prosek/grades.length);
	}

	public int ECTSCredits() {
		//TODO
		int brojac = 0;
		for(int i = 0; i < grades.length; i++) {
		   if(grades[i] >= 6 && grades[i] <= 10){
			brojac++;
		   }
		}
           return 6 * brojac;
	}
}

class Faculty {
  List<Student> list;
  String name;

  	public void addStudent(Student s){
    		list.insertLast(s);
	}
}