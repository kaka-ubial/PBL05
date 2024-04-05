import java.security.cert.PolicyQualifierInfo;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String opcao;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Playlist> playlists = new ArrayList<>();
        ArrayList<Musica> musicas = new ArrayList<>();
        boolean usuarioCadastrado = false; 
        
        Musica musica1 = new Musica("Carry on Wayward Son", "Kansas", 4.15f, "20-10-1998", "K");
        musicas.add(musica1);
        Musica musica2 = new Musica("Bohemian Rhapsody", "Queen", 5.55f, "31-10-1975", "A Night at the Opera");
        musicas.add(musica2);
        Musica musica3 = new Musica("Stairway to Heaven", "Led Zeppelin", 8.02f, "8-11-1971", "Led Zeppelin IV");
        musicas.add(musica3);

        do {
            System.out.println("O que você deseja fazer?\n1 - Realizar Cadastro\n2 - Criar Playlist\n3 - Adicionar música a playlist\n4 - Sair");
            opcao = scanner.nextLine();
    
            switch (opcao) {
                case "1":
                    if (usuarioCadastrado) {
                        System.out.println("Você já está cadastrado como usuário.");
                        break;
                    } 
                    Usuario novoUsuario = Usuario.cadastrar();
                    usuarios.add(novoUsuario);   
                    System.out.println("Usuário cadastrado com sucesso!");
                    usuarioCadastrado = true; 
                    break;
                case "2":
                if (usuarios.isEmpty()) {
                    System.out.println("Você precisa estar cadastrado para adicionar músicas à playlist.");
                    break;
                } else {
                    Playlist novaPlaylist = Playlist.criarPlaylist();
                    playlists.add(novaPlaylist);
                    System.out.println("Playlist cadastrada com sucesso!");
                    break;
                }
                case "3":
                    if (usuarios.isEmpty()) {
                        System.out.println("Você precisa estar cadastrado para adicionar músicas à playlist.");
                    } else {
                        if (playlists.isEmpty()) {
                            System.out.println("Nenhuma playlist foi criada ainda.");
                        } else {
                            System.out.println("Escolha a playlist:");
                            for (int i = 0; i < playlists.size(); i++) {
                                System.out.println((i + 1) + ". " + playlists.get(i).getNome());
                            }
                            int playlistSelecionada = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Playlist: " + playlists.get(playlistSelecionada - 1).getNome());
                
                            System.out.println("Escolha a música:");
                            for (int i = 0; i < musicas.size(); i++) {
                                System.out.println((i + 1) + ". " + musicas.get(i).getNome());
                            }
                            int musicaSelecionada = scanner.nextInt();
                            scanner.nextLine(); 
                
                            playlists.get(playlistSelecionada - 1).addMusica(musicas.get(musicaSelecionada - 1));
                
                            System.out.println("Músicas na playlist:");
                            Playlist playlistSelecionadaObjeto = playlists.get(playlistSelecionada - 1);
                            ArrayList<Musica> musicasDaPlaylist = playlistSelecionadaObjeto.getMusicas();
                            for (Musica musica : musicasDaPlaylist) {
                                System.out.println("Nome: " + musica.getNome());
                                System.out.println("Artista: " + musica.getArtista());
                                System.out.println("Duração: " + musica.getTempo());
                                System.out.println("Data de lançamento: " + musica.getDataDeLancamento());
                                System.out.println("Álbum: " + musica.getAlbum());
                                System.out.println("-------------------------------");
                            }
                            System.out.println("Música adicionada à playlist com sucesso!");
                            System.out.println();
                        }
                    }
                    break;
                
                case "4":
                    opcao = "4";
                    break;
                default: 
                    System.out.println("Digite uma opção válida");
                    System.out.println();
                    break;
            }
         } while (opcao != "4");
}

}

