package mobile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mobile.model.Mobile;

@Repository
public interface MobileDAO extends JpaRepository<Mobile, Integer> {

}
