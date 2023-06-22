package com.vaccinePortal.service;

import java.util.List;
import java.util.Map;

import com.vaccinePortal.dto.HospitalDTO;

public interface HospitalService {

	List<HospitalDTO> getAllHospitals() throws Exception;

	HospitalDTO addHospital(HospitalDTO hospitalDTO);

	HospitalDTO addVaccinesToHospitals(HospitalDTO hospitalDTO, Map<String,Integer> vaccines) throws Exception;

}
