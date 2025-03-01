public class searcheleinarr {
    public static void main(String[] args) {
        int [] n={1,5,7,9,6,3,4};
        int flag=0;
        int target=9;
        int pos=-1;

        for(int i=0;i<n.length;i++){
            if (n[i]==target){
                flag=1;
                pos=i;
                break;
            }
        }
        if(flag==1)
        System.out.println(target+" Found at position "+(pos+1));
    }
}
