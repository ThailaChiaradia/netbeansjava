package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        //PROGRAMA PRINCIPAL
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Funcionario p5 = new Funcionario();
        
        p1.setNome("Mariana");
        p2.setNome("Rafaela");
        p3.setNome("Amanda");
        p4.setNome("Thaila");
        p5.setNome("Ezequiel");
        
        p2.setCurso("Eventos");
        p3.setSalario(1500.50f);
        p4.setSetor("Informática");
        p5.setSetor("Mecânica");
        
        p1.setSexo("F");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("F");
        p5.setSexo("M");
        
        p1.setIdade(18);
        p2.setIdade(16);
        p3.setIdade(17);
        p4.setIdade(17);
        p5.setIdade(18);
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        
        
        
        
                
        
    }
}
