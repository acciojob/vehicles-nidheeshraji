package com.driver;

public interface WaterVehicle {
    public String getVehicleName();

    public int getVehicleCapacity();
    public class Boat implements WaterVehicle {

        private String name;
        private int capacity;

        public Boat() {
            this.name = "name";
            this.capacity = 0;
        }

        @Override
        public String getVehicleName() {
            return this.name;
        }

        @Override
        public int getVehicleCapacity() {
            return this.capacity;
        }
    }


}


