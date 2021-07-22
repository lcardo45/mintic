public class Nota {

    // atributos
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private double notaFinal;

    // Constructors
    public Nota() {
        nota1 = 3;
        nota2 = 3;
        nota3 = 3;
        nota4 = 3;
    }

    public Nota(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // Metodos
    public double calcularNotaFinal() {

        notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        return notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String ganoOPerdio() {
        if (notaFinal >= 3) {
            return "Gano el año";
        } else {
            return "Perdio el año";
        }
    }
}
