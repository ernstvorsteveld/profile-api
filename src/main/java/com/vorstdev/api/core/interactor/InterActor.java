package com.vorstdev.api.core.interactor;

import org.openapi.example.model.User;
import org.openapi.example.model.UserResponse;
import org.springframework.http.ResponseEntity;

public interface InterActor {

    ResponseEntity<UserResponse> execute(User input);
}
