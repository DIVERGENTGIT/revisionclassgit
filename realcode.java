public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
<<<<<<< HEAD
		printOne(i want to linux scripting like bash sh);
		printOne(ansible is better than chef and puppet);
=======
		printOne(i want to use shell scripting);
		printOne();
>>>>>>> 01ef91ce269eef84a4206c56e824efdcf2580a02
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