import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import com.offcn.po.User;
import com.offcn.service.UserService;

public class RestClientDemo001 {

	public static void main(String[] args) {
		UserService service = JAXRSClientFactory.create("http://localhost:8080/RestCXFService/service/aa", UserService.class);
		

		/*User u1 = service.get("a888");
		System.out.println(u1);*/
		
		/*User u2 = service.delete("u999");
		System.out.println(u2);*/
		User u = new User();
		u.setId("a888");
		u.setAge(19);
		u.setName("qqq");
		u.setPassword("123");
		/*User u3 = service.put("a888", u);
		System.out.println(u3);*/
		
		User u4 = service.post("a777", u);
		System.out.println(u4);
	}

}
