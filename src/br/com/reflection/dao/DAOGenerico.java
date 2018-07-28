
package br.com.reflection.dao;

import br.com.reflection.anotacoes.Entidade;
import java.lang.reflect.Field;
import java.util.List;

public class DAOGenerico extends AbstractPGDAO {

    @Override
    public List<Object> consultar(Object objeto) {
        
        return null;
    }

    @Override
    public void salvar(Object objeto) {
    
        this.openConnection();
        
        Entidade entidade = objeto.getClass().getDeclaredAnnotation(Entidade.class);

        StringBuilder sql = new StringBuilder();
        
        
        sql.append("insert into ");
        
        sql.append(entidade.tabela());
        
        sql.append("(");
        
        Field[] fields = objeto.getClass().getDeclaredFields();
        
        String values = "(";
        
        for(Field field : fields){
            sql.append(field.getName());
            sql.append(",");
            values += "?,";
        }
        
        values = values.substring(0, values.length() -1);
        values += ")"; 
                
        sql.delete(sql.length() - 1, sql.length());
        sql.append(") values");
        
        sql.append(values);
        
        System.out.println(sql.toString());
                
    }

    @Override
    public void alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
