import java.util.ArrayList;
import java.util.List;

public class SIngleton {
    private String name;
    private String address;
    private List<RealEstate> realEstates = new ArrayList<>();

    private static SIngleton instance = null;

    private SIngleton() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static SIngleton getInstance() {
        if (instance == null) {
            instance = new SIngleton();
        }
        return instance;
    }

    public void addRealEstate(RealEstate realEstate) {
        realEstates.add(realEstate);
    }

    public void removeRealEstate(RealEstate realEstate) {
        realEstates.remove(realEstate);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

}
