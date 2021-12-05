package com.fizzware.dramaticdoors.state.properties;

import net.minecraft.util.IStringSerializable;

public enum TripleBlockPart implements IStringSerializable  {
    UPPER,
    MIDDLE,
    LOWER;

    public String toString() { return this.getSerializedName(); }

    public String getSerializedName() {
        return this == UPPER ? "upper" : this == MIDDLE ? "middle" : "lower";
    }

}