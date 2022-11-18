import java.util.ArrayList;

public class Server {
    // property
    private ArrayList<String> drinkMenu;

    // Constructor

    public Server(){
        this.drinkMenu = new ArrayList<>();
    }
    public boolean canServeGuest(Guest guest) {
        if (guest.getAge() > 18
                && guest.getWallet()>=5
                && guest.getSoberness()>=50
                && guest.getBanStatus() == false
                && guest.getCurrencyHeld() == '£') {
            return true;
        }return false;
    }

    //Getter & Setter
    public ArrayList<String> getDrinkMenu() {
        return drinkMenu;
    }

    public void setDrinkMenu(ArrayList<String> drinkMenu) {
        this.drinkMenu = drinkMenu;
    }
}