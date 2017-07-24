package Guvi;
import java.util.Scanner;
public class TowerStack {
	 public void solve(int s, String start, String auxiliary, String end) {
	       if (s == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(s - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           solve(s - 1, auxiliary, start, end);
	       }
	   }

	   public static void main(String[] args) {
	       TowerStack towersOfHanoi = new TowerStack();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }
}
