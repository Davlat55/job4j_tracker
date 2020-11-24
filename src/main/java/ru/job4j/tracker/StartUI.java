package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
//                String name = scanner.nextLine();
//                Item item = new Item(name);
//                tracker.add(item);
                } else if ( select == 1) {
                System.out.println("Show all items");
                // Tracker tracker = new Tracker();
                // Item item = new Item();
                // tracker.findAll();
                // System.out.println(item);
                //     for (int i = 0; i <  ; i++) {
                //    System.out.println(tracker);
                 //     }
           // }

                } else if ( select ==2 ) {
                System.out.println("Edit item");
            }
               else if ( select == 3 ) {
             System.out.println("Delete item");
         } else if ( select == 4 ) {
                System.out.println("Find item by Id");
            } else if ( select == 5 ) {
                System.out.println("Find items by name");
            }
                /*             Добавить остальные действия системы по меню. */
              else if (select == 6) {
                run = false;
            }
            // if
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        // добавить остальные пункты меню.
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
