package common;

import io.cucumber.java.ParameterType;

public class ExpressionTypes {

    @ParameterType("red|blue|yellow")  // regexp
    public Color color(String color){  // type, name (from method)
        return new Color(color);       // transformer function
    }
}

