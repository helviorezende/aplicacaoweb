package org.wpattern.spring.oauth2.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wpattern.spring.oauth2.utils.BaseResourceImpl;

@RestController
@RequestMapping(path = "/api/user")
public class UserResource extends BaseResourceImpl<UserEntity, Long>{

}
