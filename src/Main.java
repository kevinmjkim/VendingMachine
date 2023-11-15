import vendingmachine.VendingMachine;
import java.util.ArrayList;
import vendingmachine.Snack;
import vendingmachine.Drink;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setName("My Interesting Machine");
        vendingMachine.setMoney(1000);
        vendingMachine.setDrinkList(new ArrayList<>());

        vendingMachine.setSnacksList(new ArrayList<>());
        Snack hershey = new Snack();
        hershey.setName("Hershey's Chocolate Bar");
        hershey.setPrice(3.00);
        hershey.setQuantity(5);


        Drink pepsi = new Drink();
        pepsi.setName("Pepsi");
        pepsi.setPrice(1.50);
        pepsi.setQuantity(10);

        Drink fanta = new Drink();
        fanta.setName("Fanta");
        fanta.setPrice(2.00);
        fanta.setQuantity(20);

        Snack lays = new Snack();
        lays.setName("Lays Original Chips");
        lays.setPrice(3.50);
        lays.setQuantity(15);

        Snack cookie = new Snack();
        cookie.setName("Chips Ahoy Original Chocolate Chip Cookies");
        cookie.setPrice(2.00);
        cookie.setQuantity(10);

        vendingMachine.getDrinkList().add(pepsi);
        vendingMachine.getSnacksList().add(hershey);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to buy?");
            System.out.println("1. Hershey");
            System.out.println("2. Pepsi");
            System.out.println("3. Fanta");
            System.out.println("4. Lays");
            System.out.println("5. Chips Ahoy");
            int choice = scanner.nextInt();
            if(choice == 1) {
                System.out.println("You chose Hershey. Delicious Option!");
                vendingMachine.setMoney(vendingMachine.getMoney() + hershey.getPrice());
                hershey.setQuantity(hershey.getQuantity() - 1);
                System.out.println("The number of Hershey left is " + hershey.getQuantity());
            int quantity = hershey.getQuantity();
            if(quantity < 0) {
                System.out.println("Sorry! We're out of Hershey!");
            } if(quantity == 0) {
                    System.exit(0);
                }else {

                vendingMachine.setMoney(vendingMachine.getMoney() + hershey.getPrice());
                hershey.setQuantity(quantity-1);
            }

            } else if(choice == 2) {
                System.out.println("You chose Pepsi. Poppy Option!");
                vendingMachine.setMoney(vendingMachine.getMoney() + pepsi.getPrice());
                pepsi.setQuantity(pepsi.getQuantity() - 1);
                System.out.println("The number of Pepsi left is " + pepsi.getQuantity());
                int quantity = pepsi.getQuantity();
                if(quantity < 0) {
                    System.out.println("Sorry! We're out of Pepsi!");
                } if(quantity == 0) {
                    System.exit(0);
                } else {
                    vendingMachine.setMoney(vendingMachine.getMoney() + pepsi.getPrice());
                    pepsi.setQuantity(quantity-1);
                }
            } else if(choice == 3) {
                System.out.println("You chose Fanta. Fantastical!");
                vendingMachine.setMoney(vendingMachine.getMoney() + fanta.getPrice());
                fanta.setQuantity(fanta.getQuantity() - 1);
                System.out.println("The number of Fanta left is " + fanta.getQuantity());
                int quantity = fanta.getQuantity();
                if(quantity < 0) {
                    System.out.println("Sorry! We're out of Fanta!");
                } if(quantity == 0) {
                    System.exit(0);
                } else {
                    vendingMachine.setMoney(vendingMachine.getMoney() + fanta.getPrice());
                    fanta.setQuantity(quantity-1);
                }
            } else if(choice == 4) {
                System.out.println("You chose Lays. How original!");
                vendingMachine.setMoney(vendingMachine.getMoney() + lays.getPrice());
                pepsi.setQuantity(lays.getQuantity() - 1);
                System.out.println("The number of Lays left is " + lays.getQuantity());
                int quantity = lays.getQuantity();
                if(quantity < 0) {
                    System.out.println("Sorry! We're out of Lays!");
                } else {
                    vendingMachine.setMoney(vendingMachine.getMoney() + lays.getPrice());
                    lays.setQuantity(quantity-1);
                } if(quantity == 0) {
                    System.exit(0);
                }
            } else if(choice == 5) {
                System.out.println("You chose Chips Ahoy. Sweet Choice!");
                vendingMachine.setMoney(vendingMachine.getMoney() + cookie.getPrice());
                pepsi.setQuantity(cookie.getQuantity() - 1);
                System.out.println("The number of Chips Ahoy left is " + cookie.getQuantity());
                int quantity = cookie.getQuantity();
                if(quantity < 0) {
                    System.out.println("Sorry! We're out of Chips Ahoy!");
                } if(quantity == 0) {
                    System.exit(0);
                }else {
                    vendingMachine.setMoney(vendingMachine.getMoney() + cookie.getPrice());
                    cookie.setQuantity(quantity-1);
                }
            } else {
                System.out.println("I couldn't understand. Please try again.");
            }
            System.out.println("The amount of money in the machine is " + vendingMachine.getMoney());
        }
//        System.out.println("Do you want to buy an Hershey? (yes/no)" );
//        Scanner machineScanner = new Scanner(System.in);
//        String answer = machineScanner.nextLine();
//        if(answer.equalsIgnoreCase("Yes")) {
//            int hersheyQuantity = hershey.getQuantity();
//            hersheyQuantity-- ;
//            hershey.setQuantity(hersheyQuantity);
//            vendingMachine.setMoney(vendingMachine.getMoney() + hershey.getPrice());
//
//        }
//        System.out.println("the amount of money left in the machine is " + vendingMachine.getMoney());
//        System.out.println("the number of Hershey left in the machine is " + hershey.getQuantity());
//        Snacks mySnacks = new Snacks();
//        mySnacks.setSnacks("Hershey's Chocolate Bar");
//        mySnacks.setPrice("$1.50");
//        mySnacks.setQuantity("100 grams");
//        System.out.println("The Hershey's Chocolate Bar cost this much: " + mySnacks.getPrice() + " The bar has a quantity of: " + mySnacks.getQuantity() + " Would you like it?: " );
//        Scanner Snacks = new Scanner(System.in);
//        String food = Snacks.nextLine();
//        if (food.equals("yes")) {
//            System.out.println("Hershey's Chocolate Bar: " + food + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else if(food.equals("Yes")) {
//            System.out.println("Hershey's Chocolate Bar: " + food + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else {
//            System.out.println("Make Sure to Have A Good Day!");
//        }
//        Snacks mySnacks2 = new Snacks();
//        mySnacks.setSnack2("Lay's Chips");
//        mySnacks.setPrice2("$1.50");
//        mySnacks.setQuantity2("500 grams");
//        System.out.println("The Lay's Chips cost this much: " + mySnacks.getPrice2() + " The bag has a quantity of: " + mySnacks.getQuantity2() + " Would you like it?: " );
//        Scanner Snacks2 = new Scanner(System.in);
//        String food2 = Snacks2.nextLine();
//        if (food2.equals("yes")) {
//            System.out.println("Lay's Chips: " + food2 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else if(food2.equals("Yes")) {
//            System.out.println("Lay's Chips: " + food2 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else {
//            System.out.println("Make Sure to Have A Good Day!");
//        }
//        Snacks mySnacks3 = new Snacks();
//        mySnacks.setSnack3("KitKat");
//        mySnacks.setPrice3("$1.50");
//        mySnacks.setQuantity3("100 grams");
//        System.out.println("The KitKat cost this much: " + mySnacks.getPrice3() + "The bar has a quantity of: " + mySnacks.getQuantity3() + " Would you like it?: " );
//        Scanner Snacks3 = new Scanner(System.in);
//        String food3 = Snacks.nextLine();
//        if (food3.equals("yes")) {
//            System.out.println("KitKat: " + food3 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else if(food3.equals("Yes")) {
//            System.out.println("KitKat: " + food3 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else {
//            System.out.println("Make Sure to Have A Good Day!");
//        }
//
//
//        Drink myDrink = new Drink();
//        myDrink.setName("Coca Cola");
//        myDrink.setPrice("$1.00");
//        myDrink.setQuantity("4 oz");
//        System.out.println("The Coca Cola cost this much: " + myDrink.getPrice() + "The can has a quantity of: " + myDrink.getQuantity() + " Would you like it?: " );
//        Scanner Drink = new Scanner(System.in);
//        String answer = Drink.nextLine();
//        if (answer.equals("yes")) {
//            System.out.println("Coca Cola: " + answer + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else if(answer.equals("Yes")) {
//            System.out.println("Coca Cola: " + answer + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else {
//            System.out.println("Make Sure to Have A Good Day!");
//        }
//        Drink myDrink2 = new Drink();
//        myDrink2.setName("Fanta");
//        myDrink2.setPrice("$1.75");
//        myDrink2.setQuantity("4 oz");
//        System.out.println("The Fanta cost this much: " + myDrink2.getPrice() + " The can has a quantity of: " + myDrink2.getQuantity() + " Would you like it?: " );
//        Scanner Drink2 = new Scanner(System.in);
//        String answer2 = Drink.nextLine();
//        if (answer2.equals("yes")) {
//            System.out.println("Fanta: " + answer2 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else if(answer2.equals("Yes")) {
//            System.out.println("Fanta: " + answer2 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else {
//            System.out.println("Make Sure to Have A Good Day!");
//        }
//
//        Drink myDrink3 = new Drink();
//        myDrink.setName("Sprite");
//        myDrink.setPrice("$2.00");
//        myDrink.setQuantity("4 oz");
//        System.out.println("The Sprite cost this much: " + myDrink3.getPrice() + "The can has a quantity of: " + myDrink3.getQuantity() + " Would you like it?: " );
//        Scanner Drink3 = new Scanner(System.in);
//        String answer3 = Drink.nextLine();
//        if (answer3.equals("yes")) {
//            System.out.println("Sprite: " + answer3 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else if(answer3.equals("Yes")) {
//            System.out.println("Sprite: " + answer3 + "-> Processing..." );
//            System.out.println("1...");
//            System.out.println("2...");
//
//            System.out.println("Finished!");
//        } else {
//            System.out.println("Make Sure to Have A Good Day!");
//        }
//    }


    }

    }
