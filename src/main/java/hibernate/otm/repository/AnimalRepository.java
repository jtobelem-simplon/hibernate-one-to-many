package hibernate.otm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import hibernate.otm.model.Animal;

@RepositoryRestResource(collectionResourceRel = "animaux", path = "animaux")
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long>{

}
