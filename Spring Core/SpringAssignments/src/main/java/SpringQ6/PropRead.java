package SpringQ6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:dbConfig.properties")
public class PropRead {
@Value("${name}")
	private String name;
@Value("${dburl}")
	private String	dburl;
@Value("${username}")
	private String	username;
@Value("${password}")
	private String password;
@Override
public String toString() {
	return "PropRead [name=" + name + ", dburl=" + dburl + ", username=" + username + ", password=" + password + "]";
}


	

}
