
class Library {
    String [] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books=0;
    }
    public void addBooks(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book +" has been added");
    }

    public void availableBooks(){
        for (String book:this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);

        }
    }
    public void issueBook(String book){
        for (int i=0; i< this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("the book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("book doesn't exist not found");
    }
    public void returnBook(String book){
        addBooks(book);
    }

}


public class CWH_51_Exercise4 {
    public static void main(String[] args) {

        Library l= new Library();
        l.addBooks("think and grow reach");
        l.addBooks("Algorithms");
        l.addBooks("C++");
        l.availableBooks();
        l.issueBook("C++");
        l.availableBooks();
        l.returnBook("C++");
        l.availableBooks();
    }
}
