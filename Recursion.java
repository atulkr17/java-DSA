class Recursion 
{
    public static void main(String[] args) {
        message(1);
    }
    
    static void message(int n)
    {
        //base condition
        if(n==5)
        {
            System.out.println(5);
            return ;
        }
        //bodey
        System.out.println(n);
        //recursive call
        message(n+1);
    }
    
}