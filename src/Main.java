import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import vendingmachine.Drink;
import vendingmachine.Snacks;
import vendingmachine.VendingMachine;
public class Main {
    public static void main(String[] args) {
        Drink myDrink = new Drink();
        myDrink.setDrink("Coca Cola");
        myDrink.setPrice("$1.00");
        myDrink.setQuantity("4 oz");
        System.out.println("The can cost this much: " + myDrink.getPrice() + "The can has a quantity of: " + myDrink.getQuantity() + " Would you like it?: " );
        Scanner Drink = new Scanner(System.in);
        String answer = Drink.nextLine();
        if (answer.equals("yes")) {
            System.out.println("Coca Cola: " + answer + "-> Processing..." );
            System.out.println("1...");
            System.out.println("2...");

            System.out.println("Finished!");
        } else if(answer.equals("Yes")) {
            System.out.println("Coca Cola: " + answer + "-> Processing..." );
            System.out.println("1...");
            System.out.println("2...");

            System.out.println("Finished!");
        } else {
            System.out.println("Make Sure to Have A Good Day!");
        }
        Drink myDrink2 = new Drink();
        myDrink2.setDrink("Fanta");
        myDrink2.setPrice("$1.00");
        myDrink2.setQuantity("4 oz");
        System.out.println("The can cost this much: " + myDrink2.getPrice2() + "The can has a quantity of: " + myDrink2.getQuantity2() + " Would you like it?: " );
        Scanner Drink2 = new Scanner(System.in);
        String answer2 = Drink.nextLine();
        if (answer2.equals("yes")) {
            System.out.println("Fanta: " + answer2 + "-> Processing..." );
            System.out.println("1...");
            System.out.println("2...");

            System.out.println("Finished!");
        } else if(answer2.equals("Yes")) {
            System.out.println("Fanta: " + answer2 + "-> Processing..." );
            System.out.println("1...");
            System.out.println("2...");

            System.out.println("Finished!");
        } else {
            System.out.println("Make Sure to Have A Good Day!");
        }

        Drink myDrink3 = new Drink();
        myDrink.setDrink("Sprite");
        myDrink.setPrice("$1.00");
        myDrink.setQuantity("4 oz");
        System.out.println("The can cost this much: " + myDrink3.getPrice3() + "The can has a quantity of: " + myDrink3.getQuantity3() + " Would you like it?: " );
        Scanner Drink3 = new Scanner(System.in);
        String answer3 = Drink.nextLine();
        if (answer3.equals("yes")) {
            System.out.println("Sprite: " + answer3 + "-> Processing..." );
            System.out.println("1...");
            System.out.println("2...");

            System.out.println("Finished!");
        } else if(answer3.equals("Yes")) {
            System.out.println("Sprite: " + answer3 + "-> Processing..." );
            System.out.println("1...");
            System.out.println("2...");

            System.out.println("Finished!");
        } else {
            System.out.println("Make Sure to Have A Good Day!");
        }
    }
    Snacks mySnacks = new Snacks();
        mySnacks.setSnacks("Hershey's Chocolate Bar");
        mySnacks.setPrice("$1.50");
        mySnacks.setQuantity("100 grams");
        System.out.println("The bar cost this much: " + mySnacks.getPrice() + "The bar has a quantity of: " + mySnacks.getQuantity() + " Would you like it?: " );
    Scanner Snacks = new Scanner(System.in);
    String food = Snacks.nextLine();
        if (food.equals("yes")) {
        System.out.println("Hershey's Chocolate Bar: " + food + "-> Processing..." );
        System.out.println("1...");
        System.out.println("2...");

        System.out.println("Finished!");
    } else if(food.equals("Yes")) {
        System.out.println("Hershey's Chocolate Bar: " + food + "-> Processing..." );
        System.out.println("1...");
        System.out.println("2...");

        System.out.println("Finished!");
    } else {
        System.out.println("Make Sure to Have A Good Day!");
    }
    Snacks mySnacks2 = new Snacks();
        mySnacks.setSnacks2("Hershey's Chocolate Bar");
        mySnacks.setPrice2("$1.50");
        mySnacks.setQuantity2("100 grams");
        System.out.println("The bar cost this much: " + mySnacks.getPrice2() + "The bar has a quantity of: " + mySnacks.getQuantity2() + " Would you like it?: " );
    Scanner Snacks2 = new Scanner(System.in);
    String food2 = Snacks2.nextLine();
        if (food2.equals("yes")) {
        System.out.println("Hershey's Chocolate Bar: " + food2 + "-> Processing..." );
        System.out.println("1...");
        System.out.println("2...");

        System.out.println("Finished!");
    } else if(food2.equals("Yes")) {
        System.out.println("Hershey's Chocolate Bar: " + food2 + "-> Processing..." );
        System.out.println("1...");
        System.out.println("2...");

        System.out.println("Finished!");
    } else {
        System.out.println("Make Sure to Have A Good Day!");
    }
    Snacks mySnacks3 = new Snacks();
        mySnacks.setSnacks3("Hershey's Chocolate Bar");
        mySnacks.setPrice3("$1.50");
        mySnacks.setQuantity3("100 grams");
        System.out.println("The bar cost this much: " + mySnacks.getPrice3() + "The bar has a quantity of: " + mySnacks.getQuantity3() + " Would you like it?: " );
    Scanner Snacks3 = new Scanner(System.in);
    String food3 = Snacks.nextLine();
        if (food3.equals("yes")) {
        System.out.println("Hershey's Chocolate Bar: " + food3 + "-> Processing..." );
        System.out.println("1...");
        System.out.println("2...");

        System.out.println("Finished!");
    } else if(food3.equals("Yes")) {
        System.out.println("Hershey's Chocolate Bar: " + food3 + "-> Processing..." );
        System.out.println("1...");
        System.out.println("2...");

        System.out.println("Finished!");
    } else {
        System.out.println("Make Sure to Have A Good Day!");
    }

    }