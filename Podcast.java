public class Podcast {
    private String nome;
    private String capa;
    private int numeroDeCurtidas;
    private int numeroDeEpisodios;

    public Podcast() {
        this("PodPah", "capa :)", 1000000, 159);
    }
    public Podcast (String nome, String capa, int numeroDeCurtidas, int numeroDeEpisodios) {
        this.nome = nome;
        this.capa = capa;
        this.numeroDeCurtidas = numeroDeCurtidas;
        this.numeroDeEpisodios = numeroDeEpisodios;
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

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public void setNumeroDeCurtidas(int numeroDeCurtidas) {
        this.numeroDeCurtidas = numeroDeCurtidas;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public void adicionarEpisodio() {

    }
    public void darPlayNoEpisodio() {

    }
    public void adicionarDescricaoEpisodio() {

    }
    public void adicionarCapaEpisodio() {

    }

}