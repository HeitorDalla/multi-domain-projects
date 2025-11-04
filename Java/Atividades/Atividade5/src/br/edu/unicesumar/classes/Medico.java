public class Medico {
    public String nome_medico;
    public double licenca_medico;

    public void cadastrar_medico (String nome_medico, double licenca_medico) {
        this.nome_medico = nome_medico;
        this.licenca_medico = licenca_medico;
        
        System.out.println("Médico cadastrado: " + nome_medico + " - Licença do Médico: " + licenca_medico);
    }
}