package comlojadedoces.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "name_bilonging")
public class Belonging {
    @EmbeddedId
    private BilongingPk id = new BilongingPk();
    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game ,GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BilongingPk getId() {
        return id;
    }

    public void setId(BilongingPk id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }


    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Belonging belonging)) return false;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

