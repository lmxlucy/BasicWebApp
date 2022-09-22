package com.develogical;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.Collections;

public class QueryProcessor {

    public String process(String query) {
        
        if (query.toLowerCase().contains("largest")) {
            Pattern regex = Pattern.compile("which of the following numbers is the largest: (\\w+)");
            Matcher matcher = regex.matcher(query);
            return String.valueOf(Arrays.stream(matcher.group(1).split(",")).mapToInt(Integer::parseInt).max());
        }
        return "";
    }
}
