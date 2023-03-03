package com.example.trash01.model.entity.mapper;

import com.example.trash01.model.dto.StaffResponseDTO;
import com.example.trash01.model.entity.StaffEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StaffEntityMapper {
    List<StaffResponseDTO> toListDto(List<StaffEntity> staffEntity);
}