package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {
    private List<Cleanable> buildings = new ArrayList<>();

    public void add(Cleanable cleanable) {
        buildings.add(cleanable);
    }


    public List<Cleanable> getCleanables() {
        return new ArrayList<>(buildings);
    }

    public int cleanAll() {
        int result = 0;

        for (Cleanable item : buildings
        ) {
            result += item.clean();
        }

        this.buildings = new ArrayList<>();
        return result;
    }

    public int cleanOnlyOffices() {
        int result = 0;

        for (Cleanable cleanable : buildings) {
            if (cleanable instanceof Office) {
                result += cleanable.clean();

            }
        }

        buildings.removeIf(cleanable -> cleanable instanceof Office);

        return result;
    }

    List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable item : buildings
        ) {
            if (item.getAddress().contains(address)) {
                result.add(item);
            }

        }
        return result;
    }

    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < buildings.size(); i++) {
            sb.append(buildings.get(i).getAddress());
            if (i < buildings.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
