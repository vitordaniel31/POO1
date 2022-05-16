
/**
 * @author Ketlly Azevedo de Medeiros 
 * @version 07/04/2022
 */
public class Academia extends Cliente
{
    String nome;
    Cliente clientes[]=new
            Cliente[1000];
    
    

    /**
     * Construtor para objetos da classe Academia
     */
    public Academia()
    {
        // inicializa variáveis de instância
        
    }

     
    public double imcAcademia()
    {
        double media=0.0;
        int parcelas=0, i=0;
        while(i < clientes.length){ //cliente[i++]
            if(clientes[i].imcAtual()!=-1){
                media+=clientes[i].imcAtual();
                parcelas++;
            }
            i++;
        }
        return parcelas==0?0: media/parcelas;
    }
}
