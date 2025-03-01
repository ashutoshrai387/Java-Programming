import java.util.Scanner;

public class pythatriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the no of elements : ");
        int n=sc.nextInt();
        int i,j,k,x,y,z,count=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        for(i=0;i<n;i++){
            x=arr[i];
            for(j=i+1;j<n;j++){
                y=arr[j];
                for(k=j+1;k<n;k++){
                    z=arr[k];
                    if((arr[k]*arr[k])==((arr[i]*arr[i])+(arr[j]*arr[j]))){
                        count++;
                        System.out.println(count+":   "+x+","+y+","+z);
                    }
                }
            }
        }
        if(count==0)
        System.out.println("No triplet found");
    }
}
