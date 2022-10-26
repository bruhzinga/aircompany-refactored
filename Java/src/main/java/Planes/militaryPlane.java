package Planes;

import models.MilitaryType;

import java.util.Objects;

public class militaryPlane extends Plane {

    private final MilitaryType type;

    public militaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", String.format(", type=%s}", type));
    }

    @Override
    public boolean equals(Object secondPlane) {
        if (this == secondPlane) return true;
        if (!(secondPlane instanceof militaryPlane)) return false;
        if (!super.equals(secondPlane)) return false;
        militaryPlane that = (militaryPlane) secondPlane;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
