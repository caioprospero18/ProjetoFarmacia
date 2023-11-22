
package controller;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public final class DataBaseConnection {
    
     //gerencia a conexão
    private Connection connection = null;
    //meio para instrução SQL
    private Statement statement = null;
    //gerencia resultados
    private ResultSet resultSet = null;
    private ResultSetMetaData metaData = null;
    
    private final String url = AppConfig.getUrl();
    private final String user = AppConfig.getUser();
    private final String password = AppConfig.getPassword();
    
    private static DataBaseConnection singleton = new DataBaseConnection();
    
    private DataBaseConnection() {
    }

    public static DataBaseConnection getInstance() {
        return singleton;
    }


    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public ResultSetMetaData getMetaData() {
        return metaData;
    }
    
    
    
    
    public void connect() throws SQLException{
        
        if (connection == null){
            //estabelece uma conexão com o banco de dados
            connection = DriverManager.getConnection(url, user, password); 
        }
    }
    
    
    
    public void createStatement() throws SQLException{
        
        if (connection == null){
            connect();
        }
        
        //cria Statement para executar SQL no banco de dados
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
    
    public void executeQuery(String query) throws SQLException{
        
        if(statement == null){
            createStatement();
        }
        
        //executa o código SQL de consulta no banco de dados
        resultSet = statement.executeQuery(query);
        metaData = resultSet.getMetaData();
    }
    
    //metodo para executar outros comandos
    public boolean executeSQL(String sql) throws SQLException{
        if(statement == null){
            createStatement();
        }
        
        return statement.execute(sql);
    }
    
    public void disconnect() throws SQLException{
        if (resultSet != null){
            resultSet.close();
        }
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
         
        resultSet = null;
        statement = null;
        connection = null;
    }
}
