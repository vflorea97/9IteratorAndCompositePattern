import Iterator.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
//
//        for (int i = 0; i < breakfastItems.size(); i++) {
//            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
//            System.out.print(menuItem.getName() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//            System.out.println(menuItem.getDescription());
//        }
//        System.out.println();
//
//        DinerMenu dinerMenu = new DinerMenu();
//        MenuItem[] lunchItems = dinerMenu.getMenuItems();
//        int length = dinerMenu.getNumberOfItems();
//
//        for (int i = 0; i < length ; i++) {
//            MenuItem menuItem = lunchItems[i];
//            System.out.print(menuItem.getName() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//            System.out.println(menuItem.getDescription());
//        }

//        CafeMenu cafeMenu = new CafeMenu();



        MenuComponent pancakeHouseMenu = new Menuu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menuu("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menuu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menuu("DESSERT MENU","Dessert of course!");

        MenuComponent allMenus = new Menuu("ALL MENUS","All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT","(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();


//

    }
}