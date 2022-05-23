import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    
    public HashMap maioresAlturasPorGenero(){
        HashMap<String, ArrayList<Cliente>> generoAlturas = new HashMap<String, ArrayList<Cliente>>();
        
        double maiorAltura = 0;
        
        for(Cliente cli:clientes){
            if(cli.metricaAtual().getAltura()>=maiorAltura){
                if(generoAlturas.containsKey(cli.getGenero())){
                    generoAlturas.get(cli.getGenero()).add(cli); 
                }else{
                    generoAlturas.put(cli.getGenero(), new ArrayList<>()); 
                    generoAlturas.get(cli.getGenero()).add(cli);    
                }
            }
        }

        return generoAlturas;
    }
    
}
