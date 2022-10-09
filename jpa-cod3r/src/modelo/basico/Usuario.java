package modelo.basico;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//GERAÇÃO  DE CHAVE AUTOMATICA DO VALOR IDENTIDADE CADA UM TEM SUA PROPROA SEQUENCIA DE ID SEM COMPARTILHAR, NAO CRIA A TABELA HIBERNAT
    private Long id;

    //@Transient//annotation trasiente para nao mapear o atributo para o banco de dados, nao tem correpondecia para o banco de dados
    //@Column(nome = "...", nullable = false)//alteração da coluna para agir oq vc quiser
    private String nome;

    private String email;

    public Usuario(){

    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
