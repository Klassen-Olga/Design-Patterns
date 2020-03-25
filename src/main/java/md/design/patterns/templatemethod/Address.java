package md.design.patterns.templatemethod;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Address extends BaseModel{
	private long id;
	private String country;
	private String city;
	private String zip;
	private String street;

	public Address(String country, String city, String zip, String street){
		this.SQL=" insert into ADDRESS(country, city, zip, street) values(?,?,?,?)";
		this.city=city;
		this.country=country;
		this.zip=zip;
		this.street=street;
	}

	protected void insertOperation(PreparedStatement preparedStatement)throws SQLException{
		preparedStatement.setString(1,this.country);
		preparedStatement.setString(2, this.city);
		preparedStatement.setString(3,this.zip);
		preparedStatement.setString(4, this.street);
		preparedStatement.executeUpdate();
		this.id=getId(preparedStatement);
	}
}
