import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaCupMain {

    public static void main(String[] args) {

        int userInput;
        System.out.println("Hello!, welcome to " +
                "BoraboraRestaurant"
        );
        do {
            System.out.println("What would you like to do?\n"
                    + "1 -Add new order?\n"
                    + "2 -show the orders \n"
                    + "3 -Exit ?"
            );
            Scanner sn = new Scanner(System.in);

            userInput = sn.nextInt();


            switch (userInput){
                case 1:
                    addNewOrder(sn);
                    break;
                case 2:
                    showOrders();
                    break;
                default:
                    System.out.println("Goodbye!");
                    userInput=3;

            }

        } while (userInput !=3);
        }

    private static void addNewOrder(Scanner sn){
        System.out.println("add new order");
        ArrayList<MenuItem> listOfItems = new Menu().getMenuItems();
//        System.out.println("Select Item to order" );
        for (int i =0; i <listOfItems.size();i ++){
            System.out.println( i + " " +listOfItems.get(i).getName());
        }
        int userInput = sn.nextInt();
        Order order = new Order();


    }
    private static void showOrders(){
        System.out.println("Show all the order you selected");
    }
}
