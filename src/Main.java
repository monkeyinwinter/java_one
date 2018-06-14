import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     /*   Personne individu = new Personne();
        individu.setNom("Descamps");
        individu.setPrenom("Thibault");
        individu.setTaille(186);

        System.out.println("Salut " + individu.getNom() + " " + individu.getPrenom() + " tu mesure " + individu.getTaille() + " cm !" );

        String entree;
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            System.out.println("Veuillez saisir un mot :");
            entree = sc.nextLine();
            System.out.println("Vous avez saisi : " + entree);
            System.out.println("Voulez-vous réessayer ? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("terminé…");

        String entree_2;
        String reponse_2 = "continue";
        while (!reponse_2.equals("exit")) {
            System.out.println("Veuillez saisir un mot :");
            entree_2 = sc.nextLine();
            System.out.println("Vous avez saisi : " + entree_2);
            System.out.println("Voulez-vous réessayer ? ('exit')");
            reponse_2 = sc.nextLine();
        }
        System.out.println("terminé…");

        Enfant enfant_1 = new Enfant(true, true);
        enfant_1 .setNom("Descamps");
        enfant_1 .setPrenom("Achille");
        enfant_1 .setAge(6);
        enfant_1 .setSport("velo");
        System.out.println("Mon fils est " + enfant_1 .getNom() + " " + enfant_1 .getPrenom() +
                " il a " + enfant_1 .getAge() + " ans !" + enfant_1.getSport() + enfant_1 .ispetit() + enfant_1 .playgames());
*/
        Scanner sc = new Scanner(System.in);

        String reponse_2 = "oui";
        while (!reponse_2.equals("non")) {

            System.out.println("Quel est le nom:");
            String nom = sc.next();

            System.out.println("Quel est le prenom:");
            String prenom = sc.next();

            System.out.println("Quel est l age:");
            String age = sc.next();

            System.out.println("Quel est son sport:");
            String sport = sc.next();

            Enfant enfant_1 = new Enfant();
            enfant_1 .setNom(nom);
            enfant_1 .setPrenom(prenom);
            enfant_1 .setAge(age);
            enfant_1 .setSport(sport);

            System.out.println(enfant_1.getNom());
            System.out.println(enfant_1.getPrenom());
            System.out.println(enfant_1.getAge());
            System.out.println(enfant_1.getSport());

            System.out.println("Voulez-vous réessayer ? ('non')");
            reponse_2 = sc.next();

        }
        System.out.println("terminé…");
    }
}
