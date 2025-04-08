package com.spotify.demo.webapi.model;

import java.util.List;

public record Album(String id, String title, Integer totalTracks, Integer duration,
    String releaseDate, String label, List<String> artistIds) implements Entity {
}
