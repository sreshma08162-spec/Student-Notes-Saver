import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        FileWriter writer = new FileWriter("student.txt");

        writer.write("Name: " + name + "\n");
        writer.write("Marks: " + marks);

        writer.close();

        System.out.println("Student details saved successfully!");

        File file = new File("student.txt");
        Scanner fileScanner = new Scanner(file);

        System.out.println("\n--- Student Details ---");

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
        sc.close();
    }
}import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        FileWriter writer = new FileWriter("student.txt");

        writer.write("Name: " + name + "\n");
        writer.write("Marks: " + marks);

        writer.close();

        System.out.println("Student details saved successfully!");

        File file = new File("student.txt");
        Scanner fileScanner = new Scanner(file);

        System.out.println("\n--- Student Details ---");

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();
        sc.close();
    }
}
