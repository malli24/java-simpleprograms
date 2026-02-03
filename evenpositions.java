public class evenpositions {
    public static void main(String[] args) {
        String str="computer";
        System.out.print("even positions charcters:");
        for(int i=1;i<str.length(); i+=2){
            System.out.println(str.charAt(i)+"");
        }
    }
}
