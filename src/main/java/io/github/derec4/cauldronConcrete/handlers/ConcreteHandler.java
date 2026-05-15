package io.github.derec4.cauldronConcrete.handlers;

import org.bukkit.Material;

public class ConcreteHandler {
    public static Material turnPowderIntoConcrete (final Material concretePowder) {
        // define variable as final because we will not be changing it, only reading

        if (!(concretePowder == Material.DIRT
                || concretePowder == Material.COARSE_DIRT
                || concretePowder == Material.ROOTED_DIRT)) {
            throw new IllegalArgumentException(concretePowder + " is not a valid dirt type");
        }

        return Material.MUD;
    }
}
