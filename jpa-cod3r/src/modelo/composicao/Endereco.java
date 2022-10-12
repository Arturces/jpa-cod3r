package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable//composição colocada automaticamente dentro da tabela de Fornecedor e Funcionario
public class Endereco {

    private String loradouro;
    private String complemento;

    public String getLoradouro() {
        return loradouro;
    }

    public void setLoradouro(String loradouro) {
        this.loradouro = loradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
