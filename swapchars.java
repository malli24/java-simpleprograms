public class swapchars {
    public static void main(String[] args) {
        String str="java";
        if(str.length()>1)
        {
            String swapped = str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
            System.out.println("swapped:" + swapped);
        }
        else{
            System.out.println(str);
        }

        }
    }
