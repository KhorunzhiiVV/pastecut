package ru.khorunzhii.pastecut.controllers;


import org.springframework.web.bind.annotation.*;
import ru.khorunzhii.pastecut.api.request.PasteCutRequest;

import java.util.Collections;
import java.util.List;

@RestController
public class PasteCutController {

    @GetMapping("/")
    public List<String> getPublicPastes() {
        return Collections.emptyList();
    }

    @GetMapping("/{hash}")
    public String getByHash(@PathVariable String hash) {
        return hash;
    }

    @PostMapping("/")
    public String addPaste(@RequestBody PasteCutRequest request){
        return request.getData();
    }
}
