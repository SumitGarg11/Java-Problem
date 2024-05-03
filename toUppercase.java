import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //   String s = sc.nextLine();
    //   String ans = new StringBuilder(s).reverse().toString();
    //   System.out.println(ans);
       char a = sc.next().charAt(0);
       char b = Character.toUpperCase(a);
       System.out.println(b);
       char[] arr = {'a','b','c','d'};
       System.out.print(new String(arr));
       System.out.println();
       System.out.print(Arrays.toString(arr));
        System.out.println();
        for(int i = 0; i<4; i++){
            arr[i] = Character.toUpperCase(arr[i]);
        }
        for(char ch : arr){
             System.out.print(ch+" ");
        }
       
   
      
    
    }
}
