package crud;

import java.util.Scanner;

import Dao.PermissaoDAO;
import Dao.usuarioDAO;
import Modelo.Permissao;
import Modelo.Usuario;

public class usuarioCRUD {

	public static void main(String[] args) {
		usuarioDAO usuarioDAO = new usuarioDAO();
		PermissaoDAO permissaoDAO = new PermissaoDAO();
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		int id = 0;
		String nome = "";
		String email = "";
		String senha = "";
		int id_permissao = 0;
		
		do {
			System.out.println("--- CRUD USUARIO ---");
			System.out.println("1 - Cadastro Usuario");
			System.out.println("2 - Consulta Usuario");
			System.out.println("3 - Atualizar Usuario");
			System.out.println("4 - Delete Usuario");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				//CREATE
				System.out.println("***CADASTRAR USUARIO***");
				System.out.println("Digite o nome: ");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("Digite seu email: ");
				input.nextLine();
				email = input.nextLine();
				System.out.println("Digite a senha: ");
				input.nextLine();
				senha = input.nextLine();
				System.out.println("Digite o id da permissão: ");
				id_permissao = input.nextInt();
				input.nextLine();
				
				Permissao permissao = permissaoDAO.getPermissaoById(id_permissao);
				
				Usuario usuario = new Usuario(id, nome, email, permissao);
				usuarioDAO.save(usuario);				
			
				System.out.println("\n***CADASTRADO***\n");
				break;
				
			case 2:
				//READ
				System.out.println("***CONSULTA USUARIO***");
				for (Usuario u : usuarioDAO.getUsuario()) {
					System.out.println("Id: " + u.getId_usuario() + "Nome: " + u.getNome_usuario() + 
							"Email: " + u.getEmail_usuario()+"Permissão: " + u.getPermissao()); 
					}
					System.out.println("***CONSULTOU***");
					break;					
					
			case 3: 
				//UPDATE
				System.out.println("Digite o Id: ");
				id = input.nextInt();
				input.nextLine();
				System.out.println("Digite o Nome: ");
				nome = input.nextLine();
				System.out.println("Digite o Email: ");
				email = input.nextLine();
				System.out.println("Digite a senha: ");
				senha = input.nextLine();
				System.out.println("Digite o Id da Permissão: ");
				id_permissao = input.nextInt();
				input.nextLine();
				
				Permissao permissao1 = permissaoDAO.getPermissaoById(id_permissao);
				
				Usuario usuario1 = new Usuario(id,nome, email, senha, permissao1);
				usuarioDAO.update(usuario1);
				break;
		
			case 4:
				//DELETE
				System.out.println("Digite o ID do Usuario: ");
				posicao = input.nextInt();
				usuarioDAO.deleteById(posicao);
				
				break;
			default:
				System.out.println(opcao != 0 ? "\n Opção é inválida, tente novamente." : "");
				break;
			}
		} while (opcao != 0);
		input.close();
		System.out.println("*Finalizado*");
		 
	}

}
