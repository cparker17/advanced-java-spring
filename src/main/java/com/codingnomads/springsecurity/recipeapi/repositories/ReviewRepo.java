/* CodingNomads (C)2024 */
package com.codingnomads.springsecurity.recipeapi.repositories;

import com.codingnomads.springsecurity.recipeapi.models.Review;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {

    List<Review> findByUser_Username(String username);
}