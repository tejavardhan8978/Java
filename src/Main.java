import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDo todo = new ToDo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command (add/list/remove/exit): ");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    todo.addTask(task);
                    break;
                case "list":
                    todo.listTasks();
                    break;
                case "remove":
                    System.out.print("Enter task index to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    todo.removeTask(index);
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}