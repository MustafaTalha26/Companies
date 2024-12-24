package com.example.demo.Controller;

import com.example.demo.Entity.Company;
import com.example.demo.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping(value = "/country={country},limit={limit}")
    public List<Company> findByCountry(@PathVariable String country, @PathVariable int limit) {
        return companyRepository.searchCompanyByCountryWithLimit(limit, country);
    }

    @PostMapping(value = "/name={name},limit={limit}")
    public List<Company> findByName(@PathVariable String name, @PathVariable int limit) {
        return companyRepository.searchCompanyByNameWithLimit(limit, name);
    }

    @GetMapping(value = "/companies")
    public List<Company> getCompanies() {
        return companyRepository.getCompanies();
    }

    @PostMapping(value = "/companysave")
    public String saveCompanyInDatabase(@RequestBody Company company) {
        companyRepository.save(company);
        return "Succesful";
    }

    @PostMapping(value = "/companydelete")
    public String deleteCompanyInDatabase(@RequestBody long companyId) {
        companyRepository.deleteById(companyId);
        return "Succesful";
    }
}
