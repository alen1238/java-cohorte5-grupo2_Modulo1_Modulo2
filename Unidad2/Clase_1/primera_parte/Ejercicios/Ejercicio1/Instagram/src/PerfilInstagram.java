public class PerfilInstagram {
    //atributos
    private String username;
    private int seguidores;
    private String bio;


    //constructor
    public PerfilInstagram(){

    }

    public PerfilInstagram(String username){
        this.username = username;
        seguidores = 0;
    }

    public PerfilInstagram(String username, String bio){
        this.username = username;
        this.bio = bio;
        seguidores = 0;
    }


    //métodos
    //getters
    public String getUsername(){
        return username;
    }

    public int getSeguidores(){
        return seguidores;
    }

    public String getbio(){
        return bio;
    }

    //setters
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setBio(String newBio){
        this.bio = newBio;
    }

    public void follow(){
        seguidores++;
    }
}
