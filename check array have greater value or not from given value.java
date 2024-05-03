import java.util.*;
class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int v = sc.nextInt();
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(arr[i]>v){
                System.out.println(arr[i]);
            }
            else{
                count++;
            }
        }
        if(count == n){
             System.out.println("No value here");
        }
       
        
    }
}
