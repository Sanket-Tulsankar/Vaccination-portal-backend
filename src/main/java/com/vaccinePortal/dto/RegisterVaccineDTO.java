package com.vaccinePortal.dto;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterVaccineDTO {
	private HospitalDTO hospital;
	
	private Map<String,Integer> vaccines;

}
