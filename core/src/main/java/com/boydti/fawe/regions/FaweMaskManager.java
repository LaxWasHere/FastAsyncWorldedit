package com.boydti.fawe.regions;

import com.boydti.fawe.object.FawePlayer;

public abstract class FaweMaskManager<T> {

    public enum MaskType {
        OWNER,
        MEMBER
    }

    private final String key;

    public FaweMaskManager(final String plugin) {
        this.key = plugin.toLowerCase();
    }

    public String getKey() {
        return this.key;
    }

    @Override
    public String toString() {
        return this.key;
    }

    public FaweMask getMask(final FawePlayer<T> player) {
        return getMask(player, MaskType.MEMBER);
    }

    public FaweMask getMask(final FawePlayer<T> player, MaskType type) {
        return getMask(player);
    }
}
