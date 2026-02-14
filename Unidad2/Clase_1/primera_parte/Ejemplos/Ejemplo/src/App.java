public class App {
    public static void main(String[] args) throws Exception {
        Album album3 = new Album();
        Album album1 = new Album("Cosa nuestra");
        Album album2 = new Album("https://i.scdn.co/image/ab67616d0000b273c8e3f1d6f4e4e4e4e4e4e4e4", "Cosa nuestra", 
                "Los Tigres del Norte");
   
        Short short1 = new Short ("https://i./hqdefault.jpg", "Video divertido");
   
        short1.setTitulo("Comiendo tacos");
        //short1.titulo = "Otro titulo"; //No se puede hacer porque el atributo es privado
        System.out.println("El título del short es: " + short1.getTitulo());
        short1.aumentarVistas(); //abstracción
        System.out.println("Número de vistas: " + short1.getVistas());
    }
}
