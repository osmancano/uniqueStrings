import java.util.Scanner;

/**
 * Created by osmanidris on 1/11/17.
 */
public class MyUniqueStrings {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String myStrings[] = new String[5];
        boolean flag=true;
        System.out.println("Unique Strings ....");
        for (int i=0; i<5; i++){
            System.out.println("Enter String No "+i+":");
            myStrings[i] = scanner.next();
            for(int j= 0 ;j < i; j++){
                if(myStrings[j].equals(myStrings[i])){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Your strings entered are unique");
        }else{
            System.out.println("You have entered duplicate strings");
        }


    }
}
