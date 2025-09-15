package respritatory;
import model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface respirtory extends JpaRepository<Course, Long>{

}
