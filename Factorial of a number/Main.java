import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i=1,f=1;
      while(i<=n)
      {
        f=f*i;
        i++;
      }
      System.out.print(f);
	}
}