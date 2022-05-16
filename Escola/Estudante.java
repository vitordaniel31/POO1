public class Estudante
{
    private String cpf;
    private int nivelLeitura;

    public Estudante()
    {

    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public int getNivelLeitura(){
        return this.nivelLeitura;
    }
    
    public void setNivelLeitura(int nivelLeitura){
        this.nivelLeitura = nivelLeitura;
    }
}
