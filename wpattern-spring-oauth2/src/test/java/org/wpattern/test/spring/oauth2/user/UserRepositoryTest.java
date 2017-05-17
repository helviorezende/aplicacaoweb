package org.wpattern.test.spring.oauth2.user;

import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.spring.oauth2.user.UserEntity;
import org.wpattern.spring.oauth2.user.UserRepository;
import org.wpattern.test.spring.oauth2.AbstractTest;

public class UserRepositoryTest extends AbstractTest {
	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);
	@Autowired
	private UserRepository userRepository;

	@Test
	public void findAllTest() {
		List<UserEntity> users = this.userRepository.findAll();
		LOGGER.info("FindAll(): " + users);
	}
}




