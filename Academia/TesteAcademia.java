import java.util.Random;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TesteAcademia
{
    Random rand = new Random();
    
    public Academia montarTudo()
    {
        Academia a = criarAcademia();
        ArrayList<Cliente> clientes = criarClientes(4);
        a.setClientes(clientes);
        a.setClientesTree(criarClientesTree(clientes));
        for (Cliente c: a.getClientes()){
            ArrayList<Metrica> metricas = criarMetricas(5);
            c.setMetricas(metricas);
            c.setMetricasTree(criarMetricasTree(metricas));
            c.setMeta(criarMetricas(1).get(0));
        }
        return a;
    }

    public ArrayList<Metrica> criarMetricas(int num)
    {
        ArrayList<Metrica> ms = new ArrayList<>();
        
        for (int i=0; i<num; i++){
            Metrica metrica = new Metrica();
            metrica.setPeso(50 + rand.nextInt(80)); 
            metrica.setAltura(0.3 + 1.8*rand.nextDouble()); 
            metrica.setCintura(30 + rand.nextInt(50)); 
            metrica.setBiceps(30 + rand.nextInt(50)); 
            metrica.setTriceps(30 + rand.nextInt(50)); 
            metrica.setPeito(30 + rand.nextInt(50)); 
            metrica.setData(DateTimeFormatter.ofPattern("yyyy/MM/").format(LocalDateTime.now())+(rand.nextInt(28)+1)); 
            ms.add(metrica);
        }
        return ms;
    }
    
    public TreeMap<String, Metrica> criarMetricasTree(ArrayList<Metrica> metricas)
    {
        TreeMap<String, Metrica> ms = new TreeMap<>();
        
        for (Metrica metrica:metricas){
            ms.put(metrica.getData(), metrica); 
        }
        return ms;
    }
    
    public ArrayList<Cliente> criarClientes(int num)
    {
        ArrayList<Cliente> cs = new ArrayList<>();
        for (int i=0; i<num; i++){
            Cliente cliente = new Cliente();
            cliente.setNome("Cliente "+(i+1)); 
            cliente.setCpf("00000000"+(i+1));
            cliente.setDataNascimento(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now()));
            int sexo = rand.nextInt(2);
            cliente.setGenero(sexo==1 ? "Masculino" : "Feminino");
            cs.add(cliente);
        }
        return cs;
    }
    
    public TreeMap<String, Cliente> criarClientesTree(ArrayList<Cliente> clientes)
    {
        TreeMap<String, Cliente> cs = new TreeMap<>();
        for (Cliente cliente:clientes){
            cs.put(cliente.getCpf(), cliente);
        }
        return cs;
    }
    
    public Academia criarAcademia()
    {
        Academia a1 = new Academia();
        a1.setNome("Academia UFRN");
        return a1;
    }
}
