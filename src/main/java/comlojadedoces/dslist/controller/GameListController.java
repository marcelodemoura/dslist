package comlojadedoces.dslist.controller;

import comlojadedoces.dslist.dto.GameListDto;
import comlojadedoces.dslist.dto.GameMinDTO;
import comlojadedoces.dslist.dto.ReplacementDto;
import comlojadedoces.dslist.service.GameListService;
import comlojadedoces.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto>findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO>findById(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDto body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

    }


}
