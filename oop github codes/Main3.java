import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a =new int[3];
            for(int i=0;i<3;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<3;i++) 
            {
                for(int j=0;j<3;j++)
                {
                    for(int k=0;k<3;k++)
                    {
                        if(i!=j && j!=k && k!=i) 
                        {
                            System.out.print(a[i]+" ");
                            System.out.print(a[j]+" ");
                            System.out.print(a[k]+" ");
                            System.out.println();
                        }
                    }
                }
            }
    }
}