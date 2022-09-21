package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutLucy() throws Exception {
        assertThat(queryProcessor.process("Lucy"), containsString("student"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("lucy"), containsString("student"));
    }

    @Test
    public void knows17313() throws Exception {
        assertThat(queryProcessor.process("what is 17313"), containsString("course"));
    }

}
