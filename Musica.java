public class Musica {
    private String nome;
    private String artista;
    private float tempo;
    private String dataDeLancamento;
    private String album;

    public Musica() {
        this("Carry on Wayward Son", "Kansas", 4.15f, "20-10-1998", "K");
    }
    public Musica (String nome, String artista, float tempo, String dataDeLancamento, String album) {
        this.nome = nome;
        this.artista = artista;
        this.tempo = tempo;
        this.dataDeLancamento = dataDeLancamento;
        this.album = album;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public float getTempo() {
        return tempo;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public String getAlbum() {
        return album;
    }

//    public void darPlay() {
//    }
//
//    public String pausar() {
//    }
//
//    public void avancarMusica() {
//    }
//
//    public void trocarMusica() {
//    }
//
//    public void colocarEmLoop() {
//    }
}