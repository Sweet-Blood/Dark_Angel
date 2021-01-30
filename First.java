import java.util.Scanner;
class First{
	public static void main(String args[])
	{
		System.out.println("Hello, World");
		System.out.println("My First java File to learn git...");
		System.out.println("Enter a number - ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.next();
		System.out.println("The cube of the number is - "+(a*a*a));
	}
}