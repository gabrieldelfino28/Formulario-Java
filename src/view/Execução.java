package view;

import Project.Project;

public class Execu��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project project = new Project ();
		project.setNome("Nome: Gabriel Cavalcante Delfino");
		
		System.out.println(project.getNome());
		
		project.setEndereco("\nEndere�o: Rua Jos� Henrique Tomaz de Lima");
		
		System.out.println(project.getEndereco());
		
		project.setBairro("\nBairro: Vila Verde");
		
		System.out.println(project.getBairro());
		
		project.setCidade("\nCidade: S�o Paulo");
		
		System.out.println(project.getCidade());

		project.setEstado("\nEstado: S�o Paulo\n\nCep:");
		
		System.out.println(project.getEstado());
		
		project.setCep(8270890);
		
		System.out.println(project.getCep());



	}

}
