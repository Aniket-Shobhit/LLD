package Machine;

public enum Coin {
    PENNY(1),
    DIME(10),
    NICKEL(5),
    QUARTER(25);

    public int value;

    Coin(int value) {
        this.value = value;
    }
}
