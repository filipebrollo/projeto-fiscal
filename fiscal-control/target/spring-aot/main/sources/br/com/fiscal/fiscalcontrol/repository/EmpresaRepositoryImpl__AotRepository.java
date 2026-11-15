package br.com.fiscal.fiscalcontrol.repository;

import br.com.fiscal.fiscalcontrol.entity.Empresa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link EmpresaRepository}.
 */
@Generated
public class EmpresaRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public EmpresaRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link EmpresaRepository#findByCnpj(java.lang.String)}.
   */
  public Optional<Empresa> findByCnpj(String cnpj) {
    String queryString = "SELECT e FROM Empresa e WHERE e.cnpj = :cnpj";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("cnpj", cnpj);

    return Optional.ofNullable((Empresa) convertOne(query.getSingleResultOrNull(), false, Empresa.class));
  }
}
