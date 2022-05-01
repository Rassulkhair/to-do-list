import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Выберите действие:\s
                    1. Добавить задачу\s
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход""");
            String message = scanner.nextLine();

            switch (Integer.parseInt(message)) {
                case 1 -> {
                    System.out.println("Введите задачу для планирования:");
                    String task = scanner.nextLine();
                    result.add(task);
                }
                case 2 -> {
                    System.out.println("Список задач:");
                    int counter = 0;
                    for (String task : result) {
                        counter++;
                        System.out.println(counter + ". " + task);
                    }
                }
                case 3 -> {
                    while (true) {
                        System.out.println("Выберите какую задачу удалить или введите finish: ");
                        String index = scanner.nextLine();
                        if (index.equalsIgnoreCase("finish")) {
                            break;
                        }
                        result.remove(Integer.parseInt(index) - 1);
                    }
                }
            }
            if (Integer.parseInt(message) == 0) {
                break;
            }
        }
    }
}
