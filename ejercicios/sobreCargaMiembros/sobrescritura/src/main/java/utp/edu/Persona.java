package utp.edu;

public class Persona extends Animal {

    @Override // Estamos sobrescribiendo el metodo comer
    public void comer() {

        System.out.println("Estoy comiendo sentado y con cubiertos");
    }

}
