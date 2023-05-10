package comlojadedoces.dslist.service;

import comlojadedoces.dslist.dto.GameDto;
import comlojadedoces.dslist.dto.GameMinDTO;
import comlojadedoces.dslist.entities.Game;
import comlojadedoces.dslist.repositories.GameReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameReposytory gameReposytory;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameReposytory.findById(id).get();
         return new GameDto(result);
//        return dto;

//        GameDto dto= new GameDto(reruslt);
//        return dto;
    }
    public List<GameMinDTO> findAll() {
        List<Game> result = gameReposytory.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();


    }
}
