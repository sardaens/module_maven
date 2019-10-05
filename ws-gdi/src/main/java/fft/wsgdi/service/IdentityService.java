package fft.wsgdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fft.wsgdi.port.IdentityRepositoryPort;
import fft.wsgdi.exception.NotFoundException;
import model.Identity;

@Service
public class IdentityService {

	@Autowired
	private IdentityRepositoryPort identityRepository;
	
	public void create(String name){
		
		// ?? RG n1
		identityRepository.create(name);
    }
	
	public Identity view(Integer userId) throws NotFoundException{
		Identity e= identityRepository.getIdentity(userId);
		if (e== null)
			throw new NotFoundException("Identity " + userId + " not found");
		return e;
	}
	
}
