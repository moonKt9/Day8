import java.util.Scanner;
public class LineComp {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first co-ordinate:");
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	System.out.println("Enter second co-ordinate:");
	int x2=sc.nextInt();
	int y2=sc.nextInt();
	double length;
	length=Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
	System.out.println("The lenth of line is:"+length);
}

}
