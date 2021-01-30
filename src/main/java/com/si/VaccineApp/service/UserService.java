package com.si.VaccineApp.service;

import com.si.VaccineApp.dto.UserViewDto;

import java.util.List;

public interface UserService {

    List<UserViewDto> getAll();

    List<UserViewDto> getAllByProfession();

}

