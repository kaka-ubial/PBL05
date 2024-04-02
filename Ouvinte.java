public class Ouvinte extends Usuario {
    private Long telefone;
    private String tipoassinatura;

    public Ouvinte(String nome, String email, String senha, String foto, int numeroSeguidores, String playlist, Long telefone, String tipoassinatura) {
        super(nome, email, senha, foto, numeroSeguidores, playlist);
        this.telefone = telefone;
        this.tipoassinatura = tipoassinatura;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getTipoassinatura() {
        return tipoassinatura;
    }

    public void setTipoassinatura(String tipoassinatura) {
        this.tipoassinatura = tipoassinatura;
    }

    public void favoritarmusica(){

    }
    public void criarplaylist(){

    }
    public void editarperfil(){

    }
    public void compartilharmusica(){

    }
    public void controlarvolume(){

    }
}