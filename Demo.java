import java.util.Scanner;
class Demo {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();
	int count=1;
        if (x == y && x == z)
        {
	count+=2;
            System.out.println("All numbers are equal");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
	count+=1;
            System.out.println("Neither all are equal or different");
        }
        else
        {
            System.out.println("All numbers are different");
	count=0;
        }
System.out.println("Equal number present: "+count);
    }
}