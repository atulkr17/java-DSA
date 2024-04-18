public class Pattern {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n)
    {
          
    /*    *           |           1           |           A
        * * *         |         1 2 3         |         A B C
      * * * * *       |       1 2 3 4 5       |       A B C D E
    * * * * * * *     |     1 2 3 4 5 6 7     |     A B C D E F G
  * * * * * * * * *   |   1 2 3 4 5 6 7 8 9   |   A B C D E F G H I
    * * * * * * *     |     1 2 3 4 5 6 7     |     A B C D E F G
      * * * * *       |       1 2 3 4 5       |       A B C D E
        * * *         |         1 2 3         |         A B C
          *           |           1           |           A           */
        for(int row=0;row<(n);row++)
        {// for every row run the clo
            for(int space=0; space<n-row;space++)
            {
               System.out.print(" ");
            }
            for(int col=0;col<row;col++)
            {
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
    }
    static void pattern7(int n)
    {
         //* * * * *   |       1 2 3 4 5   |       A B C D E
        //* * * * *    |      1 2 3 4 5    |      A B C D E
       //* * * * *     |     1 2 3 4 5     |     A B C D E
      //* * * * *      |    1 2 3 4 5      |    A B C D E
     //* * * * *       |   1 2 3 4 5       |   A B C D E
        for(int row=1; row<=n; row++)
        {// for every row run the clom
            for(int i=0;i<n-row;i++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=n; col++)
            {
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();  
        }
        for(int row=1; row<=n; row++)
        {// for every row run the clom
            for(int i=0;i<n-row;i++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=n; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println(); 
        }
        for(int row=0; row<=n; row++)
        {// for every row run the clom
            for(int i=0;i<n-row;i++)
            {
                System.out.print(" ");
            }
            for(int col=0; col<=n; col++)
            {
                char ch = (char)('A'+col);
                System.out.print(ch+" ");
            }
            System.out.println(); 
        }
    }
    static void pattern6(int n)
    {
        // *           |           1           |           A
      // * * *         |         1 2 3         |         A B C
     //* * * * *       |       1 2 3 4 5       |       A B C D E
   //* * * * * * *     |     1 2 3 4 5 6 7     |     A B C D E F G
 //* * * * * * * * *   |   1 2 3 4 5 6 7 8 9   |   A B C D E F G H I
        for(int row=0;row<n;row++)
        { // for every row run the clo
            
            for(int sp=1;sp<n-row;sp++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<row;col++)
            {
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
        for(int row=1;row<n;row++)
        { // for every row run the clo
            
            for(int sp=0;sp<n-row;sp++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<row;col++)
            {
                System.out.print(col+" ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
        for(int row=0;row<n;row++)
        { // for every row run the clo
            
            for(int sp=0;sp<n-row;sp++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<row;col++)
            {
                char ch=(char)('A'+col);
                System.out.print(ch+" ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
       
    }

    static void pattern28(int n)
    {
     
        for(int row=0; row<2*n; row++)
        {// for every row run the clo
            int totalcostInrow= row>n ? 2*n -row: row;
            int noOfspace=n-totalcostInrow;
            for(int sp =0;sp<noOfspace;sp++)
            {
                System.out.println(" ");
            }
            for(int col=0; col<totalcostInrow; col++)
            {
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();  
        }
    }
    static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {// for every row run the clo
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
       
    }
    static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {// for every row run the clo
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
       
    }
    static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {// for every row run the clo
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
       
    }
        
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {// for every row run the clo
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();   
        }
       
    }
}
