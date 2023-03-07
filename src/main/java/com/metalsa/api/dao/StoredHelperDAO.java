package com.metalsa.api.dao;

import org.springframework.data.jpa.repository.Query;

public interface StoredHelperDAO {

    @Query(value = "select seq_general_kronos.nextval from dual", nativeQuery = true)
    Long getNextSectorNumber();
}
