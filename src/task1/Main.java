package task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int assistant = Integer.parseInt(sc.nextLine());
        int students = 2 * assistant + 4;
        int coaches = (students + assistant) / 5;
        String category;

        if (coaches >= 0 && coaches <= 20){
            category = "uno";
        } else if (coaches >= 21 && coaches <= 30){
            category = "dos";
        } else if (coaches >= 31 && coaches <= 50){
            category = "tres";
        } else {
            category = "cuatro";
        }

        System.out.printf("%d %d %d%n  %s", assistant, students, coaches, category);
    }
}
