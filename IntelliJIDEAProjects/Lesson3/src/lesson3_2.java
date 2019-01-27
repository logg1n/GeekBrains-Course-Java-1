import java.util.Random;
import java.util.Scanner;

public class lesson3_2 {
    public static void main(String[] args) {
        /*  -------------------------------------------------------------------------------------------------------  *
         |   2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",           |
         |   "broccoli","carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "avocado",          |
         |   "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};       |            |
         |                                                                                                           |
         |   При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,                     |
         |   сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.                        |
         |   Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.                        |
         |   apple – загаданное, apricot - ответ игрока                                                              |
         |   ap############# (15 символов, чтобы пользователь не мог узнать длину слова)                             |
         |   Для сравнения двух слов посимвольно, можно пользоваться:                                                |
         |   String str = "apple";                                                                                   |
         |   str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции                        |
         |   Играем до тех пор, пока игрок не отгадает слово                                                         |
         |   Используем только маленькие буквы                                                                       |
         *  -------------------------------------------------------------------------------------------------------- */
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "broccoli", "carrot", "cherry",
                          "garlic", "grape", "melon", "leak", "kiwi", "mango", "avocado", "pumpkin",
                          "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "potato"};

        int num = random.nextInt(words.length);
        /* после сканирования преобразуем строку в нижний регистр */

        System.out.println("Система загадала слово. Поробуйте Угадать!");
        String answer = scanner.nextLine().toLowerCase();
        String randowWord = words[num];
        /* Сравниваем загадоную строку и ввседеную строку на несовпадение */

        String strin = null;
        while (!answer.equals(randowWord)) {
            System.out.println("Вы не угадали. Посмотрите внимательнее. И подумайте!");
            strin = charEq(randowWord, answer, strin);
            System.out.println(strin);
            System.out.println("Повторите ввод");

            answer = scanner.nextLine().toLowerCase();
        }

        System.out.println("Поздравляю вы угадали!");
    }

    /* Присваивает переменной счетчику длину короткого слова.
     * создаем массив для заполнения слова подсказки
      * Посимвольно сравниваем строки аргументов совпадения записываем в массив
      * преобразуем массив в строку и возпращаем*/
    static private String charEq(String myst, String answ, String strin){
        int count = myst.length() <= answ.length() ? myst.length() : answ.length();
        char[] str = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};

        if (strin != null){
            for (int i = 0; i < count; i++){
                if (strin.charAt(i) != str[i]){
                    str[i] = strin.charAt(i);
                }
            }
        }
        for (int i = 0; i < count; i++){
            if (myst.charAt(i) == answ.charAt(i)){
                str[i] = myst.charAt(i);
            }
        }



        return new String(str);
    }
}
