import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private String nome;
    private String capa;
    private int numMusica;
    private int numCurtidas;
    private int horasDeMusica;
    private ArrayList<Musica> musicas;


    public Playlist() {
        this("Treinin", "Capa do treinin", 290, 102, 20, new ArrayList<>());
    }
    
    public Playlist(String nome, String capa, int numMusica, int numCurtidas, int horasDeMusica, ArrayList<Musica> musicas) {
        this.nome = nome;
        this.capa = capa;
        this.numMusica = numMusica;
        this.numCurtidas = numCurtidas;
        this.horasDeMusica = horasDeMusica;
        if (musicas == null) {
            this.musicas = new ArrayList<>();
        } else {
            this.musicas = musicas;
        }
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

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public static Playlist criarPlaylist() {
        Scanner scanData = new Scanner(System.in);
        System.out.println("Qual será o nome da playlist?");
        String nome = scanData.nextLine();

        return new Playlist(nome, null, 0, 0, 0, null);
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
        this.numMusica++;
    }

}