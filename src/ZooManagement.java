import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public ZooManagement() {
    }

    public void affiche(int nbrCages, String zooName) {
        System.out.println(zooName + " comporte " + nbrCages);
    }

    public static void main(String[] args) {
        ZooManagement z1 = new ZooManagement();
        z1.affiche(20, "my zoo");
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le nombre des cages");
        int nbcages = sc.nextInt();
        if (nbcages < 0) {
            while(nbcages < 0) {
                System.out.println("donner un nombre positive");
                nbcages = sc.nextInt();
                if (nbcages > 0) {
                    break;
                }
            }
        }

        System.out.println("donner le nom de zoo :");
        sc.nextLine();
        String Namezoo = sc.nextLine();
        z1.affiche(nbcages, Namezoo);
    }
}
