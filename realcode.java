public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne(i want to use shell scripting);
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}