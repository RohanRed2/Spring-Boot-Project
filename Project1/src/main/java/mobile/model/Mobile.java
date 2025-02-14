package mobile.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="MobileTable")
@Entity
public class Mobile {
	
	@Id
	private int imeiNumber;
	private String make;
	private int ramsize;
	private int storage;
	private int expandedStorage;
	public int getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(int imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getRamsize() {
		return ramsize;
	}
	public void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getExpandedStorage() {
		return expandedStorage;
	}
	public void setExpandedStorage(int expandedStorage) {
		this.expandedStorage = expandedStorage;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public Mobile(int imeiNumber, String make, int ramsize, int storage, int expandedStorage) {
		super();
		this.imeiNumber = imeiNumber;
		this.make = make;
		this.ramsize = ramsize;
		this.storage = storage;
		this.expandedStorage = expandedStorage;
	}
	@Override
	public String toString() {
		return "Mobile [imeiNumber=" + imeiNumber + ", make=" + make + ", ramsize=" + ramsize + ", storage=" + storage
				+ ", expandedStorage=" + expandedStorage + "]";
	}
	
	

}
