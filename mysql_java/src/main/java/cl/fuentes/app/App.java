package cl.fuentes.app;

import java.sql.ResultSet;

import cl.fuentes.db.Mysqlconn;

public class App 
{
    public static void main( String[] args )
    {
    	ResultSet resultSet = null;
    	    	
    	Mysqlconn mc = new Mysqlconn("localhost", "ventas", "root", "1234");
    	try {
        	mc.open();
        	resultSet = mc.ejecutarQuery("select * from usuario;");
        	mc.obtenerColumnas(resultSet);
        	mc.mostrarQuery(resultSet);
        	//mc.ejecutarUpdate("delete .....");
        	mc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

}
