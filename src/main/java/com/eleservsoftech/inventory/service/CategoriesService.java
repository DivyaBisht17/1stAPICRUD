package com.eleservsoftech.inventory.service;

import com.eleservsoftech.inventory.model.Categories;

import java.util.List;

public interface CategoriesService {
    public List<Categories>getAll();
    public Categories addCategories(Categories cat);

    public Categories updateCategories(Categories cat);

   public  Categories getbyId(Long  c_id);
}
