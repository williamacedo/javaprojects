package com.funcionario.emprego;

public class main {
	public main (String [] args)
	{
		
		
		Categoria categoria = new Categoria();
		Salario salario = new Salario();
		Piso piso = new Piso();
		FolhaPagamento folha = new FolhaPagamento();
		Pessoa pessoa = new Pessoa();
		
		categoria.setSigla("A1");	
		
		salario.setPosicao("1");
		salario.setValor("1.326,72");
		
		salario.setCategorias(categoria);
		categoria.getSalarios().add(salario);
			

		piso.setSigla("P01");
		
		salario.setPisos(piso);
		piso.getSalarios().add(salario);
		
		folha.setSalarios(salario);
		salario.getFolhas().add(folha);
		

		
		pessoa.setCpf("000.000.000-00");
		pessoa.setNome("Fulano");
		
		System.out.println("Cpf: "+ pessoa.getCpf());
		System.out.println("Nome: "+ pessoa.getNome());
		System.out.println("Categoria: "+ categoria.getSigla());
		System.out.println("Posicao: "+ salario.getPosicao());
		System.out.println("Valor: "+ salario.getValor());
		System.out.println("Piso: "+ piso.getSigla());
	}
	
	
}
