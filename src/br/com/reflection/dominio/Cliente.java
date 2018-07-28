
package br.com.reflection.dominio;

import br.com.reflection.anotacoes.Entidade;
import br.com.reflection.anotacoes.Id;

@Entidade(tabela = "clientes")
public class Cliente {
    
    @Id
    private int id;
    private String nome;
    private String cpf;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
