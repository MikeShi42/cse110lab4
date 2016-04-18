package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

    public Celsius(float t)
        {
            super(t);
        }

    @java.lang.Override
    public Temperature toCelsius() {
        return this;
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.value * (9f/5) + 32);
    }


    public String toString() {
        return String.valueOf(this.value) + " C";
    }
}
