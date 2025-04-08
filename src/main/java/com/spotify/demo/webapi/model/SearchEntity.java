package com.spotify.demo.webapi.model;

public record SearchEntity(String entityType, String id, Float relevance) {
}
