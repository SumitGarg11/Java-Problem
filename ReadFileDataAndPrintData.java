import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        try{
            File file = new File(filePath);
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}
