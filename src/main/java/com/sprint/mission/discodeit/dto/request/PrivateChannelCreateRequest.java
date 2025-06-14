package com.sprint.mission.discodeit.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.UUID;

public record PrivateChannelCreateRequest(
    @NotNull(message = "참여자 목록은 필수입니다")
    @NotEmpty(message = "참가자는 1명 이상이어야 합니다")
    @Size(min = 1, max = 100, message = "참가자는 1-100명 사이여야 합니다")
    List<UUID> participantIds
) {

}