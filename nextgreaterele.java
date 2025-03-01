//NOT PERFECT

import java.util.Scanner;
public class nextgreaterele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    System.out.println(arr[i]+" --> "+arr[j]);
                    break;
                }
                else if(arr[i]>arr[j]){
                    continue;
                }
                else
                {
                    System.out.println(arr[i]+" --> -1");
                }
            }
        }
    }
}
