package pl.kruzer.repository.search;

import pl.kruzer.domain.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Employee} entity.
 */
public interface EmployeeSearchRepository extends ElasticsearchRepository<Employee, Long> {
}
