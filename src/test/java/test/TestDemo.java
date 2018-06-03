package test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.woniuxy.mapper.ClassMapper;
import com.woniuxy.po.Class;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class TestDemo {

@Autowired
private ClassMapper classMapper;

@Test
public void testList() {
	System.out.println(classMapper);
	List<Class> cs=classMapper.list();
	for (Class c : cs) {
		System.out.println(c);
	}
}
}
