import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
       // System.out.print("Enter the type of matrix : ");
        //int n=sc.nextInt();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       // System.out.println("Enter the elements of the array : ");  
        //for(int i=0;i<arr.length;i++){
          //  for(int j=0;j<n;j++){
            //arr[i][j]=sc.nextInt();
        //}}
        int n=arr.length;
        System.out.println("Displaying the matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //transpose
        System.out.println("Transpose : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        //determinant
        System.out.println("Determinant : ");
    }
}
