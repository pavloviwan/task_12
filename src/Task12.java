/**
 * Задача №12: Удаление всех пробелов в заданном тексте.
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов.
 * Результат в виде строки без пробелов вывести на экран.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку пробелами, затем нажмите ENTER:");
        String str = reader.readLine();
        String newStr = str.replaceAll(" ", "");
        System.out.println(newStr);
    }
}
