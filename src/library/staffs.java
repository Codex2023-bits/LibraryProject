package library;

public class staffs
{
    //static variables/fields/attributes
    String name;
    int staff_id;

    //constructor
    public staffs(String name,int staff_id){
        this.name=name;
        this.staff_id=staff_id;
    }

    //this method adds a entirely new object of book with di
    public books addBooks(String title,String author,int quantity)
    {
        System.out.println("staff added new book :"+title);
        return new books(title,author,quantity);
    }

    public void removeBook(books b){
        System.out.println("book :"+b.title+" ,removed by "+name);
    }

}
