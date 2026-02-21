/* 1=> problem==> Library Book – Create a Book class with title, author, yearPublished. Use a parameterized constructor
and a displayInfo() method to print details of multiple books.

✅ Explanation:

Parameterized Constructor

Allows us to create a book with title, author, and yearPublished in a single line.

displayInfo() Method

Prints the book details neatly.

Multiple Books

You can create as many Book objects as you want and display their details.




 */

class Book{

    String title;
    String author;
    int yearPublished;
    Book(String title,String author,int yearPublished)
    {
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
    }
void displayinfo()
{
    System.out.println("Title:"+title);
    System.out.println("Auther :"+author);
    System.out.println("Yearpublished"+yearPublished);
}


}
public class LibraryBook{

    static void main(String[] args) {
        Book ob=new Book("C++","Aslam",2001);
        ob.displayinfo();
        Book ob2=new Book("java","salam",2031);
        ob2.displayinfo();


    }
}
