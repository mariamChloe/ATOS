package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Address;
import ci.digitalacademy.monetab.repositories.AddressRepository;
import ci.digitalacademy.monetab.services.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public  interface AddressService {


    AddressDTO save(AddressDTO addressDTO);

    Optional<AddressDTO> findOne(Long id);

    List<AddressDTO> findAll();

    AddressDTO update(Address address);

    AddressDTO update(AddressDTO addressDTO) throws IllegalAccessException;
}
