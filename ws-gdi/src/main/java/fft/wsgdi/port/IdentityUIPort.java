package fft.wsgdi.port;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fft.wsgdi.exception.NotFoundException;
import model.Identity;

public interface IdentityUIPort {
	
	@PostMapping("create")
    public void create(@RequestBody Identity request);
	
    @GetMapping("view/{id}")
    public Identity view(@PathVariable Integer id) throws NotFoundException;

}
