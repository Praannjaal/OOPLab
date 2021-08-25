
public class Main2 { public static void main(String[] args) { int sum,n,temp; sum=0; n=40;
while(n<=250)
{
temp=n%5;
if (temp==0)
{
sum=sum+n;
}
n++;
}
System.out.println("Sum of all integers divisible by 5 between 40 and 250 is:"+sum);
}
}
