package com.spring.Computer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Computer.model.Computer;
import com.spring.Computer.service.ComputerService;


import io.swagger.v3.oas.annotations.tags.Tag;





@RestController
public class ComputerController {
@Autowired
	ComputerService comService;
	@Tag(name="Get",description="get data")
	@GetMapping(value="fetchDetails") 
	public List<Computer> getAllDetails(){
	List<Computer> comList=comService.getAllDetails();
		return comList;
	}
	@PostMapping(value="/saveDetails")
	public   Computer saveDetails(@RequestBody Computer s)
	{
		return comService.saveComputers(s);
	}
	@PutMapping(value="/updateDetails")
	public Computer updateComputer(@RequestBody Computer s)
	{
		return comService.saveComputers(s);
	}
	@DeleteMapping(value="/deleteDetails/{rno}")
	public void deleteComputer(@PathVariable("rno") int sNo) {
		comService.deleteComputer(sNo);
	}
	@GetMapping(value="/getComputer/{rno}")
	public Computer getComputer(@PathVariable("rno") int sNo) {
		return comService.getComputer(sNo);
	}
	@GetMapping("/sortComputer/{field}")
	 public List<Computer>sortComputer(@PathVariable String field) 
	 {
		 return comService.sortComputer(field);
		 
	 }
	 
	 //paging
	 @GetMapping("/pagingComputers/{offset}/{pageSize}")
	 public List<Computer>pagingComputer(@PathVariable int offset,@PathVariable int pageSize) 
	 {
		 return comService.PagingComputer(offset,pageSize);
	 }
	 
	 //paging&&sorting
	
	 @GetMapping("/pagingSortingComputer/{offset}/{pageSize}/{field}")
	  public List<Computer>pagingSortingComputer(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
	  {
		 return comService.pagingSortingComputer(offset,pageSize,field);
	  }
	 
	 @GetMapping("/getComputerByBrand/{brand}")
	 public List<Computer>getComputerByBrand(@PathVariable String brand) {
		 List<Computer> comList=comService.getComputerByBrand(brand);
		 return comList;
	 }
	 
	 @DeleteMapping("/deleteComputerByBrand/{brand}")
	 public String deleteStudentByName(@PathVariable String brand) {
		 int result=comService.deleteComputerByBrand(brand);
		 if(result>0)
			 return "Student record deleted";
		 else
			 return "Problem occured while deleting";
	 }
	 @PutMapping("/updateComputerByBrand/{brand}/{price}")
	 public String updateComputerByBrand(@PathVariable String brand,@PathVariable String price) {
	 
		 int result=comService.UpdateComputerByBrand(brand,price);
		 if(result>0)
			 return "Computer record updated";
		 else
			 return "Problem occured while updating";
	 }
}