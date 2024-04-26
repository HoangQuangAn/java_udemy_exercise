package com.nttdata.exercise.inheritances;

public record Employee(String name, int emplyeeNumber) {
    public String nameUpperCase(){
        return name.toUpperCase();
    }
}
