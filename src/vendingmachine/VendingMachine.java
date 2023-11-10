package vendingmachine;
import java.util.List;
import java.util.ArrayList;
public class VendingMachine {
private String name;

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

    private List<Drink> drinkList;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public List<Snacks> getSnacksList() {
        return snacksList;
    }

    public void setSnacksList(List<Snacks> snacksList) {
        this.snacksList = snacksList;
    }

    private String name2;
private List<Snacks> snacksList;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    private String money;
}
