public class Usuario {

    protected String nome;
    protected String email;
    protected String senha;
    protected String foto;
    protected int numeroSeguidores;

    protected String playlist;

    public Usuario(String nome, String email, String senha, String foto, int numeroSeguidores, String playlist) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.foto = foto;
        this.numeroSeguidores = numeroSeguidores;
        this.playlist = playlist;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        this.numeroSeguidores = numeroSeguidores;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }
}
