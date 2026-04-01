package com.cm.crud.controllers;

import com.cm.crud.models.AnimalModel;
import com.cm.crud.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<AnimalModel> findAll(){
        return  animalService.findAll();
    }

    @PostMapping
    public AnimalModel criarAnimal(@RequestBody AnimalModel animalModel){
        return  animalService.criarAnimal(animalModel);
    }

    @PutMapping("/{id}")
    public  AnimalModel atualizarAnimal(@RequestBody AnimalModel animalModel, @PathVariable Long id){
        AnimalModel response = animalService.findById(id);
        response.setAnimalName(animalModel.getAnimalName());
        response.setAnimalType(animalModel.getAnimalType());
        return animalService.atualizarAnimal(response, id);
    }

    @DeleteMapping("/{id}")
    public void deletarAnimal(@PathVariable Long id){
        animalService.deletarAnimal(id);
    }

    @GetMapping("/{id}")
    public AnimalModel findById(@PathVariable Long id){
        return animalService.findById(id);
    }

}
