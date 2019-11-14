package dev.ned.web;

import dev.ned.domain.Hotel;
import dev.ned.persistence.HotelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotels")
        public List<Hotel> getHotels() {
        return this.hotelRepository.findAll();
    }

}
