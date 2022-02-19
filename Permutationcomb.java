public class Permutationcomb
{
    public static int fact(int num) 
    {
        int fact=1,i;
        fact=fact*i;

    }
    return fact;
}
public static void main(String args[])
{
    int n,r;
    Scanner scan =new Scanner(System.in);

    System.out.println("Enter a value of n: ");
    n=scan.nextInt();
    System.out.println("Enter a value of r:");
    r=scan.nextInt();
    System.out.println("NCR is :" +fact(n)/fact(n-r)*fact(r));
    System.out.println("\nNPR is: " +fact(n)/fact(n-r));
    
}