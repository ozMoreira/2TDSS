package br.com.fiap.revisao.main;

import br.com.fiap.revisao.model.Alimento;
import br.com.fiap.revisao.model.Organico;

public class Teste {

	//Criar o método main: main + CTRL + espaço
	public static void main(String[] args) {
		
		//Instanciar um Alimento
		Alimento churros = new Alimento("Churros doce de leite", false, 300);
		
		//Colocar informações nos atributos do objeto
//		churros.setNome("Churros doce de leite");
//		churros.setSalgado(false);
//		churros.setValorCalorico(300);
		
		//Chamar os métodos e exibir o resultado
		System.out.println("A qtd total de calorias: " + churros.calcularValorCalorico(2, true));
		System.out.println("A qtd total de calorias: " + churros.calcularValorCalorico(2));
		System.out.println("Nome ok? " + churros.validarNome());
		
		System.out.println(churros);
		
		//Instanciar um Organico
		Organico tomate = new Organico("Tomate", false, 50, "Piracicaba");
		
		//Chamar os métodos e exibir o resultado
		System.out.println("A qtd total de calorias: " + tomate.calcularValorCalorico(10));
		System.out.println("Nome ok? " + tomate.validarNome());
		
		System.out.println(tomate);
		
		//Organico laranja = new Alimento("Laranja"); Não compila!
		Alimento alface = new Organico("Alface");
		
		System.out.println("Nome ok? " + alface.validarNome()); //Organico -> false
		
		System.out.println(alface);
		
	}
	
}