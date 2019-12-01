package structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Forum extends Entity {

    List<Entity> members = new ArrayList<Entity>();

    @Override
    public void introduceYourself() {
        for (Entity e: members) {
            e.introduceYourself();
        }
    }

    public void addMember(Entity entity) {
        members.add(entity);
    }

    public void remove(Entity entity) {
        members.remove(entity);
    }
}
