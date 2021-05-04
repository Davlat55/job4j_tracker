package ru.job4j.tracker;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {

     public void init(Scanner scanner, Tracker tracker) {

        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
                  } else if ( select == 1) {
               System.out.println("Show all items");

                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                        }
                } else if ( select ==2 ) {
                System.out.println("Edit item");
                int id =  Integer.valueOf(scanner.nextLine());
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);

                if(tracker.replace(id, item)) {
                    System.out.println("Замена произошла успешно");
                   } else
                         {
                           System.out.println("Замена не произведена");
                         }
            }
               else if ( select == 3 ) {
             System.out.println("Delete item");
                int id =  Integer.valueOf(scanner.nextLine());

                if(tracker.delete(id)) {
                    System.out.println("Элемент успешно удален");
                } else
                      {
                          System.out.println("Не удалось удалит элемент");
                      }

            } else if ( select == 4 ) {
                System.out.println("Find item by Id");
                int id =  Integer.valueOf(scanner.nextLine());
                 if (tracker.findById(id-1) == null)
                    System.out.println("Элемент с таким Id не найден");
                 else {
                    Item[] items = tracker.findAll();
                    System.out.println(items[id-1]);
                }
            } else if ( select == 5 ) {
                System.out.println("Find items by name");
                String name = scanner.nextLine();

               Item[] byName = tracker.findByName(name);
               if(byName.length > 0) {
                       System.out.println(byName);
                 }
               else
                   System.out.println("Элемент не найден");
            }
              else if (select == 6) {
                run = false;
            }

        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");

    }

    public static void main(String[] args) {
//       Item item = new Item();
 //      item.setId(4);
 //      item.setName("Vasya");
 //      System.out.println(item);

       Tracker tracker = new Tracker();
 //      tracker.add(item);
 //      tracker.findById(1);
 //      System.out.println(item);

 //      LocalDateTime currentDateTime = LocalDateTime.now();
 //      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
 //      String currentDateTimeFormat = currentDateTime.format(formatter);
 //      System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

       Scanner scanner = new Scanner(System.in);
       new StartUI().init(scanner, tracker);

    }
}
