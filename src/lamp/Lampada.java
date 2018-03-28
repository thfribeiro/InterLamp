package lamp;


public class Lampada {
    private boolean aceso;
    private int intensidade;
    private String cor;
    final int MAXINTE = 100;

    
    
    public Lampada(){
        this.aceso = false;
        this.intensidade = 0;
        this.cor = "";
    }
    
    
    
    public void ligar(){
        this.setAceso(true);
    }
    
    public void desligar(){
        this.setAceso(false);
        this.setIntensidade(0);
    }
    
    public void setAceso(boolean aceso){
        this.aceso = aceso;
    }
   
    
    public boolean isAceso(){
        return aceso;
    }
    
    public String isCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
        
    public void setIntensidade(int intensidade){
        this.intensidade = intensidade;
    }
    
    public int getIntensidade(){
        return intensidade;
    }

        public void aumentarIntensidade(){
        if (!isAceso()){
            return;
        }
        if (getIntensidade()< this.MAXINTE){
            this.setIntensidade(this.getIntensidade()+ 10);
        }       
    }
    
    public void aumentarIntensidade(int novaIntensidade){
        if (!isAceso()){
            return;
        }
        if (novaIntensidade <= this.MAXINTE){
            this.setIntensidade(novaIntensidade);
        }
        else {
            this.setIntensidade(this.MAXINTE);
        }
    }

    public void diminuirIntensidade(){
        if (getIntensidade() > 0)
            this.setIntensidade(this.getIntensidade()- 10);
    }
    
    public void diminuirIntesidade(int novaIntensidade){
        if (novaIntensidade >= 0){
            this.setIntensidade(novaIntensidade);
        }
        else {
            this.setIntensidade(0);
        }
    }


}
