package lavadoautos;
public class vehicle {
    private int price;
    public vehicle () {
        price = 200000;
    }
    
    public void setCar (int price) {
        this.price = price;
    }
    public int getCar () {
        return price;
    }
}
