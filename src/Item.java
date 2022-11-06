public abstract class Item  {

    private String printType;
    private String printTitle;
    private static int next=1;
    private int printId;
    public Item (String printType, String printTitle) {
        this. printType = printType;
        this.printTitle = printTitle;
    }
    public void setPrintId () {
        this.printId = next++;
    }

    @Override
    public String toString() {
       return "\n" + next++ +  "              " +         printType  +  "              " +           printTitle ;
    }
}
