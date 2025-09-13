package library;

public class students
{
    //static variables

    String name;
    String rollno;
    String department;

    public students(String name,String rollno,String department)//initializing fields

    {   //parameter passing
        this.name=name;
        this.rollno=rollno;
        this.department=department;

    }

    public void getBook(books b){
        if(b.availability && b.quantity!=0)
        {
            b.availability=false;
            b.quantity--;
            System.out.println("rollnum :" + rollno + "borrowed"+b.title);

        }
        else{
            System.out.printf("book %s has been borrowed \n",b.title);
        }

    }
}
