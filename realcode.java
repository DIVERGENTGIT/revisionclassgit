public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne(i want to linux scripting like bash sh);
		printOne(ansible is better than chef and puppet);
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