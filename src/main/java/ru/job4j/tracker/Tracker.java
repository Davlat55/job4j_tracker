package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                items[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public Item findById(int id) {
     //   Item rsl = null;
        int index = indexOf(id);

        //       for (int index = 0; index < size; index++) {
        //           Item item = items[index];
        //           if (item.getId() == id) {
        //               rsl = item;
        //               break;
        //           }
        //   }
       return index !=-1 ? items[index] : null;
      }


    public Item[] findAll() {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] namesWithoutNull = new String[names.length];
        int size = 0;
        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            if (name != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        for (int index = 0; index < namesWithoutNull.length; index++) {
            System.out.println(namesWithoutNull[index]);
        }
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl;
        int index = indexOf(id);
        if(index > 0) {
            // Tracker tracker = items[index];
            items[index] = item;
            rsl = true;
        } else
            rsl = false;
        return rsl;
    }


}