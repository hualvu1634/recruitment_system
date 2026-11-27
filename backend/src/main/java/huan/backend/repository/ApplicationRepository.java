package huan.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import huan.backend.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
