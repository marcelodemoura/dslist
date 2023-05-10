package comlojadedoces.dslist.service;

import comlojadedoces.dslist.dto.GameMinDTO;
import comlojadedoces.dslist.entities.Game;
import comlojadedoces.dslist.repositories.GameReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameReposytory gameReposytory;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameReposytory.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();


    }
}
