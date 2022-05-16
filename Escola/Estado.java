public class Estado
{
    private String nome;
    private Cidade[] cidades;

    public Estado()
    {
        cidades = new Cidade[1000];
    }
    
    public double media(){
        double soma = 0;
        for(Cidade c:cidades){
            soma+=c.media();
        }
        
        return soma/cidades.length;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Cidade[] getCidades(){
        return this.cidades;
    }
    
    public void setCidades(Cidade[] cidades){
        this.cidades = cidades;
    }
}
