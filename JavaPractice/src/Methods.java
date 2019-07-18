
public class Methods {

	public static void main(String[] args) {
		f();
		name("John");
		int x = result();
		System.out.println(x);
		int a = sqr(result());
		System.out.println(a);
	}
	
	static void f(){
		System.out.println("Print");
	}
	static void name(String name){
		System.out.println("Print " + name);
	}
	static int result(){
		return 5;
	}
	static int sqr(int x){
		return x * x;
	}
}
