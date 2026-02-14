public class App {
    public static void main(String[] args) throws Exception {
        PerfilInstagram perfil1 = new PerfilInstagram("alen1238");
        System.out.println("seguidores de " + perfil1.getUsername() + ": " + perfil1.getSeguidores());

        PerfilInstagram perfil2 = new PerfilInstagram("maria_89", "Amo viajar y fotografar");
        System.out.println("seguidores de " + perfil2.getUsername() + ": " + perfil2.getSeguidores());

        perfil1.follow();
        System.out.println("seguidores de " + perfil1.getUsername() + ": " + perfil1.getSeguidores());
        perfil1.follow();
        perfil1.follow();
        perfil1.follow();
        perfil1.follow();
        System.out.println("seguidores de " + perfil1.getUsername() + ": " + perfil1.getSeguidores());

        perfil2.follow();
        System.out.println("seguidores de " + perfil2.getUsername() + ": " + perfil2.getSeguidores());
    }
}
