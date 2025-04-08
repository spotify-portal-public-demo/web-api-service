package com.spotify.demo.webapi;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spotify.demo.webapi.model.Pagination;
import com.spotify.demo.webapi.model.SearchEntity;

@RestController
@RequestMapping("/v1/search")
public class SearchController {

  @GetMapping
  public Pagination<SearchEntity> query(@RequestParam String q) {
    return new Pagination<>("", List.of());
  }

}
