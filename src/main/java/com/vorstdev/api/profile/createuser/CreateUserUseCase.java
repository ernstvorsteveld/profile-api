package com.vorstdev.api.profile.createuser;

import com.vorstdev.api.domain.User;
import com.vorstdev.api.core.usecase.UseCase;

public class CreateUserUseCase extends UseCase<CreateUserUseCase.InputValues, CreateUserUseCase.OutputValues> {

    private final OutputValues outputValues = new OutputValues();
    private final InputValues inputValues = new InputValues();

    @Override
    public OutputValues execute(InputValues input) {
        User user = new User(input.getUserName());
        return new OutputValues();
    }

    public OutputValues getOutputValues() {
        return outputValues;
    }

    public InputValues getInputValues() {
        return inputValues;
    }

    public static class InputValues implements UseCase.InputValues {

        public String getUserName() {
            return "test-user";
        }
    }

    public static class OutputValues implements UseCase.OutputValues {

        private User user;

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }

}
