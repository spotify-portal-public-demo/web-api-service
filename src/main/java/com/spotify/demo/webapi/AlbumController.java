package com.spotify.demo.webapi;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.spotify.demo.webapi.model.Album;
import com.spotify.demo.webapi.model.Pagination;

@RestController
@RequestMapping("/v1/album")
public class AlbumController {

  @GetMapping
  public Pagination<Album> findAll() {
    return new Pagination<>("", List.of());
  }

  @GetMapping("/{id}")
  public Album findById(@PathVariable String id) {
    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
  }

}
