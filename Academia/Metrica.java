public class Metrica
{
    private double peso;
    private double altura;
    private double cintura;
    private double biceps;
    private double triceps;
    private double peito;
    private String data; //usar formato ano/mês/dia.

    public Metrica()
    {
        //
    }
    
    public boolean update(double peso, double altura, double cintura, double biceps, double triceps, double peito){
        this.peso = peso;
        this.altura = altura;
        this.cintura = cintura;
        this.biceps = biceps;
        this.triceps = triceps;
        this.peito = peito;
        return true;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getCintura(){
        return this.cintura;
    }
    
    public void setCintura(double cintura){
        this.cintura = cintura;
    }
    
    public double getPeito(){
        return this.peito;
    }
    
    public void setPeito(double peito){
        this.peito = peito;
    }
    
    public double getBiceps(){
        return this.biceps;
    }
    
    public void setBiceps(double biceps){
        this.biceps = biceps;
    }
    
    public double getTriceps(){
        return this.triceps;
    }
    
    public void setTriceps(double triceps){
        this.triceps = triceps;
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setData(String data){
        this.data = data;
    }

    public double imc()
    {
        return peso/(altura*altura);
    }
}
