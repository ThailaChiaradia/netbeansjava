package aula011;
public class Bolsista extends Aluno{
    
    private float bolsa;
    
    public void renovarBolsa()
    {
        System.out.println("\nRenovando bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade()
    {
       System.out.println("\n\n" + this.getNome() + " é bolsista! Pagamento Facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
