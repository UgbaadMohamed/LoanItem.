import java.util.ArrayList;
import java.util.Scanner;
public class Loan {
    private String title;

    private String loanType;
    private int loanAmount;

    private static int counting = 1;

    private String type;

    private String name;
    ArrayList<Item> arrayListLoan = new ArrayList();

    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);

    public String getName () {
        return name;
    }
    public int LoanItemAmount() {
        System.out.print("Enter you name: ");
        name =  scanner.nextLine();

        System.out.print("How many Loan items do you want to registre?");
        loanAmount = sc.nextInt();
        return loanAmount;
    }

    public void loanTypeAndTitle() {
        for (int i = 0; i < loanAmount; i++) {
            System.out.println("ITEM no. " + counting++);
            System.out.print("Type ('b' for Book or 'v' for Video)");
            loanType = scanner.nextLine();

            System.out.print("Title : ");
            title = scanner.nextLine();

            if (loanType.equalsIgnoreCase("b")) {
                type = "Book";
                arrayListLoan.add(new Book(type, title));
            }
            if (loanType.equalsIgnoreCase("v")) {
                type = "Video";
                arrayListLoan.add(new Video(type, title));
            }
        }
    }
    public ArrayList<Item> getArrayListLoan() {
        return arrayListLoan;
    }

}

