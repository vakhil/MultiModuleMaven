import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.Properties;

class H2ConnectionTest {

	public static void main(String[] args){
		H2ConnectionService testClass = new H2ConnectionService();
		testClass.testH2Connection();
	}
}