import java.util.Scanner;
public class Diamond
{
    public static void main(String[]args)
    {
        int n,j,i,space=1;
        System.out.println("Enter the number of rows:");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        space=n-1;
        for(j=1;j<=n;j++)
        {
            for(i=1;i<=space;i++)
            {
              System.out.println(" ";)  
            }
            space--;
            for(i=1;i<=2*j-1;i++)
            {
                System.out.println("*");
            }
            System.out.println(" ");
            space=1;
            for(j=1;j<=n;j++)
            {
            for(i=1;i<=space;i++)
              {
                  System.out.println(" ");
              }
              space++;
              for(i=1;i<=2*j-1;i++)
              {
                System.out.println("*");
              }
            System.out.println(" ");

        }
    }
}