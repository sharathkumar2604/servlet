package com.xworkz.hospital.repo;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.hospital.dto.HospitalDto;

public class HospitalRepoImpl implements HospitalRepo {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("HospitalProperties");
	EntityManager em = emf.createEntityManager();

	@Override
	public String save(HospitalDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return "i am repo";

		}
		return null;

	}

//	@Override
//	public List<HospitalDto> readAll() {
//if(em!=null)
//{
//	em.getTransaction().begin();
//	Query query = em.createNamedQuery("readAll",HospitalDto.class);
//	em.getTransaction().commit();
//	return query.getResultList();
//}
//		
//		return null;
//	}

}
