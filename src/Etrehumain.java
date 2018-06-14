public class Etrehumain {
    private String nom;
    private String prenom;
    private String age;


    public void setNom(String var) {
        nom = var;
    }
    public String getNom(){
        return "Votre nom est : " + nom;
    }

    public void setPrenom(String var) {
        prenom = var;
    }
    public String getPrenom(){
        return "Votre prenom est : " + prenom;
    }

    public void setAge(String var) {
        age = var;
    }
    public String getAge(){
        return "Votre age : " + age;
    }

}
