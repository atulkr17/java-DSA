public class Reverse {
    public static void main(String[] args) {
        String name="Atul";
        System.out.println(reverse(name));   
    }
    static String reverse(String str)
    {
        String name="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            name =ch+name;

        }
        return name;
    }
}
