package com.vaccinePortal.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "vaccine")
@Getter
@Setter
@ToString(exclude ="vaccineStock")
public class Vaccine extends BaseEntity{
	@Column()
	private String name;
	@Column()
	private Integer minAge;
	@Column()
	private Integer maxAge;
	@Column(length=1)
	private String gender;
	@Column
	private String disease;
	@OneToMany(mappedBy="vaccine",fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private Set<VaccineStock> vaccineStock;
}
