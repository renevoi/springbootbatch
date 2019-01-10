package com.renevoi.batch.step;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<String> {
    @Override
    public void write(List<? extends String> items) throws Exception {
        for (String msg :
                items) {
            System.out.println("Writing the data " + msg);
        }
    }
}
