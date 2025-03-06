package aulaclassobj;
/**
 * @author diego
 */
public class Principal {

    public static void main(String[] args) {
        Professor jean = new Professor();
        Professor aline = new Professor();
        
        jean.setNome("Jean Lucas");
        jean.setDepartamento("Programacao Competitiva");
        
        aline.setNome("Aline Gabrielly");
        aline.setDepartamento("Matematica");
        
        System.out.println("Professores: \n" +
                jean.getNome() + "\n" +
                aline.getNome()
        );
    }
    
}
