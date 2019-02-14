import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int r;
      int i = 1;
      while(i<=n)
      {
        r=n%i;
        if(r==0)
        System.out.println(i);
        i++;
      }
	}
}