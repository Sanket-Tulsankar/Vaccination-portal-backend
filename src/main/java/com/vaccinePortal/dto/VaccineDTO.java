package com.vaccinePortal.dto;

import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vaccinePortal.entities.VaccineStock;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VaccineDTO {
	// n de-serialized
	private Long id;
	@NotBlank(message = " name must be supplied")
	private String name;
	@Min(0)
	private Integer minAge;
	@Min(0)
	private Integer maxAge;
	@NotBlank
	@Pattern(regexp = "^M|F$",message = "Please provide valid gender")
	private String gender;
	@NotBlank
	private String disease;
	private boolean isEligible;
	@JsonIgnore
	private Set<VaccineStock> vaccineStock;
}
