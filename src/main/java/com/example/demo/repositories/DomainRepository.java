package com.example.demo.repositories;

import com.example.demo.model.Domain;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "domain", path = "domains")
public interface DomainRepository extends PagingAndSortingRepository<Domain, Long> {
    List<Domain> findByName(@Param("name") String name);
}
