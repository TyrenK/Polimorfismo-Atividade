public class Empresa {
    public static void main(String[] args){
        Funcionario v = new Vendedor(2000, 500);
        Funcionario f = new Freelancer(20, 150);
        Funcionario g = new Gerente(5000, 1000);

        System.out.println("Salário do Vendedor: " + obterSalarioDoFuncionario(v));
        System.out.println("Salário do Freelancer: " + obterSalarioDoFuncionario(f));
        System.out.println("Salário do Gerente: " + obterSalarioDoFuncionario(g));
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario){
        return funcionario.calcularSalarioFinal();
    }
}
