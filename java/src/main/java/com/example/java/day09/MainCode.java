package com.example.java.day09;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCode {

    private static Employee[] arrayOfEmps = {
            new Employee(1, "jet0", 10000.0),
            new Employee(2, "jet1", 10001.0),
            new Employee(3, "jet2", 10002.0)
    };


    public static void main(String[] args) {

        List<List<String>> nameNested = Arrays.asList(
                Arrays.asList("jeff", "Bezos"),
                Arrays.asList("name", "get"),
                Arrays.asList("mark", "zu")
        );
        List<String> namesFlatStream = nameNested.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(namesFlatStream);

    }

    /**
     * 列转行,传入的列表进行列转行操作
     * @param stream 列表数据
     * @param switchFunc 列转行方法
     * */
    public static <T,R> List<R> columnSwitch(Stream<T> stream, Function<T,List<R>> switchFunc){
        List<R> list = stream.map(switchFunc)
                .flatMap(List::stream)//降维打击
                .collect(Collectors.toList());
        return list;
    }


}
