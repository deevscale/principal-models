package com.deevscale.principalmodel.api.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record AccountResponse(
        UUID id,
        String username
) {
}
