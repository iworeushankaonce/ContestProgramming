import java.util.*;
    import java.io.*;
    public class p1179 {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int[] a = new int[15];
            int[] b = new int[15];
            int j1 = 0, j2 = 0;
            for(int i = 0; i < 15; i++)
            {
                int c = scan.nextInt();
                if(c % 2 == 0)
                {
                    a[j1] = c;
                    j1++;
                    if(j1 == 5)
                    {
                        for(int j = 0; j < j1; j++)
                           System.out.println("par[" + j + "] = " + a[j]);                
                        j1 = 0;
                    }
                }
                else
                {
                    b[j2] = c;
                    j2++;
                    if(j2 == 5)
                    {
                        for(int j = 0; j < j2; j++)
                           System.out.println("impar[" + j + "] = " + b[j]);
                        j2 = 0;
                    }
                }
            }
            for(int j = 0; j < j2; j++)
                   System.out.println("impar[" + j + "] = " + b[j]);
            for(int j = 0; j < j1; j++)
                   System.out.println("par[" + j + "] = " + a[j]);
  }
}