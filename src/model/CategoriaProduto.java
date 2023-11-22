
package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class CategoriaProduto extends DataAccessObject{
    
    private int codigoCategoria;
    private String categoria;
    
    public CategoriaProduto(){
        super("categoria_produto");
    }

    public void setCodigoCategoria(int codigoCategoria) {
        if( codigoCategoria != this.codigoCategoria){
            this.codigoCategoria = codigoCategoria;
            addChange("codigo_categoria", this.codigoCategoria);
        }
    }

    public void setCategoria(String categoria) {
        if( categoria != this.categoria){
            this.categoria = categoria;
            addChange("categoria", this.categoria);
        }
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public String getWhereClauseForOneEntry(){
        return " codigo_categoria = " + this.codigoCategoria;
    }
    
    public void fill(ArrayList<Object> data){
        this.codigoCategoria = (int)data.get(0);
        this.categoria = (String)data.get(1);

    }
    
    @Override
    public boolean equals(Object obj){
        
        if( obj instanceof CategoriaProduto ){
            CategoriaProduto aux;
            aux = (CategoriaProduto) obj;
            if( codigoCategoria== aux.getCodigoCategoria()){
                return true;
            }
        }
        
        return false;
    }
}
