import java.util.*;
class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr1 = new char[n];
        char[] arr2 = new char[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.next().charAt(0);
        }
        for(int i = 0; i<n; i++){
            arr2[i] = sc.next().charAt(0);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(char ch : arr1){
            System.out.print(ch+" ");
        }
        System.out.println();
        for(char ch : arr2){
            System.out.print(ch+" ");
        }
        
        
        
        
    }
}
