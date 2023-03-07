package com.metalsa.api.util;

import org.modelmapper.ModelMapper;

public class MapperUtil {

    private static ModelMapper mapper;

    private MapperUtil(ModelMapper mapper) {
        MapperUtil.mapper = mapper;
    }

    public static <T> T mapToDTO (Object source, Class<T> destinationType){
        return mapper.map(source, destinationType);
    }

    public static <T> T mapToEntity (Object source, Class<T> destinationType){
        return mapper.map(source, destinationType);
    }
}
