package shop.spirng.bitlab.kz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.spirng.bitlab.kz.model.Animal;
import shop.spirng.bitlab.kz.repository.AnimalRepository;
import shop.spirng.bitlab.kz.service.AnimalService;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal getAnimalById(int id) {
        return animalRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteAnimalById(int id) {
        animalRepository.deleteById(id);
    }

    @Override
    public void updateAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    @Override
    public void addAnimal(Animal animal) {
        animalRepository.save(animal);
    }
}
