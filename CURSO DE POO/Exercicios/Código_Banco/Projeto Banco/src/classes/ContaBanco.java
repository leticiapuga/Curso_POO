package classes;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (getTipo() == "CC") {
            this.setSaldo(50);
        } else if (getTipo() == "CP") {
            this.setSaldo(150);
        } else {
            System.out.println("Erro ao abrir a conta!");
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Erro! A sua conta ainda possui dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Erro!  A sua conta está em débito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor); // PEGUE O SALDO, MODIFIQUE O SALDO SOMANDO-O COM O VALOR DO
            System.out.println("Depósito realizado na conta de " + this.getDono()); // DEPÓSITO E ATUALIZE O SALDO.
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(int valor) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor); // PEGUE O SALDO, MODIFIQUE O SALDO SUBTRAINDO-O COM O VALOR DO
                                                        // SAQUE E
                System.out.println("Saque realizado na conta de " + this.getDono()); // ATUALIZE O SALDO.
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensalidade() {
        int mensalidade = 0;
        if (this.getTipo() == "CC") {
            mensalidade = 12;
        } else if (this.getTipo() == "CP") {
            mensalidade = 20;
        }
        if (getStatus() == true) {
            if (this.getSaldo() > mensalidade) {
                this.setSaldo(this.getNumConta() - mensalidade);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }

    public float getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

}
