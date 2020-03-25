package md.design.patterns.templatemethod;

import java.sql.*;

/**
 * defines the skeleton of an algorithm deferring some steps to the subclasses(doesn't varies)
 * lets subclasses redefine certain steps of an algorithm without changing the algorithm structure(varies)
 * zb algorithm structure is picture+text ans steps is certain picture and certain text
 * zb a subclass for an politician(with picture of him and text about him) or subclass of nature ..
 */
public class Book extends BaseModel{
	private long id;
	private String name;
	private String descrip;
	public Book(String name, String descrip){
		this.id=0;
		this.name=name;
		this.descrip=descrip;
		this.SQL="insert into BOOK(name, descrip) values(?,?)";
	}
	protected void insertOperation(PreparedStatement preparedStatement)throws SQLException{
		preparedStatement.setString(1,this.name);
		preparedStatement.setString(2, this.descrip);
		preparedStatement.executeUpdate();
		this.id=getId(preparedStatement);
	}
}
