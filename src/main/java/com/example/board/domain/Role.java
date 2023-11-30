package com.example.board.domain;

import lombok.*;
import javax.persistence.*;

@Getter
@RequiredArgsConstructor
/**
 * 신기하게도 enum으로 Role를 정의
 */
public enum Role {

    USER("ROLE_USER"),

    ADMIN("ROLE_ADMIN"),

    SOCIAL("ROLE_SOCIAL");

    private final String value;
}
