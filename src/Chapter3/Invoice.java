package Chapter3;

public class Invoice{

    private String description;
    private String number;
    private int quantity;
    private double price;
    private double invoiceAmount;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public static void main(String[] args) {


    }

    public double getInvoiceAmount() {
       double amount = quantity * price;
        return amount;

    }






    public void setNumber(String two) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setDescription(String pipes) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int quantity) {
          this.quantity = quantity;
          if(quantity > 0){
              this.quantity = quantity;
          }
    }


    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
        if(price > 0){
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }
}

