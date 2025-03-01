import java.util.Scanner;
public class remeleinarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the no of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be removed : ");
        int target=sc.nextInt();
        int flag=0;
        int pos=0;

        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                flag=1;
                pos=i;
                break;
            }
        }
        if(flag==1){
            for(int i=pos+1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            System.out.println("After Deleting : ");
            for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
            }
        }
        else{
            System.out.println("Element not found");
        }
    }
}
