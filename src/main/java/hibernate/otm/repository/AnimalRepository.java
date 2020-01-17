package hibernate.otm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import hibernate.otm.model.Animal;

public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long>{

}
