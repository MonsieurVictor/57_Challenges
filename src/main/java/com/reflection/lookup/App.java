package com.reflection.lookup;

import java.util.HashMap;
import java.util.Map;

public class App {

    private Map<String, String> operations = new HashMap<String, String>();

    private String PATH = "com.reflection.lookup.";

    public App() {
        operations.put("+", "Add");
        operations.put("-", "Subtract");
    }

    public Operation getOperation(String operationToken)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return  (Operation) Class
                .forName(this.PATH + operations.get(operationToken))
                .newInstance();
    }

    public static void main(String[] args) {
        App app = new App();
        try {
            Operation operation = app.getOperation("-");
            operation.calculate(5, 4);
            operation.printResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
