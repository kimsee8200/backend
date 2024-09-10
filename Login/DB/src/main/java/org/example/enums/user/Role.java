package org.example.enums.user;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {

    DRAW_USER("DRAW_USER"),
    JOG_USER("JOG_USER"),
    BOOK_USER("BOOK_USER"),
    PLANT_USER("PLANT_USER"),
    ART_USER("ART_USER"),
    GROUP_USER("GROUP_USER"),
    GROUP_LEADER("GROUP_LEADER");


    private final String role;
}
