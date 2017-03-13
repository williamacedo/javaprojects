package com.funcionario.emprego;

public class main {
	public main (String [] args)
	{
		
		
		Categoria categoria = new Categoria();
		Categoria categoria1 = new Categoria();
		Categoria categoria2 = new Categoria();
		Categoria categoria3 = new Categoria();
		
		Salario salario = new Salario();
		Salario salario1 = new Salario();
		Salario salario2 = new Salario();
		Salario salario3 = new Salario();
		
		Piso piso = new Piso();
		Piso piso1 = new Piso();
		Piso piso2 = new Piso();
		Piso piso4 = new Piso();
		
		FolhaPagamento folha = new FolhaPagamento();
		FolhaPagamento folha1 = new FolhaPagamento();
		FolhaPagamento folha2 = new FolhaPagamento();
		FolhaPagamento folha3 = new FolhaPagamento();
		
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		categoria.setSigla("A1");
		categoria1.setSigla("A2");
		categoria2.setSigla("A3");
		categoria3.setSigla("A4");
		
		salario.setPosicao("1");
		salario1.setPosicao("2");
		salario2.setPosicao("3");
		salario3.setPosicao("4");
		
		salario.setValor("1.326,72");
		salario1.setValor("1.378,46");
		salario2.setValor("1.432,22");
		salario3.setValor("1.488,08");
		
		salario.setCategorias(categoria);
		categoria.getSalarios().add(salario);
		salario1.setCategorias(categoria1);
		categoria2.getSalarios().add(salario2);
		salario2.setCategorias(categoria2);
		categoria3.getSalarios().add(salario3);
			

		piso.setSigla("P01");
		piso1.setSigla("P02");
		piso2.setSigla("P03");
		piso4.setSigla("P04");
		
		salario.setPisos(piso);
		piso.getSalarios().add(salario);
		salario1.setPisos(piso1);
		piso1.getSalarios().add(salario1);
		salario2.setPisos(piso2);
		piso2.getSalarios().add(salario2);
		salario3.setPisos(piso4);
		piso4.getSalarios().add(salario3);
		
		folha.setSalarios(salario);
		salario.getFolhas().add(folha);
		folha1.setSalarios(salario1);
		salario1.getFolhas().add(folha1);
		folha2.setSalarios(salario2);
		salario2.getFolhas().add(folha2);
		folha3.setSalarios(salario3);
		salario3.getFolhas().add(folha3);
		
		pessoa.setNome("Fulano");
		pessoa1.setNome("Pedro");
		pessoa2.setNome("Maria");
		pessoa3.setNome("Joao");
		
		pessoa.setCpf("000.000.000-00");
		pessoa1.setCpf("111.111.111-11");
		pessoa2.setCpf("222.222.222-22");
		pessoa3.setCpf("333.333.333-33");
		
		System.out.println("Cpf: "+ pessoa.getCpf());
		
		System.out.println("Nome: "+ pessoa.getNome());
		System.out.println("Categoria: "+ categoria.getSigla());
		System.out.println("Posicao: "+ salario.getPosicao());
		System.out.println("Valor: "+ salario.getValor());
		System.out.println("Piso: "+ piso.getSigla());
		
		System.out.println("Cpf: "+ pessoa1.getCpf());
		
		System.out.println("Nome: "+ pessoa1.getNome());
		System.out.println("Categoria: "+ categoria1.getSigla());
		System.out.println("Posicao: "+ salario1.getPosicao());
		System.out.println("Valor: "+ salario1.getValor());
		System.out.println("Piso: "+ piso1.getSigla());
		
		System.out.println("Cpf: "+ pessoa2.getCpf());
		
		System.out.println("Nome: "+ pessoa2.getNome());
		System.out.println("Categoria: "+ categoria2.getSigla());
		System.out.println("Posicao: "+ salario2.getPosicao());
		System.out.println("Valor: "+ salario2.getValor());
		System.out.println("Piso: "+ piso2.getSigla());
		
		System.out.println("Cpf: "+ pessoa3.getCpf());
		
		System.out.println("Nome: "+ pessoa3.getNome());
		System.out.println("Categoria: "+ categoria3.getSigla());
		System.out.println("Posicao: "+ salario3.getPosicao());
		System.out.println("Valor: "+ salario3.getValor());
		System.out.println("Piso: "+ piso4.getSigla());
	}
	
	
}
