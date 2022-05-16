public class SerieDeLucas
{
    final int p,q;
    int n;
    
    public SerieDeLucas(int p, int q)
    {
        this.p = p;
        this.q = q;
        this.n = -1;
    }
    
    public int proximo(){
        n++;
        return lucas(n);
    }
    
    public int pular(int qtd_pulos){
        n += qtd_pulos;
        return lucas(n);
    }
    
    private int lucas(int n){
        if(n<2) return n;
        return p*lucas(n-1) - q*lucas(n-2);
    }
}
