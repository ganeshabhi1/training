package com.example.demo.been;

public class Task {
private int ownerId;
	
	private String name;
	private String description;
	private String status;
	private String priority;
	private String notes;
	private String isBookmarked;
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getIsBookmarked() {
		return isBookmarked;
	}
	public void setIsBookmarked(String isBookmarked) {
		this.isBookmarked = isBookmarked;
	}
	@Override
	public String toString() {
		return "Task [ownerId=" + ownerId + ", name=" + name + ", description=" + description + ", status=" + status
				+ ", priority=" + priority + ", notes=" + notes + ", isBookmarked=" + isBookmarked + "]";
	}

}
