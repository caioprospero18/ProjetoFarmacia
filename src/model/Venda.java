
package model;

import controller.DataAccessObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Venda extends DataAccessObject{
    
    private int codigoVenda;
    private String dataHoraVenda;
    private float valorVenda;
    private Usuario cliente;
    private Usuario funcionario;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    
    public Venda(){
        super("vendas");
    }

    public void setCodigoVenda(int codigoVenda) {
        if( codigoVenda != this.codigoVenda){
            this.codigoVenda = codigoVenda;
            addChange("codigo_venda", this.codigoVenda);
        }
    }

    public void setDataHoraVenda(String data) {
        if( dataHoraVenda != this.dataHoraVenda){
            this.dataHoraVenda = dtf.format(now);
            addChange("data_hora_venda", this.dataHoraVenda);
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

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public String getDataHoraVenda() {
        return dataHoraVenda;
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
    
    
    public String getWhereClauseForOneEntry(){
        return " codigo_venda = " + this.codigoVenda;
    }
    
    public void fill(ArrayList<Object> data) throws Exception{
        codigoVenda = (int)data.get(0);
        dataHoraVenda = data.get(1).toString();
        valorVenda = (float)data.get(2);
        if( data.get(3) != null ){
            if( cliente == null){
                cliente = new Usuario();
            }
            
            cliente.setCodigoUsuario((int)data.get(3));
            cliente.load();
        }
        if( data.get(4) != null ){
            if( funcionario == null){
                funcionario = new Usuario();
            }
            
            funcionario.setCodigoUsuario((int)data.get(4));
            funcionario.load();
        }
    }
}
