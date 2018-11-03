package lotnisko;

 /** The code prints date and time of take off,
  * hour of arrival at a place, 
  * flight duration, return date 
  * and number of days between the date 
  * of departure and return.*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.HOURS;

public class AirportDateTime {
	private LocalDate takeoffDate;
	private LocalTime takeoffHour;
	private LocalDateTime takeoffTime = null;
	private LocalTime arrivalHour;
	private LocalDate returnDate = null;

	public AirportDateTime(final LocalDate td, final LocalTime th) {
		this.takeoffDate = td;
		this.takeoffHour = th;
	}

	public AirportDateTime(final LocalDateTime tot, final LocalTime arh, final LocalDate rd) {
		this.takeoffTime = tot;
		this.arrivalHour = arh;
		this.returnDate = rd;
	}

	public AirportDateTime(final LocalDate td, final LocalTime th, final LocalDateTime tot, final LocalTime arh,
			final LocalDate rd) {
		this(td, th);
		this.takeoffTime = tot;
		this.arrivalHour = arh;
		this.returnDate = rd;
	}

	public LocalDate getTakeoffDate() {
		return takeoffDate;
	}

	public LocalTime getTakeoffHour() {
		return takeoffHour;
	}

	public LocalDateTime getTakeoffTime() {
		return takeoffTime;
	}

	public LocalTime getArrivalHour() {
		return arrivalHour;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public static void main(String[] args) {
		LocalDate tod = LocalDate.of(2018, 10, 23);
		LocalTime tohr = LocalTime.of(13, 05);
		AirportDateTime toffdh = new AirportDateTime(tod, tohr);
		System.out.println("Takeoff day: " + toffdh.getTakeoffDate());
		System.out.println("Takeoff at hour: " + toffdh.getTakeoffHour());

		LocalDateTime toff = LocalDateTime.of(2018, 10, 23, 13, 05, 00);
		LocalTime arrhr = tohr.plusHours(4); // flight takes 4 hours 
		LocalDate retd = tod.plusDays(3); // back in 3 days 
		AirportDateTime toffarr = new AirportDateTime(toff, arrhr, retd);
		System.out.println("Day and hour: " + toffarr.getTakeoffTime());
		System.out.println("Hour of arrival at the place: " + toffarr.getArrivalHour());
		
		System.out.println("Flight duration in minutes: " + tohr.until(arrhr, MINUTES));
		System.out.println("Flight duration in hours: " + tohr.until(arrhr, HOURS));
		
		System.out.println("Return date: " + toffarr.getReturnDate());
		Period days = Period.between(tod, retd);
		System.out.println("Days between takeoff and return: " + days.getDays());
	}
}
