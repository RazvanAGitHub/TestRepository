package com.si.VaccineApp.controller;

import com.si.VaccineApp.dto.UserViewDto;
import com.si.VaccineApp.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // annotation -> makes the class a BEAN -> managed by the application context
@RequestMapping(value = "/user")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public List<UserViewDto> getAll() {
        return userService.getAll();
    }

    @GetMapping(value = "/byProfession/")
    public List<UserViewDto> getAllByProfession() {
        return userService.getAllByProfession();
    }
}
