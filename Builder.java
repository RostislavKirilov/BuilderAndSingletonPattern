class RealEstate {
    private String type;
    private double area;
    private double price;
    private int numberOfRooms;
    private boolean furnished;
    private boolean hasGarage;
    private boolean hasParkingSpace;

    public static class Builder {
        private String type;
        private double area;
        private double price;
        private int numberOfRooms;
        private boolean furnished;
        private boolean hasGarage;
        private boolean hasParkingSpace;

        public Builder(String type, double area, double price) {
            this.type = type;
            this.area = area;
            this.price = price;
        }

        public Builder setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public Builder setFurnished(boolean furnished) {
            this.furnished = furnished;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setHasParkingSpace(boolean hasParkingSpace) {
            this.hasParkingSpace = hasParkingSpace;
            return this;
        }

        public RealEstate build() {
            RealEstate realEstate = new RealEstate();
            realEstate.type = this.type;
            realEstate.area = this.area;
            realEstate.price = this.price;
            realEstate.numberOfRooms = this.numberOfRooms;
            realEstate.furnished = this.furnished;
            realEstate.hasGarage = this.hasGarage;
            realEstate.hasParkingSpace = this.hasParkingSpace;
            return realEstate;
        }
    }

    private RealEstate() {
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasParkingSpace() {
        return hasParkingSpace;
    }
}