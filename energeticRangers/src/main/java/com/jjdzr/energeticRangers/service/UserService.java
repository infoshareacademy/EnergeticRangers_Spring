package com.jjdzr.energeticRangers.service;

import com.jjdzr.energeticRangers.entity.User;
import com.jjdzr.energeticRangers.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save (UserRegistrationDto userRegistrationDto);
}
