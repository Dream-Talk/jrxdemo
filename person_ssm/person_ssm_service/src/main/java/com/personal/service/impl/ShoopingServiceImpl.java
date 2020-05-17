package com.personal.service.impl;

import com.personal.dao.IShoopingDao;
import com.personal.domain.Product;
import com.personal.domain.Shooping;
import com.personal.service.IShoopingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShoopingServiceImpl implements IShoopingService{

    @Autowired
    private IShoopingDao shoopingDao;
    @Override
    public List<Shooping> findAll() throws Exception {
        return shoopingDao.findAll();
    }

    @Override
    public void save(Shooping shooping) throws Exception {
        shoopingDao.save(shooping);

    }

    @Override
    public void delete(String orderId) throws Exception {
        shoopingDao.delete(orderId);

    }
}
