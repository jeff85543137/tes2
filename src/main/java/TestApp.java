import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.po.User;
import com.offcn.service.UserService;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-cxf.xml");

		UserService service = context.getBean(UserService.class);
		
		User u1 = service.get("t999");
		
		System.out.println(u1);
	}

}
