package com.renevoi.batch.step;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

    private String[] messages = {"renevoi.com", "ailia.com", "grace.com"};

    private int count = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException,
                                ParseException, NonTransientResourceException {

            if (count < messages.length) {
                return messages[count++];
            }else {
                count = 0;
            }

        return null;
    }
}
