package com.org;

import java.util.*;
import java.util.stream.Stream;

public class Heo {
    public int solution(
            String p,
            String d,
            int s
    ) {
        Map<String,Integer> devices= new HashMap();
        String[] splits = p.split(" ");
        Integer count=0;

        Stream.of(splits).forEach(s22->{

        });

        for(int i=0; i<splits.length; i++){

            String[] item = splits[i].split(",");
            String device = item[0];
            Integer value = Integer.parseInt(item[1]);

            if(device.equals(d)){

                if(devices.get(device)==null){
                    devices.put(device, value);
                }else{
                    if(value == devices.get(device) + s){
                        devices.put(device, value);
                    }else{
                        count++;
                        devices.put(device, value);
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new Heo().solution("a,0 b,0 a,10 a,30 a,40 a,60","a",10));
    }
}
