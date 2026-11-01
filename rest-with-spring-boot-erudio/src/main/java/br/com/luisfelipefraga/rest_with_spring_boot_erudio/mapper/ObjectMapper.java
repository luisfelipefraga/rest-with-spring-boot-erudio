package br.com.luisfelipefraga.rest_with_spring_boot_erudio.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {

    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D> D parseObject(O origin, Class<D> destinantion) {
        return mapper.map(origin, destinantion);
    }

    public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destinantion) {
        List<D> destinantionObjects = new ArrayList<D>();

        for (Object o : origin) {
            destinantionObjects.add(mapper.map(o, destinantion));
        }
        return destinantionObjects;
    }
}
