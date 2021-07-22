package utp.edu.co.misiontic2022.c4;

public class Planta extends SerVivo {

    //Se sobreescribe el metodo alimentarse
    @Override//sobreescribe el metodo abstracto del padre
    public void alimentarse(){

        System.out.println("La planta se alimenta atraves de la fotosintesis");


    }
    
}
