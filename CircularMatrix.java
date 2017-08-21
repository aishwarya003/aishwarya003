package player;
import java.util.*;

public class CircularMatrix {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
int aa=1, c1=0, c2=n-1, r1=0, r2=n-1;

while(aa<=n*n)
    {
        for(int i=c1;i<=c2;i++)
        {
            a[r1][i]=aa++;
        }

        for(int j=r1+1;j<=r2;j++)
        {
            a[j][c2]=aa++;
        }

        for(int i=c2-1;i>=c1;i--)
        {
            a[r2][i]=aa++;
        }

        for(int j=r2-1;j>=r1+1;j--)
        {
            a[j][c1]=aa++;
        }

     c1++;
     c2--;
     r1++;
     r2--;
    }



for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
     System.out.println();
    }
}

}

