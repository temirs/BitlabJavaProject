package shop.spirng.bitlab.kz.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.spirng.bitlab.kz.model.Animal;

@Repository
@Transactional
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
