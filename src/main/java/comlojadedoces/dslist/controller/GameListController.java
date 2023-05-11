package comlojadedoces.dslist.controller;

import comlojadedoces.dslist.dto.GameDto;
import comlojadedoces.dslist.dto.GameListDto;
import comlojadedoces.dslist.dto.GameMinDTO;
import comlojadedoces.dslist.service.GameListService;
import comlojadedoces.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto>findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }
}
