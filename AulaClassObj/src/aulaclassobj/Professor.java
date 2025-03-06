package aulaclassobj;
/**
 * @author diego
 */
//variaveis privadas so podem ser acessadas dentro da classe
public class Professor {
    private String nome;
    private String departamento;
    
    public void mostrarInfo() {
        System.out.println("Nome do Professor(a): " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("------------------------------------------");
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getNome() {
        return "Ms." + this.nome;
    }
    
    public String getDepartamento() {
        return this.departamento;
    }
}
