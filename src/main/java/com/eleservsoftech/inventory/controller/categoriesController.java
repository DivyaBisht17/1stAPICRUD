package com.eleservsoftech.inventory.controller;

import com.eleservsoftech.inventory.model.Categories;
import com.eleservsoftech.inventory.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/db")
@RestController
public class categoriesController {
    @Autowired
    private CategoriesService catService;
    @GetMapping("/getAll")
    public List<Categories> getAll(){

        return catService.getAll();
    }
    @PostMapping("/save")
    public Categories addCategories(@RequestBody Categories cat){
        return catService.addCategories(cat);
    }
    @PutMapping("/edit")
    public Categories updateCategories(@RequestBody Categories cat){

        return catService.updateCategories(cat);
    }

    @GetMapping("/get/{id}")
    public Categories getById(@PathVariable Long id) {
        return catService.getbyId(id);
    }
}
