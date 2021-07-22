package utp.edu.co.misiontic2022.c4;

public class Principal {
    public static void main(String[] args) {
        //Ya que ser vivo es abstracta no se puede instanciar objetos de ella
        //SerVivo servivo=new SerVivo();

        Planta planta = new Planta();

        planta.alimentarse();

        AnimalCarniboro animalCarniboro=new AnimalCarniboro();

        animalCarniboro.alimentarse();
    }
    
}
