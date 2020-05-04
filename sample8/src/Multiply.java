
public class Multiply {
       public static void main(String[] args) {
    	   System.out.println("引数で渡された配列の要素数"+args.length);
    	   if(args.length==2) {
    	   int a=Integer.parseInt(args[0]);
    	   int b=Integer.parseInt(args[1]);
    	   System.out.println(a+"かける"+b+"は"+a*b+"です");
    	   } else {
    		   System.out.println("掛け算する整数２つをプログラム引数としてください。");
    	   }
       }
}
