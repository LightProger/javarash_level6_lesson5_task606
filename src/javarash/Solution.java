package javarash;


import java.io.*;

/*
Чётные и нечётные циферки
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: «Even: а Odd: b», где а — количество четных цифр, b — количество нечетных цифр.
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        // Вводим данные с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());

        // Спомощью цикла определяем четное число или нет
        while (c > 0){
            if((c % 10) % 2 == 0){
                even = even + 1;
            } else {
                odd = odd + 1;
            }
            c = c / 10;
        }
        // Выводим статистику на экран
        System.out.println("Even: " + even + " " + " Odd: " + odd);
    }
}
