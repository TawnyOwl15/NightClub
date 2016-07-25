package NightClub;

import java.util.Scanner;

public class NightClub {
    public static void main(String[] args) {
        while(true){
            System.out.println("Здравствуйте, уважаемый посетитель ночного клуба! Введите пожалуйста Ваше имя: "); //приветствие
            Scanner scanner = new Scanner(System.in);//ввод имени
            String name = scanner.nextLine();//присвоение переменной name значеие введенного имени
            System.out.println("Ваш возраст, пожалуйста: ");
            Scanner scanner2 = new Scanner(System.in);//ввод возраста
            if(scanner2.hasNextInt()){//проверка, ввели ли число
                int age = scanner2.nextInt();//присвоение переменной age значение введенного возраста
                String solution = "Вы - член клуба, " + name + ", всё в порядке, проходите.";
                Human human = new Human(name, age);//"человек" с введенными данными
                if((name.equals("Стив Джобс")&&(age==56)) ||(name.equals("Билл Гейтс")&&(age==60)) || (name.equals("Блез Паскаль")&&(age==39))){ //проверка данных
                    System.out.print(human);//вывод данных человека
                    System.out.println(solution);//вывод решения
                } else {
                    System.out.println("Вы не состоите в этом клубе, " + name + ", извините, проход запрещен.");//вывод запрета
                }
                System.out.println();//отступ

            } else {
                System.out.println("Вы ввели не целое число");
                break;
            }

        }

    }

}
