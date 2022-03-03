package com.sistas.cloudconfig.web.rest;


import com.sistas.cloudconfig.service.ConfigService;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/git/projects")
public class ConfigResource {

    @Autowired
    private final ConfigService configService;

    public ConfigResource(ConfigService configService) {
        this.configService = configService;
    }

    @PostMapping("/create")
    public ResponseEntity createProject(
            @RequestParam("file") MultipartFile multipartFile) throws GitAPIException, IOException {

        return null;
    }
}
