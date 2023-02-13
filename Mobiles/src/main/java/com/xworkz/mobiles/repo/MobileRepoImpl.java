package com.xworkz.mobiles.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.mobiles.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("HospitalProperties");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public String save(MobileDto dto) {

		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return "i am repo data saved successfull";

		}
		
		return null;
	}

	@Override
	public List<MobileDto> readAll() {
if(em!=null)
{
	//em.getTransaction().begin();
	Query query = em.createNamedQuery("readAll",MobileDto.class);
	List<MobileDto> list = query.getResultList();
	return list;
}
		
		return null;
	}

}
