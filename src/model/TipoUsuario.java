
package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class TipoUsuario extends DataAccessObject{
    
    private int codigoTipo;
    private String nome;
    
    public TipoUsuario(){
        super("tipo_usuario");
    }

    public void setCodigoTipo(int codigoTipo) {
        if( codigoTipo != this.codigoTipo){
            this.codigoTipo = codigoTipo;
            addChange("codigo_tipo", this.codigoTipo);
        }
    }

    public void setNome(String nome) {
        if( nome != this.nome){
            this.nome = nome;
            addChange("nome", this.nome);
        }
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public String getNome() {
        return nome;
    }
    
    public String getWhereClauseForOneEntry(){
        return " codigo_tipo = " + this.codigoTipo;
    }
    
    public void fill(ArrayList<Object> data){
        this.codigoTipo = (int)data.get(0);
        this.nome = (String)data.get(1);

    }
    
    @Override
    public boolean equals(Object obj){
        
        if( obj instanceof TipoUsuario ){
            TipoUsuario aux;
            aux = (TipoUsuario) obj;
            if( codigoTipo == aux.getCodigoTipo() ){
                return true;
            }
        }
        
        return false;
    }
    
}
