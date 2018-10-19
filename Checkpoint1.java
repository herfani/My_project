import java.util.Scanner;

public class Checkpoint1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");

        int antalFormer = scanner.nextInt();
        int[] formStorlek = new int[antalFormer];

        for (int i = 0; i < antalFormer; i++) {
            System.out.print("Enter size of shape " + (i + 1) + ": ");
            int form = scanner.nextInt();
            formStorlek[i] = form;
        }

        int räknare = 0;
        for (int i = 0; i < antalFormer; i++) {
            int antalStjärnor = formStorlek[i];
            do {
                for (int j = 0; j < antalStjärnor; j++) {
                    System.out.print("*");
                }
                System.out.println();
                räknare ++;
            } while (räknare < antalStjärnor);
            räknare = 0;
        }

     /* char star = '*';
      int antal = 5;
      int j = 0;
      do {
          for (int i = 0; i < antal; i++) {
              System.out.print(star);

          }
          j++;
      } while (j < antal) ;*/





    }

}
