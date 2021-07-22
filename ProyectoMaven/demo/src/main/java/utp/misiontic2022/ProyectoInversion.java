package utp.misiontic2022;
{
    
    public int pTiempo=0;
    public double pCapital=0;
    public double pInteres=0;
    public double interesSimple = 0;
    public double interesCompuesto = 0;
    

    public ProyectoInversion (int pTiempo, double pCapital, double pInteres){
        this.pCapital = pCapital;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
    }    
            
    

    public double calcularInteresSimple(){
        
        interesSimple = pCapital * ((pInteres/100) * pTiempo);     
        return Math.round(interesSimple);
    }
    public double calcularInteresCompuesto(){
        
        interesCompuesto = pCapital * (Math.pow((1 + (pInteres/100)),pTiempo)-1);
        return Math.round(interesCompuesto); 
    }
    public double verificarInversion(){
         return Math.round(interesCompuesto - interesSimple);
    }
    public double verificarInversion(int pTiempo, double pCapital, double pInteres){
        
        this.pCapital = pCapital;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;

        calcularInteresCompuesto();
        calcularInteresSimple();

        return Math.round(interesCompuesto - interesSimple);
    }

}