public class Freelancer extends Funcionario {
    private int diasTrabalhados;
    private double valorDia;

    public Freelancer(int diasTrabalhados, double valorDia){
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    @Override
    public double calcularSalarioFinal(){
        return diasTrabalhados * valorDia;
    }
}
