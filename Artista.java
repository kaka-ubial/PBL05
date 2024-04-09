public class Artista extends Usuario {
    private String descricao;
    private int numOuvintes;
    private String genero;
    private String musicasPopulares;

    public Artista(String nome, String email, String senha, String foto, int numeroSeguidores, String playlist, String descricao, int numOuvintes, String genero, String musicasPopulares) {
        super(nome, email, senha, foto, numeroSeguidores, playlist);
        this.descricao = descricao;
        this.numOuvintes = numOuvintes;
        this.genero = genero;
        this.musicasPopulares = musicasPopulares;
    }

    public void addMusica() {

    }

    public void delMusica() {

    }

    public void addAlbum() {

    }

    public void addTurne() {

    }

    public void addMerchandise() {

    }

    public String cadastroRetorno() {
        return "Cadastro de Artista concluído com sucesso!";
    }
}
