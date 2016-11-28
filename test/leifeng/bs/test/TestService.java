package leifeng.bs.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import leifeng.bs.domain.User;

//@Service
public class TestService {
	
	@Resource
	private SessionFactory sessionFactory;
	
	//@Transactional
	@Test
	public void saveTwoUser(){
		Session session=sessionFactory.getCurrentSession();
		
		User user=new User();
		user.setName("admin");
		user.setLoginName("admin");
		user.setPassword("admin");
		
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		//int a=1/0;
		//session.save(new User());
	}

}
