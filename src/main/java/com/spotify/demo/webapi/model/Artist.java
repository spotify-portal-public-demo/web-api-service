package com.spotify.demo.webapi.model;

import java.util.List;

public record Artist(String id, String name, List<String> aliases) implements Entity {
}
