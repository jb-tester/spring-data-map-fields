package com.mytests.spring.springDataMapFields;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by irina on 6/30/2022.</p>
 * <p>Project: spring-data-map-fields</p>
 * *
 */
public interface FurnitureRepository extends CrudRepository<Furniture, Integer> {

    // https://youtrack.jetbrains.com/issue/IDEA-297171
    @Query("select p from Furniture p where p.attributes[:key] = :value")
    List<Furniture> findByAttributeAndValue(@Param("key") String attr_key, @Param("value") String attr_value);

    // https://youtrack.jetbrains.com/issue/IDEA-260631
    @Query("select id||': '||name||' ('||price||')' from Furniture ")
    List<String> getIdsNamesPricesConcatenation();
}
