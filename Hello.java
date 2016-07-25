import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i<3; i++){
            System.out.println("Введите ваше имя: ");
            String name = scanner.nextLine();
            if(name.equals("Юра")){
                System.out.println("Привет, препод!");
            } else if(name.equals("Денис")) {
                System.out.println("Hi, Дэн!");
            } else {
                System.out.println("Hello " + name);
            }
        }
    }
}
