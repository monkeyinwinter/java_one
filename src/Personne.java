public class Personne {

 /* definition des attributs*/
    private String nom;
    private String prenom;
    private int taille;


    /*definition des methodes*/


    public void setNom(String var) {
        nom = var;
    }
    public String getNom(){
        return nom;
    }

    public void setPrenom(String var) {
        prenom = var;
    }
    public String getPrenom(){
        return prenom;
    }

    public void setTaille(int var) {
        taille = var;
    }

    public int getTaille(){

        return taille;
    }


}
