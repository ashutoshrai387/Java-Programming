//NOT WORKING CORRECTLY

import java.util.Scanner;
public class longincsubarr {
    public static int[] subarr(int [] arr) {
        int index[]=new int [2];
        int i,j,start=0,max=0,n=arr.length;
        for(i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                start=i;
                max++;
                for(j=i+1;j<n-1;j++){
                    if(arr[j]>arr[j+1])
                        break;
                    else
                        max++;                    
                }
                if(max>index[1]-index[0]+1){
                    index[0]=start;
                    index[1]=j--;
                }
                i=j;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the no of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] index=subarr(arr);
        for(int i=index[0];i<=index[1];i++){
            System.out.print(arr[i]);
        }
    }
}
