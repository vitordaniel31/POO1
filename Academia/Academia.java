import java.util.ArrayList;

public class Academia extends Cliente
{
    private String nome;
    private ArrayList<Cliente> clientes;

    /**
     * Construtor para objetos da classe Academia
     */
    public Academia()
    {
        clientes = new ArrayList<>();
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
    
    public void setClientes(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }

     
    public double imcAcademia()
    {
        double media=0.0;
        int parcelas=0, i=0;
        while(i < clientes.size()){ //cliente[i++]
            if(clientes.get(i).imcAtual()!=-1){
                media+=clientes.get(i).imcAtual();
                parcelas++;
            }
            i++;
        }
        return parcelas==0?0: media/parcelas;
    }
}
