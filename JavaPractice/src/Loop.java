
public class Loop {

	public static void main(String[] args) {
		//whileloop();
		//dowhile();
		forloop();
	}

	static void whileloop() {
		int counter = 11;
		while (counter < 10) {
			counter = counter+1;
			System.out.println(counter);
		}
	}

	static void dowhile() {
		int counter = 5;
		do {
			counter = counter+1;
			System.out.println(counter);
		}
		while(counter < 10);
	}

	static void forloop() {
		int counter;
		for (counter=2; counter<10; counter++) {
			System.out.println(counter);	
		}
	}


}
