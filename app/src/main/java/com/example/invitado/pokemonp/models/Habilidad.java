package com.example.invitado.pokemonp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Invitado
 */

public class Habilidad {
    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("slot")
    @Expose
    private Integer slot;
    @SerializedName("ability")
    @Expose
    private HabilidadPokemon ability;

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public HabilidadPokemon getAbility() {
        return ability;
    }

    public void setAbility(HabilidadPokemon ability) {
        this.ability = ability;
    }

}
