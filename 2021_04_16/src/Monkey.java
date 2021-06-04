public class Monkey {
    private int number;
    private boolean isCounting;

    public Monkey(int number, boolean isCounting) {
        this.number = number;
        this.isCounting = isCounting;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isCounting() {
        return isCounting;
    }

    public void setCounting(boolean counting) {
        isCounting = counting;
    }
}
