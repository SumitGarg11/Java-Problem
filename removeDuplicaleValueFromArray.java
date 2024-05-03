import java.util.*;
class Hello{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> nums = new HashSet<>();
        for(int go : arr){
            nums.add(go);
        }
        // print the set also if you  want;
        for(int go : nums){
            System.out.print(go+" ");
        }
        int[] arr2 = new int[nums.size()];
        int index = 0;
        for(int go : nums){
            arr2[index++] = go;
        }
        System.out.println();
        for(int go : arr2){
            System.out.print(go+" ");
        }
        
        
    }
}
