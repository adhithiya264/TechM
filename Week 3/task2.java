package newassgn;

public class task2 {

	
	public static void main(String[] args) {
	printx();
	printx2();
	
	task2 y=new task2();
	y.printx3();
		
	}
	
	static void printx() {
		System.out.print("line 1");
	}
	
	static void printx2(){
		System.out.println("line 2");
	}
	
	
	void printx3(){
		System.err.println("line 3");
		
	}
	
	
}
