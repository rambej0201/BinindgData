/* This class is called
Java Beans / Value Object / Business Object / Data Transform Object*/
class EnOne{
	private int eid;
	private String ename;
	
	//setters are used to set the values to properties
	public void setEid(int eid){
		this.eid = eid;
	}
	public void  setEname(String ename){
		this.ename = ename;
	}
	
	//getters are used to get the values from properties
	public int getEid(){
		return eid;
	}
	public String getEname(){
		return ename;
	}
}