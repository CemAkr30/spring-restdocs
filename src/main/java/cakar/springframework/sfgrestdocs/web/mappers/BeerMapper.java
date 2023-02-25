package cakar.springframework.sfgrestdocs.web.mappers;

import cakar.springframework.sfgrestdocs.domain.Beer;
import cakar.springframework.sfgrestdocs.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {cakar.springframework.sfgrestdocs.web.mappers.DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
