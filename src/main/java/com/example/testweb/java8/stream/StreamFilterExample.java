package com.example.testweb.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
//    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
//        List<String> filtered = strings.stream()
//                .filter(s -> s.startsWith("a"))
//                .collect(Collectors.toList());
//
//        System.out.println(filtered); // [apple]
//    }

        public static void main(String[] args){
            StreamFilterExample streamFilterExample = new StreamFilterExample();
            List<String> strings = Arrays.asList("rabbit", "cat", null);
//            Stream<String> stream = strings.stream();
            //List<String> collect = stream.filter(s -> s.length() > 3).collect(Collectors.toList());
           // List<String> collect = strings.stream().filter(s -> s != null && s.length() > 3).collect(Collectors.toList());
            List<String> collect = strings.stream()
                    .map(StreamFilterExample::optionalOfString)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .filter(s -> s.length() > 3).collect(Collectors.toList());

            System.out.println(collect);

        }


        public static Optional<String> optionalOfString(String s){
            return Optional.ofNullable(s);
        }


        public void test(){
            String str =  "";
            Optional<String> str1 = Optional.of(str);
            Optional<String> str11 = Optional.ofNullable(str);
        }
}
