
package model;

import controller.DataAccessObject;
import java.util.ArrayList;


public class Venda extends DataAccessObject{
    
    private int codigoVenda;
    private String data;
    private String hora;
    private float valorVenda;
    private Usuario cliente;
    private Usuario funcionario;
    
    public Venda(){
        super("vendas");
    }

    public void setCodigoVenda(int codigoVenda) {
        if( codigoVenda != this.codigoVenda){
            this.codigoVenda = codigoVenda;
            addChange("codigo_venda", this.codigoVenda);
        }
    }

    public void setData(String data) {
        if( data != this.data){
            this.data = data;
            addChange("data", this.data);
        }
    }

    public void setHora(String hora) {
        if( hora != this.hora){
            this.hora = hora;
            addChange("hora", this.hora);
        }
    }

    public void setValorVenda(float valorVenda) {
        if( valorVenda != this.valorVenda){
            this.valorVenda = valorVenda;
            addChange("valor_venda", this.valorVenda);
        }
    }

    public void setUsuario(Usuario cliente) throws Exception {
        if( this.cliente == null ){
           
           if( cliente != null ){
               this.cliente = new Usuario();
               this.cliente.setCodigoUsuario(cliente.getCodigoUsuario());
               this.cliente.load();
               addChange("codigo_usuario", this.cliente.getCodigoUsuario());
           }
       }else{
           if( cliente == null){
               
               this.cliente = null;
               addChange("codigo_cliente", null);
           }else{
               
               if( !this.cliente.equals( cliente ) ){
                   this.cliente.setCodigoUsuario(cliente.getCodigoUsuario());
                   this.cliente.load();
                   addChange("codigo_cliente", this.cliente.getCodigoUsuario());
               }
           }
       }
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public Usuario getUsuario() {
        return cliente;
    }
    
    public Usuario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Usuario funcionario) throws Exception{
        if( this.funcionario == null ){
           
           if( funcionario != null ){
               this.funcionario = new Usuario();
               this.funcionario.setCodigoUsuario(funcionario.getCodigoUsuario());
               this.funcionario.load();
               addChange("codigo_funcionario", this.funcionario.getCodigoUsuario());
           }
       }else{
           if( funcionario == null){
               
               this.funcionario = null;
               addChange("codigo_funcionario", null);
           }else{
               
               if( !this.funcionario.equals( funcionario ) ){
                   this.funcionario.setCodigoUsuario(funcionario.getCodigoUsuario());
                   this.funcionario.load();
                   addChange("codigo_funcionario", this.funcionario.getCodigoUsuario());
               }
           }
       }
    }
    
    
    public String getWhereClauseForOneEntry(){
        return " codigo_venda = " + this.codigoVenda;
    }
    
    public void fill(ArrayList<Object> data) throws Exception{
        this.codigoVenda = (int)data.get(0);
        this.data = data.get(1).toString();
        this.hora = data.get(2).toString();
        this.valorVenda = (float)data.get(3);
        if( data.get(4) != null ){
            if( cliente == null){
                cliente = new Usuario();
            }
            
            cliente.setCodigoUsuario((int)data.get(4));
            cliente.load();
        }
        if( data.get(5) != null ){
            if( funcionario == null){
                funcionario = new Usuario();
            }
            
            funcionario.setCodigoUsuario((int)data.get(5));
            funcionario.load();
        }
    }
}
