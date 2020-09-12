package com.otx.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "routes")
public class Route {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "route_id")
	private Long routeId;
	//private int userId;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name = "starting_point")
	private String startingPoint;
	@Column(name="destination")
	private String destination;
	@Column(name="stops")
	private String stops;
	public Long getRouteId() {
		return routeId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStops() {
		return stops;
	}
	public void setStops(String stops) {
		this.stops = stops;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", user=" + user + ", startingPoint=" + startingPoint + ", destination="
				+ destination + ", stops=" + stops + "]";
	}
	
	
}
