public class Gerente extends Funcionario{
    private double salarioBase;
    private double bonus = 1000;

    public Gerente(double salarioBase, double bonus){
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioFinal(){
        return salarioBase + bonus;
    }
}
