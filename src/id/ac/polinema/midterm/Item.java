package id.ac.polinema.midterm;


public class Item {
    protected String name;
    protected float price;
    protected int amount;

    public Item() {
    }
    
    
//construktor Untuk mendapatkan nilai dari class main//
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
//getter untuk mendapatkan nilai total harga//
    
    public float getTotalPrice(){
    return price * amount;
    }
    //override//
    @Override
    public String toString(){
    return null;
    }
}
