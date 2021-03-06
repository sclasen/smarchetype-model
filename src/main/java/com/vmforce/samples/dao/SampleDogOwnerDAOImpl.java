package com.vmforce.samples.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.vmforce.samples.entity.SampleDogOwner;

public class SampleDogOwnerDAOImpl extends JpaDaoSupport implements SampleDogOwnerDAO {

	@Override
	public List<SampleDogOwner> getAllDogOwners() {
		return (List<SampleDogOwner>) getJpaTemplate().find("SELECT FROM SampleDogOwner sc");
	}

}
