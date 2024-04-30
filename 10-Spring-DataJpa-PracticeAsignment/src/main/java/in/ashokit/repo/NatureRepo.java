package in.ashokit.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Nature;
import jakarta.transaction.Transactional;

public interface NatureRepo extends JpaRepository<Nature, Integer> {

//	insert operation using custom query
	
//	    @Transactional
//	    @Modifying
//	    @Query(value = "INSERT INTO Nature (nature_id, chain, city, area_name) VALUES (:natureId, :chain, :city, :areaName)", nativeQuery = true)
//	    void insertData(Integer natureId, String chain, String city, String areaName);
	    
//	    update operation
	    
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value =
	 * "update nature set chain = :chain , city = :city , area_name =:areaName where nature_id = :natureId"
	 * , nativeQuery = true) public void updateData(Integer natureId , String chain,
	 * String city, String areaName);
	 */
	
	@Transactional
	@Modifying
	@Query(value = "DELETE from nature WHERE nature_id = :natureId", nativeQuery = true)
	public void deleteData(Integer natureId);
	
}
