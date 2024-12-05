package org.example.enums.user;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {

    DRAW_USER("ROLE_DRAW_USER"),
    JOG_USER("ROLE_JOG_USER"),
    BOOK_USER("ROLE_BOOK_USER"),
    PLANT_USER("ROLE_PLANT_USER"),
    ART_USER("ROLE_ART_USER"),
    GROUP_USER("ROLE_GROUP_USER"),
    GROUP_LEADER("ROLE_GROUP_LEADER");


    private final String role;
}
