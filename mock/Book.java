
public class Book {
    private String name;
    private double price;
    private String type;
    
    public Book(){
        super();
    }
    
    public Book(String name ,double price,String type){
        name = this.name;
        price = this.price;
        type = this.type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
