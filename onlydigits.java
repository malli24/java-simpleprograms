public class onlydigits {
    public static void main(String[] args) {
        String str="12345";
        boolean isDigitOnly=str.matches("[0-9]+");
        System.out.println("Only digits?" + isDigitOnly);
    }
}
