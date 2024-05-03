import java.util.*;
class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("count: "+count);
            count++;
            
        }
        System.out.println(count);
        
    }
}
