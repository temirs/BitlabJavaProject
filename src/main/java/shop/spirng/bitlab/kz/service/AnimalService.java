package shop.spirng.bitlab.kz.service;

import org.springframework.stereotype.Service;
import shop.spirng.bitlab.kz.model.Animal;

import java.util.List;

@Service
public interface AnimalService {

    List<Animal> getAllAnimals();

    Animal getAnimalById(int id);

    void deleteAnimalById(int id);

    void updateAnimal(Animal animal);

    void addAnimal(Animal animal);

}
