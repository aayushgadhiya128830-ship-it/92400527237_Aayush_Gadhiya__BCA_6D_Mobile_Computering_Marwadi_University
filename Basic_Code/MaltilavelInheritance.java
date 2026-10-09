class Bus{
	void dis1(){
		System.out.println("Bus Have 6-8 Weels..!!");
	}
}
class Car extends Bus{
	void dis2(){
		System.out.println("Car Have 4 Weels..!!");
	}
}
class MaltilavelInheritance extends Car{
	void dis3(){
		System.out.println("Bike Have 2 Weels..!!");
	}
	
	public static void main(String args[]){
		MaltilavelInheritance a = new MaltilavelInheritance();
		a.dis1();
		a.dis2();
		a.dis3();
	}
}