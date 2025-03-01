import java.util.Scanner;

public class sortnames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String temp;
        System.out.print("Enter the no of names : ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the names : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted names are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
