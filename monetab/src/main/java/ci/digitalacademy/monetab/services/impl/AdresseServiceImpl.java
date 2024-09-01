/*package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Address;
import ci.digitalacademy.monetab.repositories.AddressRepository;
import ci.digitalacademy.monetab.services.AddressService;
import ci.digitalacademy.monetab.services.dto.AddressDTO;
import ci.digitalacademy.monetab.services.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdresseServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    @Override
    public AddressDTO save(AddressDTO addressDTO) {
        // Convert AddressDTO to Address entity
        Address address = addressMapper.toEntity(addressDTO);
        // Save the Address entity to the database
        Address savedAddress = addressRepository.save(address);
        // Convert the saved Address entity back to AddressDTO
        return addressMapper.toDto(savedAddress);
    }

    @Override
    public Optional<AddressDTO> findOne(Long id) {
        return addressRepository.findById(id)
                .map(addressMapper::toDto); // Use AddressMapper to convert to DTO
    }

    @Override
    public List<AddressDTO> findAll() {
        return addressRepository.findAll().stream()
                .map(addressMapper::toDto) // Convert each Address entity to DTO
                .toList(); // Convert stream to list
    }

    @Override
    public AddressDTO update(Address address) {
        return null;
    }

    @Override
    public AddressDTO update(AddressDTO addressDTO) throws IllegalAccessException {
        // Find existing address
        Address address = addressRepository.findById(addressDTO.getId())
                .orElseThrow(IllegalAccessException::new);

        // Update fields
        address.setCountry(addressDTO.getCountry());
        address.setCity(addressDTO.getCity());

        // Save updated address
        Address updatedAddress = addressRepository.save(address);

        // Convert updated Address entity to DTO
        return addressMapper.toDto(updatedAddress);
    }
}
*/