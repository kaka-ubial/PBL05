import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {

    static List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {

        menu();
        System.out.println(usuarios);

    }

    public static void menu() {



        boolean sair = false;
        while (!sair) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("**************************");
            System.out.println("SPOTIFY");
            System.out.println("**************************");
            System.out.println("** 1 - Cadastro de usuário");
            System.out.println("** 2 - Criar playlist");
            System.out.println("** 3 - Adicionar música a Playlist");
            System.out.println("** 4 - Digite 'sair' para sair");


            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    cadastrarUsuario();
                    break;
                case "2":
                    cadastrarPlaylist();
                    break;
                case "sair":
                    System.out.println("Saindo do programa");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        }
    }

    public static void cadastrarUsuario() {


        Scanner usuarioInput = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("Digite seu nome de usuário: ");
        String username = usuarioInput.nextLine();
        System.out.println("Digite seu email: ");
        String email = usuarioInput.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = usuarioInput.nextLine();

        Usuario novoUsuario = new Usuario(username, email, senha, "", 0, "");
        usuarios.add(novoUsuario);

    }

    public static void cadastrarPlaylist() {
        Scanner playlistInput = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("Digite o nome da playlist");
        String nome = playlistInput.nextLine();
        Playlist novaPlaylist = new Playlist(nome, "", 0, 0, 0);
    }

}
