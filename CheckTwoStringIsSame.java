import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
   
       
   String s1 = sc.nextLine();
   String s2 = sc.nextLine();
   boolean allcharsame = true;
   if(s1.length() != s2.length()){
       allcharsame = false;
   }
   else{
   for(int i = 0; i<s1.length(); i++){
       if(s1.charAt(i) != s2.charAt(i)){
            allcharsame = false;
            break;
       }
   }
   }
   
   if(allcharsame){
       System.out.println("Yes");
   }
   else {
       System.out.println("NO");
   }
      
    
    }
}
