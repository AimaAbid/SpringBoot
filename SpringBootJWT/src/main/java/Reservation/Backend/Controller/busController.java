package Reservation.Backend.Controller;


import Reservation.Backend.model.busmodel;

import Reservation.Backend.services.implementor.busimp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class busController
{
    @Autowired
    busimp imp;

    @PostMapping("/addbus")
    public String add(@RequestBody busmodel bus)
    {
       imp.addbuss(bus);
        return "Bus added successfully";
    }


    @GetMapping("/getbus")
    public List<busmodel> get(){
        return imp.getbuss();
    }

}
