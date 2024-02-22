package com.api.repository;

import com.api.entitites.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimeRepository extends JpaRepository<ShowTime , String> {
}
