package annuaire.dao;

import annuaire.model.Group;
import annuaire.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public class AnuuaireDao implements IDirectoryDao{


    @Override
    public Collection<Group> findAllGroups() {
        return null;
    }

    @Override
    public Person findPerson(long id) {
        return null;
    }

    @Override
    public Group findGroup(long id) {
        return null;
    }

    @Override
    public void savePerson(Person p) {

    }

    @Override
    public void saveGroup(Group g) {

    }

    @Override
    public void deletePerson(Person p) {

    }

    @Override
    public void deleteGroup(Group g) {

    }
}
