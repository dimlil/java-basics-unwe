import java.util.Scanner;

public class Excel2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 0;
        int max = 0;
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            sum += num;
            if(i==0){
                min = num;
            }
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        double avg = (double) sum / n;
        System.out.println("SUM=" + sum+",\t AVERAGE="+String.format("%.2f",avg)+",\t COUNT="+n+",\t MIN="+min+",\t MAX="+max);
    }
}
