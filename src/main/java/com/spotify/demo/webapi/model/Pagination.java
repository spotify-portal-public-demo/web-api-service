package com.spotify.demo.webapi.model;

import java.util.List;

public record Pagination<T>(String nextPageToken, List<T> entities) {
}
