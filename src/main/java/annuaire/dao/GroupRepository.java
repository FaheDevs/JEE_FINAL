package annuaire.dao;

import annuaire.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group,Long > {

    // Find all groups
    List<Group> findAll();

    // Find group by id
    Group findById(long id);

    // Save or update a group
    <S extends Group> S save(Group group);

    // Delete a group
    void delete(Group group);

    // Find all groups by name
    List<Group> findByName(String name);


}
