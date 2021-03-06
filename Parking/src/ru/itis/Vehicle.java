package ru.itis;

public abstract class Vehicle {
    protected ParkingPlace parkingPlace;
    protected String name;
    protected int fuelPerKm;

    Vehicle(String name, int fuelPerKm){
        this.name = name;
        this.fuelPerKm = fuelPerKm;
    }

    void setParkingPlace(ParkingPlace parkingPlace) {
        if (parkingPlace != null) {
            this.parkingPlace = parkingPlace;
        }
    }

    void driveIn(ParkingPlace parkingPlace){
        parkingPlace.letIn(this);
        if (this.in(parkingPlace)){
            setParkingPlace(parkingPlace);
            this.parkingPlace = parkingPlace;
        }
    }

    boolean in(ParkingPlace parkingPlace){
        Vehicle[] vehicles = parkingPlace.getVehicles();
        for(Vehicle vehicle : vehicles){
            if (this.equals(vehicle)){
                return true;
            }
        }
        return false;
    }

    void driveOut(){
        if (parkingPlace != null) {
            parkingPlace.letOut(this);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
