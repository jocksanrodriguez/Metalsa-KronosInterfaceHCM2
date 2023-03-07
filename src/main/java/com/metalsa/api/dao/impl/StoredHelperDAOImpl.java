package com.metalsa.api.dao.impl;

import com.metalsa.api.dao.StoredHelperDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;

@Repository
public class StoredHelperDAOImpl implements StoredHelperDAO {

    @PersistenceContext
    protected EntityManager entityManager;
    @Override
    public Long getNextSectorNumber() {
        try {
            Query q = entityManager.createNativeQuery("select seq_general_kronos.nextval from dual");
            BigDecimal numberSeq = (BigDecimal) q.getSingleResult();

            return new Long(numberSeq.toString());

        }catch(Exception e) {
            e.printStackTrace();
            return (long) -1;
        }
    }
}
