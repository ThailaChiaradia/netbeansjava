package atividade01;
public class Empregado {
    
    private String nome;
    private float salario;
    private float imposto;


    public Empregado()
    {
      this.nome = nome;
      this.salario = salario;
      this.imposto = imposto;      
      this.calcularImposto();
    }

    
    public void calcularImposto()
    {
        this.imposto = salario/100 * 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    
    public void apresentar()
    {
        System.out.println("\n==================================");
        System.out.println("\nFuncionário: " + getNome());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Imposto de renda: R$" + getImposto());
        System.out.println("\n==================================");
    }
}
