
package model;

import controller.DataAccessObject;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Usuario extends DataAccessObject{
    
    private int codigoUsuario;
    private String nomeCompleto;
    private String dataNascimento;
    private String cpf;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private String email;
    private String senhaAcesso;
    private TipoUsuario tipoUsuario;
    
    public Usuario(){
        super("usuarios");
    }

    public void setCodigoUsuario(int codigoUsuario) {
        if( codigoUsuario != this.codigoUsuario){
            this.codigoUsuario = codigoUsuario;
            addChange("codigo_usuario", this.codigoUsuario);
        }
    }

    public void setNomeCompleto(String nomeCompleto) {
        if( nomeCompleto != this.nomeCompleto){
            this.nomeCompleto = nomeCompleto;
            addChange("nome_completo", this.nomeCompleto);
        }
    }

    public void setDataNascimento(String dataNascimento) {
        if( dataNascimento != this.dataNascimento){
            this.dataNascimento = dataNascimento;
            addChange("data_nascimento", this.dataNascimento);
        }
    }

    public void setCpf(String cpf) {
        if( cpf != this.cpf){
            this.cpf = cpf;
            addChange("cpf", this.cpf);
        }
    }

    public void setEndereco(String endereco) {
        if( endereco != this.endereco){
            this.endereco = endereco;
            addChange("endereco", this.endereco);
        }
    }

    public void setNumero(String numero) {
        if( numero != this.numero){
            this.numero = numero;
            addChange("numero", this.numero);
        }
    }

    public void setComplemento(String complemento) {
        if( complemento != this.complemento){
            this.complemento = complemento;
            addChange("complemento", this.complemento);
        }
    }

    public void setBairro(String bairro) {
        if( bairro != this.bairro){
            this.bairro = bairro;
            addChange("bairro", this.bairro);
        }
    }

    public void setCidade(String cidade) {
        if( cidade != this.cidade){
            this.cidade = cidade;
            addChange("cidade", this.cidade);
        }
    }

    public void setEstado(String estado) {
        if( estado != this.estado){
            this.estado = estado;
            addChange("estado", this.estado);
        }
    }
    
    public void setTelefone(String telefone) {
        if( !telefone.equals( this.telefone ) ) {
            this.telefone = telefone;
            addChange("telefone", this.telefone);
        }
    }
    
    public void setCelular(String celular) {
        if( !celular.equals( this.celular ) ) {
            this.celular = celular;
            addChange("celular", this.celular);
        }
    }

    public void setEmail(String email) {
        if( !email.equals( this.email ) ) {
            this.email = email;
            addChange("email", this.email);
        }
    }
    
    
    
    public void setSenhaAcesso(String senhaAcesso) {
        if ( !senhaAcesso.equals(this.senhaAcesso)){
            this.senhaAcesso = getSenhaHash(senhaAcesso);
            addChange("senha_acesso", this.senhaAcesso);
        }
    }
    
    private String getSenhaHash(String senhaAcesso){
        String senhaHash = "";
        try{
            MessageDigest md = MessageDigest.getInstance( "SHA-256");
            senhaAcesso += String.valueOf(getCodigoUsuario());
            senhaHash = new BigInteger( 1, md.digest(senhaAcesso.getBytes("UTF-8") ) ).toString(16);
        } catch ( Exception ex ){
            ex.printStackTrace();
        }
        return senhaHash;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) throws Exception {
        if( this.tipoUsuario == null ){
           
           if( tipoUsuario != null ){
               this.tipoUsuario = new TipoUsuario();
               this.tipoUsuario.setCodigoTipo(tipoUsuario.getCodigoTipo() );
               this.tipoUsuario.load();
               addChange("codigo_tipo", this.tipoUsuario.getCodigoTipo());
           }
       }else{
           if( tipoUsuario == null){
               
               this.tipoUsuario = null;
               addChange("codigo_tipo", null);
           }else{
               
               if( !this.tipoUsuario.equals( tipoUsuario ) ){
                   this.tipoUsuario.setCodigoTipo(tipoUsuario.getCodigoTipo());
                   this.tipoUsuario.load();
                   addChange("codigo_tipo", this.tipoUsuario.getCodigoTipo());
               }
           }
       }
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
    
    
    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    
    public String getWhereClauseForOneEntry(){
        return " email = '" + this.email+ "'";
    }
    
    public void fill(ArrayList<Object> data) throws Exception{
        codigoUsuario = (int)data.get(0);
        nomeCompleto = (String)data.get(1);
        if ( data.get(2) != null){
            dataNascimento= data.get(2).toString();
        }
        cpf = (String)data.get(3);
        endereco = (String)data.get(4);
        numero = (String)data.get(5);
        complemento = (String)data.get(6);
        bairro = (String)data.get(7);
        cidade = (String)data.get(8);
        estado = (String)data.get(9);
        telefone= (String)data.get(10);
        celular= (String)data.get(11);
        email= (String)data.get(12);
        senhaAcesso = (String)data.get(13);
        if( data.get(14) != null ){
            if( tipoUsuario == null){
                tipoUsuario = new TipoUsuario();
            }
            
            tipoUsuario.setCodigoTipo((int)data.get(14));
            tipoUsuario.load();
        }
    }
    
    @Override
    public boolean equals(Object obj){
        
        if( obj instanceof Usuario ){
            Usuario aux;
            aux = (Usuario) obj;
            if( codigoUsuario == aux.getCodigoUsuario()){
                return true;
            }
        }
        
        return false;
    }
}
