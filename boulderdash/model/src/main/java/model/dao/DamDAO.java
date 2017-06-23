package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DamDAO extends AbstractDAO{
	static ResultSet rs;
	
	public static void UpdateComposant(int IDComposant, int Statue){
	String sql = "INSERT INTO Composant (IDComposant, Statue) VALUES (" + IDComposant +"," + Statue +")";
	executeUpdate(sql);}

	
	
	public static void UpdateElement(int X, int Y, int IDMap, int IDComposant){
		String sql = "INSERT INTO Elements (X, Y, IDMap, IDComposant) VALUES (" + X +"," + Y + "," + IDMap + "," + IDComposant +")";
		executeUpdate(sql);}
	
	
	public static void UpdateMap(int IDMap, int LevelMap){
		String sql = "INSERT INTO Map (IDMap, LevelMap) VALUES (" + IDMap + "," + LevelMap +")";
		executeUpdate(sql);}
	
	
	public static void ResultTab(int Ligne, String Composant) throws SQLException{
			
			String sql = "SELECT Composant FROM level1";
			rs = executeQuery(sql);
			while(rs.next()){
			rs.getString("Composant");
			System.out.println(rs.getString("Composant"));}
			
	}
	
	
}