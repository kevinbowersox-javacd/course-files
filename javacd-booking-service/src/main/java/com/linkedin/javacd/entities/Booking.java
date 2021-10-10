package com.linkedin.javacd.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOKING_ID")
	private Long bookingId;

	@Column(name = "GUEST_ID")
	private Long guestId;

	@Column(name = "ROOM_ID")
	private Long roomId;

	@Column(name = "START_DATE")
	private Instant startDate;

	@Column(name = "END_DATE")
	private Instant endDate;

	public Booking() {

	}

	public Booking(Long guestId, Long roomId, Instant startDate, Instant endDate) {
		this.guestId = guestId;
		this.roomId = roomId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Instant getStartDate() {
		return startDate;
	}

	public void setStartDate(Instant startDate) {
		this.startDate = startDate;
	}

	public Instant getEndDate() {
		return endDate;
	}

	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}

}
