import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int lowerRange , higherRange ;
        System.out.println("Enter the Value of lowerRange:");
        lowerRange=sc.nextInt();
        System.out.println("Enter the Value of higherRange:");
        higherRange=sc.nextInt();

        while(lowerRange < higherRange)
        {
            boolean flag = false;
            for(int a = 2; a <= lowerRange / 2; ++a)
            {
                if(lowerRange % a == 0)
                {
                    flag = true;
                    break;
                }
            }
            if(!flag && lowerRange != 0 && lowerRange != 1)
                System.out.print(lowerRange + " ");
            ++lowerRange;
        }
    }
}