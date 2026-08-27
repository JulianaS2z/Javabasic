package heranca;

public class Cliente extends Pessoa {
    private String data_de_compra;
    private Forma_de_pagamento forma_de_pagamento;

    public Cliente(String nome, int idade, String data_de_compra, Forma_de_pagamento forma_de_pagamento) {
        super(nome, idade);
        this.data_de_compra = data_de_compra;
        this.forma_de_pagamento = forma_de_pagamento;
    }

    public String getData_de_compra() {
        return data_de_compra;
    }

    public void setData_de_compra(String data_de_compra) {
        this.data_de_compra = data_de_compra;
    }

    public Forma_de_pagamento getForma_de_pagamento() {
        return forma_de_pagamento;
    }

    public void setForma_de_pagamento(Forma_de_pagamento forma_de_pagamento) {
        this.forma_de_pagamento = forma_de_pagamento;
    }

    @Override
    public String toString() {
        return  "nome= "+ super.getNome()+
                "idade= "+ super.getIdade()+
                "data_de_compra='" + data_de_compra + '\'' +
                ", forma_de_pagamento=" + forma_de_pagamento +
                '}';
    }
}

//Data da compra
//Forma de pagamento