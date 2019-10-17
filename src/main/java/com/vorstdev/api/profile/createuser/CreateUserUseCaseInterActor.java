package com.vorstdev.api.profile.createuser;

import com.vorstdev.api.core.interactor.InterActor;
import com.vorstdev.api.core.usecase.UseCaseExecutor;
import org.openapi.example.model.User;
import org.openapi.example.model.UserResponse;
import org.springframework.http.ResponseEntity;

public class CreateUserUseCaseInterActor implements InterActor {

    private final UseCaseExecutor useCaseExecutor;
    private final CreateUserUseCase createUserUseCase;
    private final CreateUserUseCaseInputMapper createUserUseCaseInputMapper;
    private final CreateUserUseCaseOutputMapper createUserUseCaseOutputMapper;

    public CreateUserUseCaseInterActor(
            UseCaseExecutor useCaseExecutor,
            CreateUserUseCase createUserUseCase,
            CreateUserUseCaseInputMapper createUserUseCaseInputMapper,
            CreateUserUseCaseOutputMapper createUserUseCaseOutputMapper) {
        this.useCaseExecutor = useCaseExecutor;
        this.createUserUseCase = createUserUseCase;
        this.createUserUseCaseInputMapper = createUserUseCaseInputMapper;
        this.createUserUseCaseOutputMapper = createUserUseCaseOutputMapper;
    }

    @Override
    public ResponseEntity<UserResponse> execute(User input) {
        return useCaseExecutor.execute(
                createUserUseCase,
                createUserUseCaseInputMapper.map(input),
                createUserUseCaseOutputMapper);
    }
}
