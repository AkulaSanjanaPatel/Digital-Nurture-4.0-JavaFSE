public class Test {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "Clean Code", "Robert C. Martin"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "The Pragmatic Programmer", "Andrew Hunt")
        };

        Library lib = new Library(books);

        System.out.println("Linear Search for '1984':");
        Book b1 = lib.linearSearch("1984");
        System.out.println(b1 != null ? b1 : "Not Found");

        System.out.println("\nBinary Search for 'Clean Code':");
        Book b2 = lib.binarySearch("Clean Code");
        System.out.println(b2 != null ? b2 : "Not Found");
    }
}
