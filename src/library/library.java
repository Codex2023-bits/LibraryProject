package library;
import java.util.*;

public class library
{
    //static variables
    books [] book_array=new books[100];
    students [] student_array=new students[100];
    staffs [] staff_array=new staffs[100];


    int staff_count=0;
    int student_count=0;
    int books_count=0;

    //constructor
    public library()
    {

    }

    //getbook method
    public void getBook(books b)
    {
        book_array[books_count]=b;
        books_count++;
        System.out.println("book added:"+b.title);
    }

    public void removeBook(books b){
        int index=0;
        for(int i=0;i<books_count;i++){
            if(book_array[i] ==b){
                index=i;
                break;
            }
        }

        if(index==0){
            System.out.println("no such book exists");
        }

        for(int i=index;i<)
    }

}
