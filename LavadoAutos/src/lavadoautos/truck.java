package lavadoautos;
public class truck extends vehicle {
    private int price;
    public truck () {
        price = 500000;
    }
    public void setTruck (int price) {
        this.price = price;
    }
    public int getTruck () {
        return price;
    }
}
