package fr.nb.ediyo.service.mapper;

import fr.nb.ediyo.domain.*;
import fr.nb.ediyo.service.dto.TagDTO;
import java.util.Set;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Tag} and its DTO {@link TagDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TagMapper extends EntityMapper<TagDTO, Tag> {
    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<TagDTO> toDtoIdSet(Set<Tag> tag);
}
