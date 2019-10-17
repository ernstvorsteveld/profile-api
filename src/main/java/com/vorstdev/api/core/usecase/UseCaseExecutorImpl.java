package com.vorstdev.api.core.usecase;

import com.vorstdev.api.core.mapper.OutputMapper;
import org.springframework.http.ResponseEntity;

public class UseCaseExecutorImpl implements UseCaseExecutor {

    @Override
    public <RE, I extends UseCase.InputValues, O extends UseCase.OutputValues> ResponseEntity<RE> execute(
            UseCase<I, O> useCase, I input, OutputMapper<O, RE> outputMapper) {
        O result = useCase.execute(input);
        return ResponseEntity.ok(outputMapper.map(result));
    }
}
