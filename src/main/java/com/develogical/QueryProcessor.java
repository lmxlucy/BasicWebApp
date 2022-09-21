package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("lucy")) {
            return "Lucy is a student at CMU.";
        }
        if (query.toLowerCase().contains("17313")) {
            return "17313 is a course at CMU.";
        }
        return "";
    }
}
