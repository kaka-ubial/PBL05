public class Playlist {
    private String nome;
    private String capa;
    private int numMusica;
    private int numCurtidas;
    private int horasDeMusica;

    public Playlist() {
        this("Treinin", "Capa do treinin", 290, 102, 20);
    }
    public Playlist (String nome, String capa, int numMusica, int numCurtidas, int horasDeMusica) {
        this.nome = nome;
        this.capa = capa;
        this.numMusica = numMusica;
        this.numCurtidas = numCurtidas;
        this.horasDeMusica = horasDeMusica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public int getNumMusica() {
        return numMusica;
    }

    public void setNumMusica(int numMusica) {
        this.numMusica = numMusica;
    }

    public int getNumCurtidas() {
        return numCurtidas;
    }

    public void setNumCurtidas(int numCurtidas) {
        this.numCurtidas = numCurtidas;
    }

    public int getHorasDeMusica() {
        return horasDeMusica;
    }

    public void setHorasDeMusica(int horasDeMusica) {
        this.horasDeMusica = horasDeMusica;
    }

    public void addMusica() {

    }

    public void delMusica() {

    }

    public void compartilharPlaylist() {

    }

    public void tornarPublica() {

    }
}