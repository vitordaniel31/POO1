import java.util.Random;
import java.util.ArrayList; // import the ArrayList class

public class MercadinhoTeste
{
    Random random = new Random();
    //Produto[] produtos = criarProdutos(100);
    ArrayList<Produto> produtos = criarProdutos(100);
    
    public Rede montarTudo()
    {
        Rede r = criarRede();
        r.setMercados(criarMercados(5));
        return r;
    }
    
    public Produto produtoRentavel(){
        int maior = 0;
        for(int i=0; i<produtos.size(); i++){
            if(produtos.get(i).getRentabilidade()>produtos.get(maior).getRentabilidade())
                maior = i;
        }
        return produtos.get(maior);
    }

    public ArrayList<Venda> criarVendas(int num)
    {
        //Venda[] vendas = new Venda[num];
        ArrayList<Venda> vendas = new ArrayList<>();
        for (int i=0; i<num; i++){
            Venda v = new Venda();
            v.setData("10/0"+ (random.nextInt(9)+1) + "/2022");
            v.setItens(criarItens(3));
            vendas.add(v);
        }
        return vendas;
    }
    
    public ArrayList<Produto> criarProdutos(int num)
    {
        //Produto[] ps = new Produto[num];
        ArrayList<Produto> ps = new ArrayList<Produto>();
        for (int i=0; i<num; i++){
            Produto p = new Produto();
            p.setDescricao("Produto "+(i+1));
            p.setPreco((i+1) * 0.5);
            ps.add(p);
        }
        return ps;
    }
    
    public ArrayList<Item> criarItens(int num)
    {
        //Item[] its = new Item[num];
        ArrayList<Item> its = new ArrayList<>();
        for (int i=0; i<num; i++){
            Produto p = produtos.get(random.nextInt(produtos.size()));
            Item item = new Item(p);
            item.setQuantidade(1);
            item.setPreco(p.getPreco());
            its.add(item);
            p.setRentabilidade(p.getRentabilidade() + item.total()); 
            p.setVendidos(p.getVendidos()+item.getQuantidade());
        }
        return its;
    }
    
    public ArrayList<Mercadinho> criarMercados(int num)
    {
        //Mercadinho[] ms = new Mercadinho[num];
        ArrayList<Mercadinho> ms = new ArrayList<>();
        for (int i=0; i<num; i++){
            Mercadinho m = new Mercadinho();
            m.setNome("Mercadinho "+(i+1));
            m.setVendas(criarVendas(5));
            ms.add(m);
        }
        return ms;
    }
    
    public Rede criarRede()
    {
        Rede r = new Rede();
        r.setNome("Rede de Mercadinhos");
        return r;
    }
}
