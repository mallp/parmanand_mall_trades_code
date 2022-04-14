/**
 * 
 */
package com.interview.barclays.traders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interview.barclays.traders.entity.TradesEntity;
import com.interview.barclays.traders.entity.TradesEntityPK;

/**
 * @author P N MALL
 *
 */
@Repository
public interface TradesRepository extends JpaRepository<TradesEntity, TradesEntityPK> {

}
