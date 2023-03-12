import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class Book {
    private UUID id;
    private String title;
    private String author;
    private String category;

    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public UUID getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCategory() {
        return this.category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "ID: " + this.id + "\nTitle: " + this.title + "\nAuthor: " + this.author + "\nCategory: " + this.category;
    }
}

class BookManager {
    private static ArrayList<Book> books = new ArrayList<Book>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Tambah data buku");
            System.out.println("2. Tampilkan semua data buku");
            System.out.println("3. Tampilkan data buku berdasarkan ID");
            System.out.println("4. Update data buku berdasarkan ID");
            System.out.println("5. Hapus data buku berdasarkan ID");
            System.out.println("0. Keluar");
            System.out.print("Pilihan anda: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    displayBookById();
                    break;
                case 4:
                    updateBookById();
                    break;
                case 5:
                    deleteBookById();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan salah. Silahkan coba lagi.");
                    break;
            }
        } while (choice != 0);
    }


    private static void addBook() {
        scanner.nextLine(); // clear the buffer
        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String author = scanner.nextLine();
        System.out.print("Masukkan kategori buku: ");
        String category = scanner.nextLine();
        Book book = new Book(title, author, category);
        books.add(book);
        System.out.println("Data buku berhasil ditambahkan.");
    }

    private static void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static Book findBookById(UUID id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    private static void displayBookById() {
        scanner.nextLine(); // clear the buffer
        System.out.print("Masukkan ID buku: ");
        String idString = scanner.nextLine();
        UUID id = UUID.fromString(idString);
        Book book = findBookById(id);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Data buku tidak ditemukan.");
        }

    }

    private static void updateBookById() {
        scanner.nextLine(); // clear the buffer
        System.out.print("Masukkan ID buku yang ingin diubah: ");
        String idString = scanner.nextLine();
        UUID id = UUID.fromString(idString);
        Book book = findBookById(id);
        if (book != null) {
            System.out.print("Masukkan judul baru (kosongkan jika tidak ingin diubah): ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) {
                book.setTitle(title);
            }

            System.out.print("Masukkan penulis baru (kosongkan jika tidak ingin diubah): ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) {
                book.setAuthor(author);
            }

            System.out.print("Masukkan kategori baru (kosongkan jika tidak ingin diubah): ");
            String category = scanner.nextLine();
            if (!category.isEmpty()) {
                book.setCategory(category);
            }

            System.out.println("Data buku dengan ID " + idString + " berhasil diubah menjadi:");
            System.out.println(book);
        } else {
            System.out.println("Data buku tidak ditemukan.");
        }
    }

    private static void deleteBookById() {
        scanner.nextLine(); // clear the buffer
        System.out.print("Masukkan ID buku yang ingin dihapus: ");
        String idString = scanner.nextLine();
        UUID id = UUID.fromString(idString);
        Book bookToDelete = findBookById(id);
        if (bookToDelete != null) {
            books.remove(bookToDelete);
            System.out.println("Data buku dengan ID " + idString + " telah dihapus.");
        } else {
            System.out.println("Data buku tidak ditemukan.");
        }
    }
}

