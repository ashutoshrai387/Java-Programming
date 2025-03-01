import java.util.Scanner;
public class larn2ndlareleinarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the no of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int l1,l2,temp;
        l1=arr[0];l2=arr[1];
        if(l1<l2){
            temp=l1;
            l1=l2;
            l2=temp;
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>l1){
                l2=l1;
                l1=arr[i];
            }
            else if(arr[i]>l2&&arr[i]!=l1){
                l2=arr[i];
            }
        }
        System.out.println("Largest : "+l1+"\n2nd Largest : "+l2);
    }
}
