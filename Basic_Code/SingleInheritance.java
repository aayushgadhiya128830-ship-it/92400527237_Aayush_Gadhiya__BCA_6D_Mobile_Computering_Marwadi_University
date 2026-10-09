class Marwadi{
	void scam(){
		System.out.println("Student Not Be Fail..!!");
	}
}
class SingleInheritance extends Marwadi{
	void proove(){
		System.out.println("Our Marwadi Proove That,");
	}
	public static void main(String args[]){
		SingleInheritance a = new SingleInheritance();
		a.proove();
		a.scam();
	}
}