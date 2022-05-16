public class Produto
{
    private double preco;
    private String descricao;
    private int vendidos;
    private double rentabilidade;

    public Produto()
    {
        vendidos = 0;
        rentabilidade = 0;
        
    }    
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getVendidos(){
        return this.vendidos;
    }
    
    public void setVendidos(int vendidos){
        this.vendidos = vendidos;
    }
    
    public double getRentabilidade(){
        return this.rentabilidade;
    }
 
    public void setRentabilidade(double rentabilidade){
        this.rentabilidade = rentabilidade;
    }
    


}
