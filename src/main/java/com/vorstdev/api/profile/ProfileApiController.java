package com.vorstdev.api.profile;

import com.vorstdev.api.profile.createuser.CreateUserUseCaseInterActor;
import javax.validation.Valid;
import org.openapi.example.model.User;
import org.openapi.example.model.UserPatch;
import org.openapi.example.model.UserResponse;
import org.springframework.http.ResponseEntity;

public class ProfileApiController implements org.openapi.example.api.ProfileApi {

    private final CreateUserUseCaseInterActor createUserUseCaseInterActor;

    public ProfileApiController(CreateUserUseCaseInterActor createUserUseCaseInterActor) {
        this.createUserUseCaseInterActor = createUserUseCaseInterActor;
    }

    @Override
    public ResponseEntity<UserResponse> createUser(@Valid User body) {
        return createUserUseCaseInterActor.execute(body);
    }

    @Override
    public ResponseEntity<Void> deleteUser(String id) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> getUserById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> patchUser(
            String id, @Valid UserPatch body) {
        return null;
    }
}
