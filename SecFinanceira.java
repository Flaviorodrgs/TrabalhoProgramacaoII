package trabalho01;

public class SecFinanceira extends Funcionario implements PessoaFisica, Secretaria {
   double d = 0.10;
   double v;
   double vfinal;
    // Construtor //
    public SecFinanceira(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Secretaria Financeira");
    }
    // Getters and Setters //
    
    // Métodos //
    public void atualizarBoleto(int b) {
        v = b * d;
        vfinal = b + v;
        System.out.println("Valor boleto atualizado: " + vfinal);
    }

    @Override
    public String getCPF() {
        return cpf;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void infoSecretaria() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Funcao: " + this.getFuncao());
        System.out.println("Contas: " + this.getConta());
        System.out.println("Tipo: Pessoa Fisica");
    }

}
