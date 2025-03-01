import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class marks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int marks;
        char grade;

        System.out.println("enter your marks");
        marks = Integer.parseInt(br.readLine());
        switch (marks / 10) {
            case 10:
                grade = 'E';
                System.out.print(grade);
                break;
            case 9:
                grade = 'E';
                System.out.print(grade);
                break;
            case 8:
                grade = 'A';
                System.out.println(grade);
                break;
            case 7:
                grade = 'A';
                System.out.println(grade);
                break;
            case 6:
                grade = 'C';
                System.out.println(grade);
                break;
            case '5':
                grade = 'D';
                System.out.println(grade);
                break;
            case 4:
                grade = 'F';
                System.out.println(grade);
                break;
            default:
                System.out.println("invalid input");
        }
    }

}