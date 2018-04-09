package com.foqc.entities;

/**
 *
 * @author foqc
 */
public abstract class Animal {

    protected String[] sounds;

    public Animal() {
        sounds = new String[]{};
    }

    protected String makeSound(int i) {
        return (sounds[i]);
    }

}
