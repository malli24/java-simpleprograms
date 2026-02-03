public class replacevowel {
    public static void main(String[] args) {
        String str="beautiful";
        String replaced=str.replaceAll("[aeiouAEIOU]","*");
        System.out.println("after replacement:"+replaced);
    }
}
