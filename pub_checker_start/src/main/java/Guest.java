public class Guest {
    //properties
    private String name;
    private int age;
    private int wallet;
    private int soberness;
    private boolean banStatus;
    private char currencyHeld;

    public Guest(String name,
                 int age,
                 int wallet,
                 int soberness,
                 boolean banStatus,
                 char currencyHeld){

        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.soberness = soberness;
        this.banStatus = banStatus;
        this.currencyHeld = currencyHeld;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getSoberness() {
        return soberness;
    }

    public void setSoberness(int soberness) {
        this.soberness = soberness;
    }

    public boolean getBanStatus() {
        return banStatus;
    }

    public void setBanStatus(boolean banStatus) {
        this.banStatus = banStatus;
    }


}
