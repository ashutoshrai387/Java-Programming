import java.util.Scanner;
public class removrepeatword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str= sc.nextLine();
        String [] s=str.split(" ");
        int i,j,n=s.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(s[i].equalsIgnoreCase(s[j]))
                s[j]="";
            }
        }
        String nw="";
        for(i=0;i<n;i++){
        if(s[i]=="")
        continue;
        else{
        nw=nw+s[i]+" ";
        }}
        System.out.println(nw);
    }
}
//ex - my name name is ashutosh is rai is rai is ashutosh.