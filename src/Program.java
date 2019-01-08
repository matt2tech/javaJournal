import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.FileWriter;

class Program {
    private static Scanner scanner;

    public static void main(String[] args) throws Exception{
        scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter("/home/basecamp/backendIntro/week_04/javaJournal/src/entries/journal.txt", true);
        PrintWriter writer = new PrintWriter(fw);
        writer.println(journal());
        writer.close();
    }

    private static String name() {
        System.out.print("Username?\n");
        return scanner.nextLine();
    }

    private static String entry() {
        System.out.print("Entry?\n");
        return scanner.nextLine();
    }

    private static String timeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private static String journal() {
        System.out.println();
        return String.format("%s\n%s\n\n%s\n", name(), timeStamp(), entry());
    }
}
