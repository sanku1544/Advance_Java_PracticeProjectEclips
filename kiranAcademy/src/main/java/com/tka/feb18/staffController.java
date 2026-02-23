package com.tka.feb18;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class staffController {

	@Autowired
	StaffService ss;

	// 1st task
	@GetMapping("/getAllStaff")
	public List<Staff> getAllStaff() {
		return ss.getAllStaff();
	}

	// 2nd task
	@GetMapping("getStaff/{id}")
	public Staff m1(@PathVariable int id) {
		return ss.getStaff(id);
	}

	// 3rd task
	@PostMapping("add-staff")
	public String addStaff(@RequestBody Staff s) {
		return ss.addStaff(s);
	}

	// 4th task
	@GetMapping("more-than/{sal}")
	public List<Staff> getBySalary(@PathVariable int sal) {
		return ss.getBySalary(sal);
	}

	// 5th task
	@GetMapping("between/{start}/{end}")
	public List<Staff> getListBaseOnExp(@PathVariable int start, @PathVariable int end) {
		return ss.getListBaseOnExp(start, end);
	}

	// 6th task
	@GetMapping("get-highsal-staff")
	public List<Staff> getHighSalaryStaff() {
		return ss.getHighSalaryStaff();
	}

	// 7th task
	@PutMapping("update-staff")
	public String updateStaff(@RequestBody Staff s) {
		return ss.updateStaff(s);
	}

	// 8th task
	@GetMapping("get-staff-minExp")
	public String getStaffMinExp() {
		return ss.getStaffMinExp();
	}

	// 9th task
	@GetMapping("get-by-profile/{profile}")
	public List<Staff> getByProfile(@PathVariable String profile) {
		return ss.getByProfile(profile);
	}

	// 10th task
	@GetMapping("get-not-profile/{profile}")
	public List<Staff> getByNotProfile(@PathVariable String profile) {
		return ss.getByNotProfile(profile);
	}
	
	@DeleteMapping("delete-staff/{id}")
	public String deleteStaff(@PathVariable int id) {
		return ss.deleteStaff(id);
	}

}
