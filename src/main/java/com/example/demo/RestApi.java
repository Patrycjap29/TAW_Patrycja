package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class RestApi {

    @Autowired
    private ZajeciaDatabase zajeciaDatabase;

    @GetMapping("test")
    public String testApi() {
        return "test";
    }

    @PostMapping(value = "zajecia",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addNewZajecia(@RequestBody List<Zajecia> zajeciaList) {
        zajeciaDatabase.addZajecia(zajeciaList);
    }

    @GetMapping(value = "zajecia",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Zajecia> getZajecia(
            @Nullable @RequestParam("name") String name,
            @Nullable @RequestParam("ECTS") Integer ECTS,
            @Nullable @RequestParam("room") Integer room,
            @Nullable @RequestParam("exam") Boolean exam) {
        List<Zajecia> filteredZajecia = zajeciaDatabase.getZajeciaList(name, ECTS, room, exam);
        return filteredZajecia;
    }

    @GetMapping(value = "zajecia/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getZajeciaById(@PathVariable("id") Integer id) {
        Zajecia zajecia = zajeciaDatabase.getZajeciaById(id);
        if (zajecia == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(zajecia);
        }
    }

    @DeleteMapping(value = "zajecia")
    public void deleteAll() {
        zajeciaDatabase.deleteAll();
    }

    @DeleteMapping(value = "zajecia/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteById(@PathVariable("id") Integer id) {
        boolean isDeleted = zajeciaDatabase.deleteById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
