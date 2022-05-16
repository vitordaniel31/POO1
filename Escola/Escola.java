import java.util.ArrayList;

public class Escola
{
    private String nome;
    private ArrayList<Estudante> estudantes;

    public Escola()
    {
    
    }
    
    public double media(){
        double soma = 0;
        for(Estudante e:estudantes){
            soma+=e.getNivelLeitura();
        }
        
        return soma/estudantes.size();
    }
    
    public ArrayList<Estudante> estudantesAcimaMedia(double media){
        ArrayList<Estudante> estudantesAcimaMedia = new ArrayList<>();
        for(Estudante e:estudantes){
            if(e.getNivelLeitura()>media) estudantesAcimaMedia.add(e);
        }
        return estudantesAcimaMedia;
    }
    
    public ArrayList<Estudante> estudantesAcimaMediaEscola(){
        ArrayList<Estudante> estudantesAcimaMediaEscola = new ArrayList<>();
        for(Estudante e:estudantes){
            if(e.getNivelLeitura()>media()) estudantesAcimaMediaEscola.add(e);
        }
        return estudantesAcimaMediaEscola;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Estudante> getEstudantes(){
        return this.estudantes;
    }
    
    public void setEstudantes(ArrayList<Estudante> estudantes){
        this.estudantes = estudantes;
    }
}
