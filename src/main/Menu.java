import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem>menuItems;

    public Menu(){ menuItems = new ArrayList<>();
    menuItems.add(new MenuItem("Coffee",1));
        menuItems.add(new MenuItem("Cookie",0.50));
        menuItems.add(new MenuItem("Cake pop",1.5));
        menuItems.add(new MenuItem("granola bar",1.5));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
