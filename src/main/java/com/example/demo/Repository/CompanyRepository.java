package com.example.demo.Repository;

import com.example.demo.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    @Query(value = "SELECT * FROM public.companies WHERE companies.country ILIKE %?2% LIMIT ?1", nativeQuery = true)
    List<Company> searchCompanyByCountryWithLimit(int number,String text);

    @Query(value = "SELECT * FROM public.companies WHERE companies.name ILIKE %?2% LIMIT ?1", nativeQuery = true)
    List<Company> searchCompanyByNameWithLimit(int number,String text);

    @Query(value = "SELECT * FROM public.companies ORDER BY id ASC LIMIT 10", nativeQuery = true)
    List<Company> getCompanies();


}
