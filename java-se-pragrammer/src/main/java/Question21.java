public class Question21 {
    public static void main(String[] args) {
        Question21 question21 = new Question21();
        try {
            question21.doPrint();
            question21.doList();

        } catch (Exception e2) {
            int x = 10;
            System.out.println("Caught " + e2);
        }
    }


    public void doList() throws Exception {
        throw new Error("Error");
    }

    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }

    // Exception in thread "main" java.lang.Error: Error
    // at Question21.doList(Question21.java:14)
    // at Question21.main(Question21.java:5)
}
