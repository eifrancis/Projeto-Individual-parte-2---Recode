package crud;

import java.util.Scanner;

import Dao.PermissaoDAO;
import Modelo.Permissao;

public class PermissaoCRUD {

	public static void main(String[] args) {
		
		PermissaoDAO permissaoDAO = new PermissaoDAO();
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		int id = 0;
		String tipo = "";
		
		do {
			System.out.println("--- CRUD PERMISSAO ---");
			System.out.println("1 - Cadastro Permissao");
			System.out.println("2 - Consulta Permissao");
			System.out.println("3 - Delete Permissao");
			System.out.println("4 - Atualizar Permissao");
			System.out.println("5 - Buscar Permissao");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				//CREATE
				System.out.println("***CADASTRAR PERMISSAO***");
				System.out.println("Digite o tipo: ");
				input.nextLine();
				tipo = input.nextLine();
				
				Permissao permissao = new Permissao();
				permissao.setTipo_permissao(tipo);
				permissaoDAO.save(permissao);
				
				System.out.println("\n***CADASTRADO***\n");
				break;
				
			case 2:
				//READ
				System.out.println("***CONSULTA PERMISSAO***");
				for (Permissao p : permissaoDAO.getPermissao()) {
					System.out.println("Id: " + p.getId_permissao() + "Tipo: " + p.getTipo_permissao()); 
					}
					System.out.println("***ENCERRADA***");
					break;					
					
			case 3: 
				//DELETE
				System.out.println("PASSE O ID DA PERMISSAO: ");
				posicao = input.nextInt();
				
				permissaoDAO.deleteById(posicao);
				break;
				
			case 4:
				//UPDATE
				System.out.println("DIGITE O ID DA PERMISSAO: ");
				id = input.nextInt();
				System.out.println("DIGITE O NOVO TIPO DA PERMISSAO: ");
				tipo = input.nextLine();
				
				Permissao permissao1 = new Permissao(id,tipo);
				permissaoDAO.update(permissao1);
				break;
				
			case 5:
				//BUSCA POR ID
				System.out.println("PASSE O ID DA PERMISSAO: ");
				posicao = input.nextInt();
				input.nextLine();
			
				Permissao permissao2 = permissaoDAO.getPermissaoById(posicao);
				System.out.println("Tipo da Permissao: " + permissao2.getId_permissao()); 				
				break;
			default:
				System.out.println(opcao != 0 ? "\n Opção é inválida, " + "tente novamente.\n" : "");
				break;
			}
		} while (opcao != 0);
		input.close();
		System.out.println("*Finalizado*");
				
		}
			
	
 }
		 

