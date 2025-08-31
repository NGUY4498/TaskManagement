package org.example.webtasks.Repository;
import org.example.webtasks.Model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Tasks, Integer> {
    Optional<Tasks> findByTitle(Integer id);
}
