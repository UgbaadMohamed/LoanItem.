public class Main {
    void run () {
     System.out.println("________________________________________________________");
     System.out.println("WELCOME TO THE BEST ONLINE STORE FOR VIDEO AND BOOKS  ");
     System.out.println("________________________________________________________");
     Loan loan = new Loan();
     loan.LoanItemAmount();
     loan.loanTypeAndTitle();

     System.out.println("________________________________________________________");
     System.out.println("LIST OF LOAN ITEMS" + "  " + "FOR : "+  " " + loan.getName() );
     System.out.println("________________________________________________________");
     System.out.println("ID         " +   "     TYPE     "   +    "        TITLE      ");
     System.out.println(loan.getArrayListLoan().toString().replace("[", "").replace("]", "").replace(",","\n"));
    }
    
    public static void main (String [] args) {
        new Main().run();
    }

}
