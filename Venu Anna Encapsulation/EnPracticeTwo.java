class EnPracticeTwo 
{
	private int sId;
	private String sName;
	private String sNationality;
	private int sPhone;

	public void setStudentId(int id){
		this.sId = id;
	}
	public void setStudentName(String name){
		this.sName = name;
	}
	public void setStudentNationality(String nation){
		this.sNationality = nation;
	}
	public void setStudentPhone(int phone){
		this.sPhone = phone;
	}

	public int getStudentId(){
		return sId;
	}
	public String getStudentName(){
		return sName;
	}
	public String getStudentNationality(){
		return sNationality;
	}
	public int getStudentPhone(){
		return sPhone;
	}

	public static void main(String[] args) 
	{
		System.out.println("Encapsulation example two");
		EnPracticeTwo e1 = new EnPracticeTwo();
		EnPracticeTwo e2 = new EnPracticeTwo();
		EnPracticeTwo e3 = new EnPracticeTwo();

		System.out.println("Object e1 Student one details");
		e1.setStudentId(55);
		e1.setStudentName("Rama Rao");
		e1.setStudentNationality("American");
		e1.setStudentPhone(858);
		System.out.println("Student Id is "+e1.getStudentId());
		System.out.println("Student Name is "+e1.getStudentName());
		System.out.println("Student Nationality is "+e1.getStudentNationality());
		System.out.println("Student Phone is "+e1.getStudentPhone());



		System.out.println("Object e2 Student two details");
		e2.setStudentId(66);
		e2.setStudentName("Ranjith");
		e2.setStudentNationality("German");
		e2.setStudentPhone(454);
		System.out.println("Student Id is "+e2.getStudentId());
		System.out.println("Student Name is "+e2.getStudentName());
		System.out.println("Student Nationality is "+e2.getStudentNationality());
		System.out.println("Student Phone is "+e2.getStudentPhone());

		System.out.println("Object e3 Student three details");
		e3.setStudentId(77);
		e3.setStudentName("Vamsi");
		e3.setStudentNationality("Warangal");
		e3.setStudentPhone(656);
		System.out.println("Student Id is "+e3.getStudentId());
		System.out.println("Student Name is "+e3.getStudentName());
		System.out.println("Student Nationality is "+e3.getStudentNationality());
		System.out.println("Student Phone is "+e3.getStudentPhone());

	}
}
