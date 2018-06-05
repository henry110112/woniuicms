package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.woniuxy.po.UserPO;
import com.woniuxy.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class TestDemo {

@Autowired
private UserService userService;

@Test
public void testList() {
	System.out.println(userService);
	UserPO userPO = new UserPO();
	userPO.setLogin("admindd");
	userPO.setPassword("12345");
	System.out.println(userService.checkLogin(userPO));
}
}
