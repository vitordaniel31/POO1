public class Cidade
{
    private String nome;
    private Escola[] escolas;

    public Cidade()
    {
        escolas = new Escola[1000];
    }
    
    public double media(){
        double soma = 0;
        for(Escola e:escolas){
            soma+=e.media();
        }
        
        return soma/escolas.length;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Escola[] getEscolas(){
        return this.escolas;
    }
    
    public void setEscolas(Escola[] escolas){
        this.escolas = escolas;
    }
}
