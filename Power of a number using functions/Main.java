import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
     power_num(a,b);
  }
  public static void power_num(int m,int n)
  {
    int pow=1;
      while(n>=1)
      {
        pow = pow * m;
        n--;
      }
        System.out.println(pow);
  }
}