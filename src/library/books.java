package library;//package of the whole set of classes to be stored inside

public class books
{        //class books which has instance variables
                            // aka fields inside it

    //instance variables aka fields aka attributes
    String title;
    String author;
    double price;
    int quantity;
    boolean availability;

    //constructor to initialize the fields

    public books(String title,String author,int quantity)//note tht constructor
            //name should be the same as the class name
    {
        this.title=title;//(lhs is the field) = (rhs is the parameter)
        this.author=author;
        this.price=price;
        this.quantity=quantity;
        this.availability=true;
    }

    public void displayDetails(){
        System.out.printf("Title: %s || Author: %s || Quantity: %d || Price: %.2f",title,author,quantity,price);
        System.out.printf("Availability: %b",availability);
    }

}
