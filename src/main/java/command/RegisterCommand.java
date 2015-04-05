package command;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Register;
import connectionProvider.ConnectionProvider;


public class RegisterCommand {

	public String execute(Register s) {

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement stmt = connection
					.prepareStatement("INSERT INTO Register(FirstName, LastName, EmailId, Location, Username, Password, ConfirmPassword) VALUES(?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, s.getFirstName());
			stmt.setString(2, s.getLastName());
			stmt.setString(3, s.getEmailId());
			stmt.setString(4, s.getLocation());
			stmt.setString(5, s.getUsername());
			stmt.setString(6, s.getPassword());
			stmt.setString(7, s.getConfirmPassword());
			ResultSet rs = stmt.executeQuery();
//			while (rs.next()) {
//				return rs.getString("Usertype");
//			}

		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "-1";
	}
}

