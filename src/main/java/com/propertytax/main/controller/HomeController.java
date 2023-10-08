package com.propertytax.main.controller;

import java.math.BigDecimal;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.propertytax.main.dto.PropertyTaxDto;
import com.propertytax.main.repository.PropertyDescriptionRepository;
import com.propertytax.main.repository.ZoneRepository;
import com.propertytax.main.service.PropertyTaxService;

@Controller
@RequestMapping("/propertytax")
public class HomeController {

	@Autowired
	private PropertyTaxService propertyTaxService;

	@Autowired
	private ZoneRepository zoneRepository;

	@Autowired
	private PropertyDescriptionRepository propertyDescriptionRepository;

	@GetMapping("/home")
	public String getLogin(Model model) {
		model.addAttribute("msg", "");
		return "Home";
	}

	@PostMapping("/taxcalculate")
	public String calculateTax(PropertyTaxDto propertyTaxDto, Model model) {
		propertyTaxService.saveTaxDetails(propertyTaxDto);
		model.addAttribute("msg", "Tax details added successfully");
		return "Home";
	}

	@GetMapping("/taxcalculate")
	public String gettaxCalculate(Model model) {
		model.addAttribute("propertyTax", new PropertyTaxDto());
		model.addAttribute("zone", zoneRepository.findAll());
		model.addAttribute("propertyDescription", propertyDescriptionRepository.findAll());
		// model.addAttribute("");
		return "TaxCalculate";
	}

	@GetMapping("/report")
	public String taxReport(Model model) {
		model.addAttribute("report", propertyTaxService.getZoneWiseTaxReport());
		return "Report";
	}

	@GetMapping("/taxcalculate/{zoneId}/{status}")
	public ResponseEntity<BigDecimal> gettaxCalculate(@PathParam("assessmentYear") String assessmentYear,
			@PathParam("constructedYear") String constructedYear, @PathParam("description") Integer description,
			@PathParam("area") String area, @PathVariable("zoneId") Integer zoneId,
			@PathVariable("status") String status) {
		BigDecimal taxAmount = propertyTaxService.getCalculatedTax(zoneId, description, status, constructedYear,
				assessmentYear, area);
		return new ResponseEntity<BigDecimal>(taxAmount, HttpStatus.OK);
	}

}
