class EnTwo{
	public static void main(String[] argv){
		EnOne e1 = new EnOne();
		//setters are used to set the data
		e1.setEid(45);
		e1.setEname("Ram");
		
		//getters are used to get the data
		int eid = e1.getEid();
		System.out.println(eid);
		String ename = e1.getEname();
		System.out.println(ename);
		
		System.out.println("//second object");
		//second object
		EnOne e2 = new EnOne();
		e2.setEid(85);
		e2.setEname("Sam");
		System.out.println(e2.getEid());
		System.out.println(e2.getEname());
	}
}