package com.vgrigoriev.services;

import com.vgrigoriev.dao.TruckDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * author vgrigoriev on 14.08.2015.
 */
@Service
@Transactional
public class TruckService {

    @Autowired
    private TruckDao truckDao;





}
