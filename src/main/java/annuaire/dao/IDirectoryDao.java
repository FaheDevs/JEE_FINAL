package annuaire.dao;

import annuaire.model.Group;
import annuaire.model.Person;

import java.util.Collection;

public interface IDirectoryDao {

    // récupérer les groupes
    Collection<Group> findAllGroups();

    // lire une personne
    Person findPerson(long id);

    // lire un groupe et ses personnes
    Group findGroup(long id);

    // modification ou ajout d'une nouvelle personne
    void savePerson(Person p);

    // modification ou ajout d'un nouveau groupe
    void saveGroup(Group g);

    // supprimer une personne
    void deletePerson(Person p);

    // supprimer un groupe
    void deleteGroup(Group g);
}
