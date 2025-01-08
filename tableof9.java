import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=1;i<=n;i++){
        System.out.print(9*i);
        if(i<n)
        {
            System.out.print(" ");
        }
        
        
        }
    }
}