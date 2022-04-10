//Defina a classe Empregado, contendo os atributos nome e salário. Crie os métodos construtor, seletor e modificador (para cada atributo). 
//Desenvolva as operações para:
//a. Calcular e retornar o valor de imposto de renda a ser pago, sabendo que o imposto equivale a 5% do salário;
//b. Faça um programa que crie um objeto da classe Empregado (leia o nome e o salário) e informe o nome do funcionário
//juntamente com o imposto de renda a ser pago

package atividade01;
public class Atividade01 {
    public static void main(String[] args) {
        
        Empregado e = new Empregado();
        
        e.setNome("Thaila");
        e.setSalario(1500.50f);
        e.calcularImposto();
        e.apresentar();
    }
}
