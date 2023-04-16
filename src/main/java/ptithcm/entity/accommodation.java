package ptithcm.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="accommodation")
public class accommodation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private boolean status;
	private boolean air_condittioner;
	private boolean cabletv;
	private boolean heater; 
	private boolean internet; 
	private boolean parking; 
	private float water_price; 
	private float electrict_pricce; 
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "post_id")
	private post post;
	
	public accommodation() {
		super();
	}
	
	public accommodation(int id, String address, boolean air_condittioner, boolean cabletv,boolean heater, boolean internet, boolean parking, boolean status, float electrict_price, float water_price, post post) {
		super();
		this.id = id;
		this.address = address;
		this.status = status;
		this.air_condittioner = air_condittioner;
		this.cabletv = cabletv;
		this.heater = heater;
		this.internet = internet;
		this.parking = parking;
		this.water_price = water_price;
		this.electrict_pricce = electrict_price;
		this.post = post;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isAir_condittioner() {
		return air_condittioner;
	}

	public void setAir_condittioner(boolean air_condittioner) {
		this.air_condittioner = air_condittioner;
	}

	public boolean isCabletv() {
		return cabletv;
	}

	public void setCabletv(boolean cabletv) {
		this.cabletv = cabletv;
	}

	public boolean isHeater() {
		return heater;
	}

	public void setHeater(boolean heater) {
		this.heater = heater;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public float getWater_price() {
		return water_price;
	}

	public void setWater_price(float water_price) {
		this.water_price = water_price;
	}

	public float getElectrict_pricce() {
		return electrict_pricce;
	}

	public void setElectrict_pricce(float electrict_pricce) {
		this.electrict_pricce = electrict_pricce;
	}

	public post getPost() {
		return post;
	}

	public void setPost(post post) {
		this.post = post;
	}
	
}
