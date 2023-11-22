
package controller;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;


public class ResultSetTableModel extends AbstractTableModel{
    
    private DataBaseConnection dbConnection;
    
    private int numberOfRows = 0;
    
    //construtor
    public ResultSetTableModel (String query) throws SQLException{
        
        dbConnection = DataBaseConnection.getInstance();        
        setQuery(query);
    }
    
    //definir a query
    public void setQuery(String query)throws SQLException{
        
        dbConnection.executeQuery(query);
        
        
        
        dbConnection.getResultSet().last();
        numberOfRows = dbConnection.getResultSet().getRow();
        
        //notifica a JTable que o modelo foi alterado
        //constroi a tabela
        fireTableStructureChanged();
    }

    //pega o numero de linhas
    @Override
    public int getRowCount() {
        return numberOfRows;
    }

    //pega o numero de colunas
    @Override
    public int getColumnCount() {
        try {
            return dbConnection.getMetaData().getColumnCount();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
    //pega o valor da celula
    @Override
    public Object getValueAt(int row, int column) {
        try {
            dbConnection.getResultSet().absolute(row + 1);
            return dbConnection.getResultSet().getObject(column + 1);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return "";
    }
    
    //nomear as colunas
    public String getColumnName (int column){
        try {
        return dbConnection.getMetaData().getColumnLabel(column + 1);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return "";
    }
    
    //encerrar conexao com o banco de dados
    public void disconnectFromDatabase(){
        try{
            dbConnection.disconnect();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
