package com.deevscale.principalmodel.api.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record AccountRequest(
        @NotBlank
        String username,
        String password
) {
}
