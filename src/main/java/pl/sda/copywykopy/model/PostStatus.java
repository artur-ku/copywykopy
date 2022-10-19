package pl.sda.copywykopy.model;

import javax.persistence.Entity;

public enum PostStatus {
    SUBMITTED,
    APPROVED,
    DELETED,
    REMOVED

    //TODO zastanowic sie czy to potrzebne?
    //- czy po prostu przy usunieciu posta wywalic go z bazy i wszystko z nim zwiazane
    // czy moze admini moga podgladac nawet usuniete posty zeby stwierdzic czy np nie zbanowac uzytkownika
}
