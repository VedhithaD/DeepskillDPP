public class DocTest {
    public static void main(String args[]) {
        Demo doc = new Demo();
        Doc word = doc.getDoc("WordDoc");
        if (word != null) {
            word.open();
        } else {
            System.out.println("Invalid");
        }
    }
}
