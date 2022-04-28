package Assignment30;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Invoice {
    public int rideCount;
    public int totalFare;
    public double avgFare;

    public Invoice(int rideCount, int totalFare, double avgFare){
        super();
        this.rideCount = rideCount;
        this.totalFare = totalFare;
        this.avgFare = avgFare;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Invoice other = (Invoice) obj;
        return Double.doubleToLongBits(avgFare) == Double.doubleToLongBits(other.avgFare)
                && rideCount == other.rideCount
                && Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
    }

    @Override
    public String toString(){
        return "Invoice rideCount: " +rideCount+ " totalFare: " +totalFare+ " avgFare: " +avgFare;
    }
}

class Ride{
    public double distance;
    public double time;
    public String category;

    public double distancePrice;
    public double timePrice;

    public Ride(double distance, double time, String category){
        super();
        this.distance = distance;
        this.time = time;

        switch(category){
            case "premium":
                this.distancePrice = 15;
                this.timePrice = 2;
                break;
            default:
                this.distancePrice = 10;
                this.timePrice = 1;
        }
    }
}

class RideRepository{
    HashMap<Integer, Ride[]> rideRepo = new HashMap<Integer, Ride[]>();

    public HashMap<Integer, Ride[]> getRideRepo(){
        return rideRepo;
    }
}

class InvoiceGenerator {
    public double generateInvoice(Ride ride) {
        double fare = (ride.distancePrice * ride.distance) + (ride.timePrice * ride.time);
        return fare > 5 ? fare : 5;
    }

    public Invoice generateInvoice(Ride[] rides) {
        double singleFare;
        double totalFare = 0;
        for (Ride ride : rides) {
            singleFare = generateInvoice(ride);
            totalFare += singleFare > 5 ? singleFare : 5;
        }

        Invoice invoice = new Invoice(rides.length, (int) totalFare, totalFare / rides.length);
        System.out.println(invoice);
        return invoice;
    }

    public Invoice generateInvoice(int i, HashMap<Integer, Ride[]> rideRepo) {
        for (Map.Entry<Integer, Ride[]> rideEntry : rideRepo.entrySet()) {
            if (rideEntry.getKey() == i)
                return generateInvoice(rideEntry.getValue());
        }
        return null;
    }
}


