public class Strings {
    public static void main(String[] args) {
        //creating using literals("")- here if string already exists,new string is not created,variable points to already existing string
        String str="Hello world!";
        int n=str.length();
        System.out.println(str+"\nlength : "+n);

        //join two strings
        String str1=" How are you?";
        String joined=str.concat(str1);
        System.out.println(joined);

        //compare two strings
        if(str.equalsIgnoreCase(str1)==true)
        System.out.println("String 1 and 2 are equal");
        else
        System.out.println("String 1 and 2 are not equal");

        //escape characters
        String str2="This is a \"String\"";
        System.out.println(str2);

        //using new keyword - here new string is created even if same string exists
        String str3=new String("This is created using new keyword");
        System.out.println(str3);

        //arr to strings
        String[] arr={"hello","how","are","you"};
        String arrtostr= String.join(" ",arr);
        System.out.println(arrtostr);


    }
}
