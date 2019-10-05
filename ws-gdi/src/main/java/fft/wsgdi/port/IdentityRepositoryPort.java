package fft.wsgdi.port;

import model.Identity;

public interface IdentityRepositoryPort {

	void create(String name);
	
	Identity getIdentity(Integer userId);
	
}
