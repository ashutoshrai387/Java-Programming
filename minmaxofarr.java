import java.util.Scanner;
public class minmaxofarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.print("Enter the contents of array : ");
        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];}

            if(arr[i]<min){
                min=arr[i];}
        }
        System.out.println("Maximum is "+max+" and minimum is "+min);
    }
}
