package com.vivek.SpringBootREST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController can be used instead of @Controller to avoid using @ResponseBody on every method
@Controller
public class HomeController {
	
	@Autowired
	AnimalRepo repo;
	
	@GetMapping("animal")
	@ResponseBody
	public List<Animal> getAnimals() {
		List<Animal> list = repo.findAll();
		return list;
	}
	
	@GetMapping(path="animal1",produces="application/json")//When you mention produces="application/json", the app provides only json files even when requested for xml files. We can also use produces="application/xml" depenging on the requirement
	@ResponseBody
	public List<Animal> getAnimals1() {
		List<Animal> list = repo.findAll();
		return list;
	}
	
	@PostMapping("animal")
	@ResponseBody
	public Animal addAnimal(Animal ani) {
		repo.save(ani);
		return ani;
	}
	
	@PostMapping("animal1")
	@ResponseBody
	public Animal addAnimal1(@RequestBody Animal ani) {//@RequestBody is necessary when you are sending data to database using postman without Body form-data
		repo.save(ani);
		return ani;
	}
	
	@PostMapping(path="animal2",consumes={MediaType.APPLICATION_JSON_VALUE})//Accepts only JSON format data. We can also use "application/json" instead of {MediaType.APPLICATION_JSON_VALUE}
	@ResponseBody
	public Animal addAnimal2(@RequestBody Animal ani) {//@RequestBody is necessary when you are sending data to database using postman without Body form-data
		repo.save(ani);
		return ani;
	}
	
	@GetMapping("animal/{id}")
	@ResponseBody
	public Optional<Animal> getAnimalById(@PathVariable int id){
		Optional<Animal> list = repo.findById(id);
		return list;
	}
	
	


}
