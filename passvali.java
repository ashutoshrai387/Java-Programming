import java.util.Scanner;
import java.util.regex.Pattern;
public class passvali {
    public static void valpass(String Password) {
        boolean n=true;
        //check length
        if(Password.length()<8 || Password.length()>10){
           n =false;
        }
        //check spcl characters
        if(!Pattern.matches(".*[^a-zA-Z0-9].*",Password)){
           n= false;
        }
        //one upprcase
        if(!Pattern.matches(".*[A-Z].*",Password)){
            n =false;
        }
        //integer
        if(!Pattern.matches(".*[0-9].*",Password)){
            n= false;
        }
    if(n==true){
        System.out.println("Password is valid");}
    else{
        System.out.println("Password is invalid");}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the password : ");
        String pass=sc.nextLine();
        valpass(pass);
    }
}
