package comlojadedoces.dslist.dto;

import comlojadedoces.dslist.entities.GameList;

public class GameListDto {
     private Long id;
     private String nome;

    public GameListDto() {
    }

    public GameListDto(GameList entity) {
        id = entity.getId();
        nome = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
