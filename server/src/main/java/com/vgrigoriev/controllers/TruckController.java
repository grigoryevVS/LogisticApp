package com.vgrigoriev.controllers;

import com.vgrigoriev.services.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author vgrigoriev on 17.08.2015.
 */
@Controller
@RequestMapping("/trucks")
public class TruckController {


    @Autowired
    private TruckService truckService;


    @RequestMapping("/allTrucks")
    public String truckList(Model model) {




        return "trucks/allTrucks";
    }





    public TruckService getTruckService() {
        return truckService;
    }

    public void setTruckService(TruckService truckService) {
        this.truckService = truckService;
    }
}
