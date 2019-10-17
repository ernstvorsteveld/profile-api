package com.vorstdev.api.profile.createuser;

import com.vorstdev.api.profile.createuser.CreateUserUseCase.InputValues;
import org.openapi.example.model.User;


public class CreateUserUseCaseInputMapper {

    public CreateUserUseCase.InputValues map(User body) {
        return new InputValues();
    }

}
