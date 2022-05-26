import java.util.ArrayList;
import java.lang.Math;

public class Cliente
{
    private String nome;
    private String cpf;
    private String genero;
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
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
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
    
    public double desvioPadraoPeso()
    {
        int cont = 0;
        double desvioPadrao = 0;
        for(Metrica m:metricas){
            desvioPadrao += Math.pow(m.getPeso()-mediaPeso(), 2);
            cont++;
        }
        return Math.sqrt(desvioPadrao / (cont - 1));
    }
    
    public double mediaPeso()
    {
        int cont = 0;
        double soma = 0;
        for(Metrica m:metricas){
            soma+=m.getPeso();
            cont++;
        }
        return soma/cont;
    }
}

