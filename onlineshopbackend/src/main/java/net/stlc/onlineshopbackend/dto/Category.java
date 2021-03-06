package net.stlc.onlineshopbackend.dto;

public class Category {
 /* 
  * private fields */
	private int id;
	private String name;
	private String description;
	private String imgageURL;
	private boolean active = true;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the imgageURL
	 */
	public String getImgageURL() {
		return imgageURL;
	}
	/**
	 * @param imgageURL the imgageURL to set
	 */
	public void setImgageURL(String imgageURL) {
		this.imgageURL = imgageURL;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
