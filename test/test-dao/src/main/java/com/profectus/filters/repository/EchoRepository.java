/**
 * 
 */
package com.profectus.filters.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profectus.filters.repository.entity.EchoEntity;

/**
 * @author Dell
 *
 */
@Repository
public interface EchoRepository extends JpaRepository<EchoEntity, Long> {
	List<EchoEntity> findByName(String name);
	/*List<EchoEntity> getAll();	*/
}
