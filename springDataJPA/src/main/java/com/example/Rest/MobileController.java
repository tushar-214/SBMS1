package com.example.Rest;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Mobile;
import com.example.service.mobileService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MobileController {

	@Autowired
	private mobileService ms;

	@PostMapping("/addmobile")
	public ResponseEntity<String> saveMobileData(@RequestBody Mobile mb) {
		String msg = ms.addMobile(mb);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}

	@GetMapping("/getdata")
	public ResponseEntity<List<Mobile>> getMobileData() {
		List<Mobile> mobiledata = ms.getMobileData();
		return new ResponseEntity<>(mobiledata, HttpStatus.OK);

	}

	@GetMapping("/mobilegetByid/{id}")
	public ResponseEntity<List<Mobile>> getByid(@PathVariable("id") Integer id) {
		Mobile mobiledata = ms.getMobileById(id); // Assuming this returns a single Mobile object
		if (mobiledata != null) {
			return new ResponseEntity<>(List.of(mobiledata), HttpStatus.OK); // Wrap the object in a list
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if no data is found
		}
	}

	@DeleteMapping("/deletebyId/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer id) {
		String msg = ms.deleteByid(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@PutMapping("/updatebyid/{id}")
	ResponseEntity<String> updateById(@PathVariable("id") Integer id, @RequestBody Mobile mb) {
		String msg = ms.updatedbyId(id, mb);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
