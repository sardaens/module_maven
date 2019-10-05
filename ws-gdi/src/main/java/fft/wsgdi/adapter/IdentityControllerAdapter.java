package fft.wsgdi.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fft.wsgdi.exception.NotFoundException;
import fft.wsgdi.port.IdentityUIPort;
import fft.wsgdi.service.IdentityService;
import model.Identity;

@RestController
@RequestMapping("/identity/")
public class IdentityControllerAdapter implements IdentityUIPort{
    @Autowired
    private IdentityService identityService;

    @Override
	public void create(@RequestBody Identity request) {
		identityService.create(request.getName());
		
	}

    @Override
	public Identity view(Integer id) throws NotFoundException {
        Identity identity = identityService.view(id);
        return identity;
	}
   
}

