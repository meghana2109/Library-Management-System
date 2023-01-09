public class MainClass {
    public static void main(String[] args) {
        Book b1 = new Book(001,"How it ends","Fiction",240,"Laura Wiess");
        Book b2 = new Book(002,"Sita-Warrior of Mithila","Historical Fiction",300,"Amish");

        Customer c1 = new Customer(001,"Meghana","M",29);
        Customer c2 = new Customer(002,"Pawan","Kumar",30);

        Category cat1 = new Category(001,"Fiction");
        Category cat2 = new Category(002,"Historical Fiction");

        System.out.println("Book Details : '"+b1.bookName+"' by "+b1.author);
        System.out.println("Book Details : '"+b2.bookName+"' by "+b2.author);


    }
}
