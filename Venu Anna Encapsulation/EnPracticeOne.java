class EnPracticeOne 
{
	private int memNo;
	private String memName;
	private int memPhone;

	//setting values to instance varialbe through setters
	public void setMemberNo(int m){
		this.memNo = m;
	}
	public void setMemberName(String n){
		this.memName = n;
	}
	public void setMemberPhone(int p){
		this.memPhone = p;
	}

	//getting values from user declared through getters
	public int getMemberNo(){
		return memNo;
	}
	public String getMemberName(){
		return memName;
	}
	public int getMemberPhone(){
		return memPhone;
	}

	public static void main(String[] args) 
	{
		System.out.println("Encapsulation Practice");

		EnPracticeOne e1 = new EnPracticeOne();
		e1.setMemberNo(50);
		e1.setMemberName("Ramu");
		e1.setMemberPhone(89);

		System.out.println("Member 1 number is "+e1.getMemberNo());	
		System.out.println("Member 1 name is "+e1.getMemberName());
		System.out.println("Member 1 phone is "+e1.getMemberPhone());

	}
}
