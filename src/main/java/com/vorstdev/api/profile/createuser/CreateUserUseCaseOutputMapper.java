package com.vorstdev.api.profile.createuser;

import com.vorstdev.api.core.mapper.OutputMapper;
import com.vorstdev.api.profile.createuser.CreateUserUseCase.OutputValues;
import org.openapi.example.model.UserResponse;

public class CreateUserUseCaseOutputMapper implements OutputMapper<OutputValues, UserResponse> {

    @Override
    public UserResponse map(CreateUserUseCase.OutputValues output) {
        return new UserResponse();
    }
}
