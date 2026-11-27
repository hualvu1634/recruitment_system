package huan.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import huan.backend.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
