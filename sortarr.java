public class sortarr {
    public static void main(String[] args) {
        int arr[]={58,98,25,6595,5865,582,556,5565,55,585,85558,55,58,558,47,98,6345,6,878,21,1};
        int i,j,temp,n=arr.length;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
