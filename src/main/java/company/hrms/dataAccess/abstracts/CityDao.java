package company.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City , Integer> {

}
