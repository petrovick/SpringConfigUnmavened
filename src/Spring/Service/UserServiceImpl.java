package Spring.Service;

import org.springframework.stereotype.Service;

import Spring.Model.User;
import Spring.Service.DTO.UserDto;


@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserDto, Long> implements UserService {


}
