package view;

import Project.Project;

public class Execução {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project project = new Project ();
		project.setNome("Nome: Gabriel Cavalcante Delfino");
		
		System.out.println(project.getNome());
		
		project.setEndereco("\nEndereço: Rua José Henrique Tomaz de Lima");
		
		System.out.println(project.getEndereco());
		
		project.setBairro("\nBairro: Vila Verde");
		
		System.out.println(project.getBairro());
		
		project.setCidade("\nCidade: São Paulo");
		
		System.out.println(project.getCidade());

		project.setEstado("\nEstado: São Paulo\n\nCep:");
		
		System.out.println(project.getEstado());
		
		project.setCep(8270890);
		
		System.out.println(project.getCep());



	}

}
