package com.vaccinePortal.entities;

import java.util.HashSet;
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
@Table(name = "hospitals")
@Getter
@Setter
@ToString(exclude ="vaccineStocks")
public class Hospital extends BaseEntity{
	@Column()
	private String name;
	@Column()
	private String address;
	@Column()
	private String phoneNumber;
	@OneToMany(mappedBy="hospital",fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private Set<VaccineStock> vaccineStocks;
	
	@OneToMany(mappedBy="hospital",fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private Set<VaccineBooking> bookings = new HashSet<>();
	
}
