import java.util.Scanner;

void main(){
    System.out.println("Hello streams");
    System.err.println("Hello error");
    Scanner scanner=new Scanner(System.in);
    //System.out.print("Enter : ");
    String input = scanner.nextLine();
    System.out.println("You entered "+input);
}