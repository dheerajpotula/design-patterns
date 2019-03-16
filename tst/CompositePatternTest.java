import com.potulad.learning.designpatterns.composite.Menu;
import com.potulad.learning.designpatterns.composite.MenuComponent;
import com.potulad.learning.designpatterns.composite.MenuItem;
import lombok.NonNull;

import java.util.Iterator;

public class CompositePatternTest {
    public static void main(String args[]) {
        final MenuComponent menu = new Menu("All Menus");

        final MenuComponent subMenuBreakFast = new Menu("Breakfast Menu");
        final MenuComponent subMenuLunch = new Menu("Lunch Menu");
        final MenuComponent subMenuDinner = new Menu("Dinner Menu");
        final MenuComponent subMenuDessert = new Menu("Dessert Menu");

        final MenuComponent menuItemBreakfast1 = new MenuItem("Pancakes", "Banana Pancakes", 11.04, true);
        final MenuComponent menuItemBreakfast2 = new MenuItem("Waffles", "Chocolate Waffles", 13.23, true);
        final MenuComponent menuItemBreakfast3 = new MenuItem("Bacon and Eggs", "Bacon with Scrambled egg", 8.23, false);

        final MenuComponent menuItemLunch1 = new MenuItem("Grilled Chicken", "Grilled Chicken with beans", 13.02, false);
        final MenuComponent menuItemLunch2 = new MenuItem("Pork Something", "Something made with pork", 12, false);
        final MenuComponent menuItemLunch3 = new MenuItem("Caesar Salad", "Caesar salad with dressing", 7, true);
        final MenuComponent menuItemLunch4 = new MenuItem("Veggie Delight Pizza", "Pizza with all Veg toppings", 17, true);

        final MenuComponent menuItemDinner1 = new MenuItem("Chicken Ravioli", "Chicken Ravioli with garlic sauce", 18, false);
        final MenuComponent menuItemDinner2 = new MenuItem("Sushi", "NY Style sushi in Scranton", 14, false);
        final MenuComponent menuItemDinner3 = new MenuItem("Vegetable Noodles", "Schezwan Vegetable noodles", 13, true);

        final MenuComponent menuItemDessert1 = new MenuItem("Chocolate Chip Ice Cream", "Chocolate ice cream dipped in hot " +
                "chocolate sauce with chocolate chips", 6.23, true);
        final MenuComponent menuItemDessert2 = new MenuItem("Classic Cheesecake", "NY Style cheese cake", 8.12, false);

        subMenuBreakFast.addMenuComponent(menuItemBreakfast1);
        subMenuBreakFast.addMenuComponent(menuItemBreakfast2);
        subMenuBreakFast.addMenuComponent(menuItemBreakfast3);

        subMenuDessert.addMenuComponent(menuItemDessert1);
        subMenuDessert.addMenuComponent(menuItemDessert2);

        subMenuLunch.addMenuComponent(menuItemLunch1);
        subMenuLunch.addMenuComponent(menuItemLunch2);
        subMenuLunch.addMenuComponent(menuItemLunch3);
        subMenuLunch.addMenuComponent(subMenuDessert);
        subMenuLunch.addMenuComponent(menuItemLunch4);

        subMenuDinner.addMenuComponent(menuItemDinner1);
        subMenuDinner.addMenuComponent(menuItemDinner2);
        subMenuDinner.addMenuComponent(menuItemDinner3);

        menu.addMenuComponent(subMenuBreakFast);
        menu.addMenuComponent(subMenuLunch);
        menu.addMenuComponent(subMenuDinner);

        menu.print();
        printOnlyNames(menu.getIterator());
        printVegetarianMenu(menu.getIterator());

    }

    private static void printOnlyNames(@NonNull Iterator<MenuComponent> menuComponentIterator) {
        while(menuComponentIterator.hasNext()) {
            System.out.println(menuComponentIterator.next().getName());
        }
    }

    private static void printVegetarianMenu(@NonNull Iterator<MenuComponent> menuComponentIterator) {
        while(menuComponentIterator.hasNext()) {
            MenuComponent menuComponent = menuComponentIterator.next();
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ex) {
                continue;
            }
        }
    }
}
