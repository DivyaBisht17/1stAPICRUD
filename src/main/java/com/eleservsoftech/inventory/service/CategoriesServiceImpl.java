package com.eleservsoftech.inventory.service;

import com.eleservsoftech.inventory.model.Categories;
import com.eleservsoftech.inventory.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl  implements CategoriesService{
    @Autowired
    private CategoriesRepository catRepository;

    @Override
    public List<Categories> getAll() {
        return catRepository.findAll();
    }

    @Override
    public Categories addCategories(Categories cat) {
        return catRepository.save(cat);
    }

    @Override
    public Categories updateCategories(Categories cat) {
        Categories cat1=catRepository.getById(cat.getC_id());
        if(cat.getName()!=null)
            cat1.setName(cat.getName());
        if(cat.getCreated_At()!=null)
            cat1.setCreated_At(cat.getCreated_At());
        if(cat.getModified_at()!=null)
            cat1.setModified_at(cat.getModified_at());
        if(cat.getCreated_by()!=null)
            cat1.setCreated_by(cat.getCreated_by());
        if(cat.getLast_Modified_by()!=null)
            cat1.setLast_Modified_by(cat.getLast_Modified_by());
        if(cat.getIsdelete()!=null)
            cat1.setIsdelete(cat.getIsdelete());
        return  catRepository.save(cat1);
    }

    @Override
    public Categories getbyId(Long c_id) {
        return catRepository.findById(c_id).get();
    }
}
