package comlojadedoces.dslist.service;

import comlojadedoces.dslist.dto.GameListDto;
import comlojadedoces.dslist.entities.GameList;
import comlojadedoces.dslist.repositories.GameListReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListReposytory gameListReposytory;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> result = gameListReposytory.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();


    }
}
