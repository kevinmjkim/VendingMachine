package vendingmachine;
import java.util.List;

public class VendingMachine {
private String name;

    private List<Drink> drinkList;
    private double money;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }





    public List<Snack> getSnacksList() {
        return snacksList;
    }

    public void setSnacksList(List<Snack> snacksList) {
        this.snacksList = snacksList;
    }


private List<Snack> snacksList;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
