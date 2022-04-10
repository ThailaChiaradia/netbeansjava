package aula011;
public class Aula011 {
    public static void main(String[] args) {
        
       //Visitante v1 = new Visitante();
       // v1.setNome("Ricardo");
       // v1.setIdade(1);
       // v1.setSexo("M");
       // System.out.println(v1.toString());
       
       Aluno a1 = new Aluno();
       
       a1.setNome("Thaila");
       a1.setIdade(17);
       a1.setSexo("F");
       a1.setMatricula(02150120);
       a1.setCurso("Desenvolvimento de Sistemas");
       a1.pagarMensalidade();
       
       System.out.println(a1.toString());
       
       Bolsista b1 = new Bolsista();       
       b1.setNome("Larissa");
       b1.setSexo("M");
       b1.setIdade(18);
       b1.setMatricula(02150131);
       b1.setBolsa(15.4f);
       b1.pagarMensalidade();
       System.out.println(b1.toString());
       
       Tecnico t1 = new Tecnico();
       
       t1.setNome("Pedro");
       t1.setIdade(21);
       t1.setSexo("M");
       t1.setRegistroProfissional("bom pra caralho");
       t1.praticar();
       t1.pagarMensalidade();
       System.out.print(t1.toString());
    }    
}
