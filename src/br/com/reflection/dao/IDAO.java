package br.com.reflection.dao;

import java.util.List;

public interface IDAO {
    
    public List<Object> consultar(Object objeto);
    public void salvar(Object objeto);
    public void alterar(Object objeto);
    public void excluir(Object object);
    
}
