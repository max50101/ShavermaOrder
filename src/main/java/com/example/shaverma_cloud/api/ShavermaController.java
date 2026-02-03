package com.example.shaverma_cloud.api;

import com.example.shaverma_cloud.model.Shaverma;
import com.example.shaverma_cloud.repository.ShavermaRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/shaverma",produces = "application/json")
@CrossOrigin(origins = "http://shavermacloud:8080")
public class ShavermaController {
    private ShavermaRepository shavermaRepository;

    public ShavermaController(ShavermaRepository shavermaRepository){
        this.shavermaRepository=shavermaRepository;
    }

    @GetMapping(path = "recent")
    public Iterable<Shaverma> recentShaverma(){
        PageRequest page=PageRequest.of(0,12, Sort.by("createdAt").descending());
        return shavermaRepository.findAll(page).getContent();
    }
}
