import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int heat;
        Scanner input= new Scanner(System.in);
        System.out.println("Please,enter the heat degree : ");
        heat= input.nextInt();

        if (heat<5){
            System.out.println("You may go to  ski.");
        }
        if(heat>=5&&heat<=15){

            if (heat>=10&&heat<=15){
                System.out.println("You may go to the cinema or picnic");
            }else{ System.out.println("You may go to the cinema.");}
        }
        if (heat>=16&&heat<=25)         {
            System.out.println("You may go to have some picnic.");
        }if(heat>25) {
            System.out.println("You may go to swimming.");
        }
    }
}