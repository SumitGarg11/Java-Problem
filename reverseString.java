import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String ans = new StringBuilder(s).reverse().toString();
       System.out.println(ans);
    }
}
