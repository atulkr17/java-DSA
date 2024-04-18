import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of String");
        String name=sc.nextLine();
        System.out.println("Enter a number of char");
        char target=sc.next().charAt(0);
        System.out.println(search(name,target));

        
    }
    static boolean search(String str,char terget)
    {
       if(str.length()==0)
       {
        return false;
       }
       for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i)==terget)
        {
            return true;
        }
       }
       return false;
    }
}
