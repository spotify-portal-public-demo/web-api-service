package com.spotify.demo.webapi.model;

import java.util.List;

public record Track(String id, String isrc, String title, Integer duration, String albumId,
    List<String> artistIds) implements Entity {
}
