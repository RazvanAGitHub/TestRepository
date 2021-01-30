package com.si.VaccineApp.service.impl;

import com.si.VaccineApp.dto.UserViewDto;
import com.si.VaccineApp.repository.UserRepository;
import com.si.VaccineApp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserViewDto> getAll() {

        List<UserViewDto> usersList = new ArrayList<>();

        // user -> userViewDto (modelMapper -> TODO look it up in the MVN repository, it can be a BEAN)
        // it maps all of the fields from one blueprint to another matching by field name.
//        userRepository.findAll()
//                // User -> UserViewDto -> add to a LIST
//                .forEach(user -> usersList.add(new UserViewDto(user.getUsername(), user.getProfession(), user.getCnp())));

        return usersList;
    }

    @Override
    public List<UserViewDto> getAllByProfession() {

        List<UserViewDto> usersList = new ArrayList<>();

        // user -> userViewDto (modelMapper -> TODO look it up in the MVN repository, it can be a BEAN)
        // it maps all of the fields from one blueprint to another matching by field name.
        userRepository.findAll()
                // User -> UserViewDto -> add to a LIST
                .forEach(user -> {
                    if (user.getProfession().equals("prof1")) {
                        usersList.add(new UserViewDto(user.getUsername(), user.getProfession(), user.getCnp()));
                    }

                });

        return usersList;
    }
}
