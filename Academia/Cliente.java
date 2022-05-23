import java.util.ArrayList;

public class Cliente
{
    private String nome;
    private String cpf;
    private ArrayList<Metrica> metricas;
    private Metrica meta;

    /**
     * Construtor para objetos da classe Cliente
     */
    public Cliente()
    {
        metricas = new ArrayList<>();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public ArrayList<Metrica> getMetricas(){
        return this.metricas;
    }
    
    public void setMetricas(ArrayList<Metrica> metricas){
        this.metricas = metricas;
    }
    
    public Metrica getMeta(){
        return this.meta;
    }
    
    public void setMeta(Metrica meta){
        this.meta = meta;
    }
    
    public double imcAtual()
    {
        return metricas.get(metricas.size()-1).imc();
    }
    
    public Metrica metricaAtual()
    {
        return metricas.get(metricas.size()-1);
    }
}

