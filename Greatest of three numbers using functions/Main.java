import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    int m = in.nextInt();
    int n = in.nextInt();
    int g_num = greatest(l,m,n);
    System.out.println(g_num);
  }
  public static int greatest(int a,int b,int c)
  {
   int p = (a>b)?(a>c)?a:c:(b>c)?b:c;
    return p;
  }
}