package test;

import java.util.List;

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
	List<UserPO> cs=userService.list();
	for (UserPO c : cs) {
		System.out.println(c);
	}
}
}
