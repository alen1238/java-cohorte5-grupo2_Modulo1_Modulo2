public class Short {
   //atributos: variables globales
    private String urlImg;
    private String titulo;
    private int vistas;

    public Short(){ //constructor por defecto
    }

    public Short(String urlImg, String titulo){
        this.urlImg = urlImg;
        this.titulo = titulo;
        this.vistas = 0;
    }

    //métodos que me permitan consultar los atributos privados (getters)
    public String getUrlImg(){
        return this.urlImg;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getVistas(){
        return this.vistas;
    }

    //métodos que me permitan modificar los atributos privados (setters)
    public void setUrlImg(String urlImg){
        this.urlImg = urlImg;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void aumentarVistas(){
        this.vistas++; //incrementa en 1 el número de vistas
    }
}
