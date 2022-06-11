import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

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
    
    public HashMap<String, List<Cliente>> mapearContas(){
        HashMap<String, List<Cliente>> formaClientes = new HashMap<String, List<Cliente>>();        
        formaClientes.put("Baixo Peso", clientes.stream().filter(c->c.forma().equals("Baixo Peso")).collect(Collectors.toList()));
        formaClientes.put("Normal", clientes.stream().filter(c->c.forma().equals("Normal")).collect(Collectors.toList()));
        formaClientes.put("Excesso de Peso", clientes.stream().filter(c->c.forma().equals("Excesso de Peso")).collect(Collectors.toList()));
        formaClientes.put("Obesidade", clientes.stream().filter(c->c.forma().equals("Obesidade")).collect(Collectors.toList()));
        formaClientes.put("Obesidade Extrema", clientes.stream().filter(c->c.forma().equals("Obesidade Extrema")).collect(Collectors.toList()));
        return formaClientes;
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
    
    public HashMap mediaDesvioPesoClientes(){
        HashMap<String, ArrayList<Double>> metricasClientes = new HashMap<String, ArrayList<Double>>();
        
        for(Cliente cli:clientes){
            metricasClientes.put(cli.getNome(), new ArrayList<>());
            metricasClientes.get(cli.getNome()).add(cli.desvioPadraoPeso()); 
            metricasClientes.get(cli.getNome()).add(cli.mediaPeso()); 

        }

        return metricasClientes;
    }
    
    public HashMap maioresAlturasPorGenero(){
        HashMap<String, ArrayList<Cliente>> generoAlturas = new HashMap<String, ArrayList<Cliente>>();
        
        double maiorAltura = 0;
        
        for(Cliente cli:clientes){
            if(cli.metricaAtual().getAltura()>=maiorAltura){
                if(generoAlturas.get(cli.getGenero())!=null){
                    generoAlturas.get(cli.getGenero()).add(cli); 
                }else{
                    generoAlturas.put(cli.getGenero(), new ArrayList<>()); 
                    generoAlturas.get(cli.getGenero()).add(cli);    
                }
            }
        }

        return generoAlturas;
    }
    
    public HashMap clientesPorGenero(){
        HashMap<String, Integer> clientesGenero = new HashMap<String, Integer>();
        
        for(Cliente cli:clientes){
            if(clientesGenero.get(cli.getGenero())!=null){
                clientesGenero.put(cli.getGenero(), clientesGenero.get(cli.getGenero())+1); 
            }else{
                clientesGenero.put(cli.getGenero(), 1); 
            }

        }

        return clientesGenero;
    }
    
}
