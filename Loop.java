import java.util.*;
public class Loop {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int c=0;
            for(int i=2;i<n;i++)git
            {
                if(n%i==0)
                c++;
            }
            if(c==0){
                System.out.println("PRIME");
                }else{
                System.out.println("Not Prime");
                }
    }
}
