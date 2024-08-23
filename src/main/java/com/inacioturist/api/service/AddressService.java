package com.inacioturist.api.service;


import com.inacioturist.api.domain.address.Address;
import com.inacioturist.api.domain.event.Event;
import com.inacioturist.api.domain.event.EventRequestDTO;
import com.inacioturist.api.entities.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event) {

        Address address = new Address();

        address.setCity(data.city());
        address.setUf(data.state());
        address.setEvent(event);

        return addressRepository.save(address);
    }

}
