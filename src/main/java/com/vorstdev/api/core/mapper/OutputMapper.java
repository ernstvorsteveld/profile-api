package com.vorstdev.api.core.mapper;

import com.vorstdev.api.core.usecase.UseCase;

public interface OutputMapper<O extends UseCase.OutputValues, RE> {

    RE map(O output);
}
