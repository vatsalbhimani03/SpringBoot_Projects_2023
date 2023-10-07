package com.example.guestregistration.api;

import com.example.guestregistration.entity.Guest;
import com.example.guestregistration.repo.GuestRepo;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class GuestAPI {
    private final GuestRepo repo;

    public GuestAPI(GuestRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/api/guest")
    public Guest createGuest(@RequestBody Guest guest) {
        guest.setCreateDate(new Date());
        guest.setUpdateDate(new Date());
        System.out.println("Record Added Successfully");
        return repo.save(guest);
    }

    @GetMapping("/api/guest")
    public List<Guest> getAll(){
        return repo.findAll();
    }

    @GetMapping("/api/guest/{id}")
    public Optional<Guest> getOneById(@PathVariable int id){
        System.out.println("Record found Successfully with ID "+id);
        return repo.findById(id);
    }

    @DeleteMapping("api/guest/{id}")
    public String deleteOneById(@PathVariable int id){
        repo.deleteById(id);
        return "Record Deleted Successfully";
    }

//    @PutMapping("api/guest/{id}/firstName:{guest.getFirstName()}")
//    public Guest updateGuest(@PathVariable int id, @RequestBody Guest guest){
//        repo.findById(id);
////        guest.setFirstName(guest.getFirstName());
////        guest.setEmail(guest.getEmail());
//        return repo.save(guest);
//    }



}

