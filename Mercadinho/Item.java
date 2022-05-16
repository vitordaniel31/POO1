public class Item
{
    private int quantidade;
    private Produto produto;
    private double preco;

    public Item(Produto p)
    {
        produto = p;
    }
    
    public double total(){
        return quantidade * preco;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public Produto getProduto(){
        return this.produto;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
}
