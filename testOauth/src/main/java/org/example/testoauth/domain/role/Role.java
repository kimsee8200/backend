package org.example.testoauth.domain.role;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    LEADER("LEADER"),
    PUSER("PLANT_USER"),
    DUSER("DRAW_USER"),
    AUSER("ART_USER"),
    JUSER("JOG_USER"),
    BUSER("BOOK_USER");



    private final String desc;
}
