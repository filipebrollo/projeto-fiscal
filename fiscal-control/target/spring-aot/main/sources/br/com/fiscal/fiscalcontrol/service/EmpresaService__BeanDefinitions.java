package br.com.fiscal.fiscalcontrol.service;

import br.com.fiscal.fiscalcontrol.repository.EmpresaRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmpresaService}.
 */
@Generated
public class EmpresaService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'empresaService'.
   */
  private static BeanInstanceSupplier<EmpresaService> getEmpresaServiceInstanceSupplier() {
    return BeanInstanceSupplier.<EmpresaService>forConstructor(EmpresaRepository.class)
            .withGenerator((registeredBean, args) -> new EmpresaService(args.get(0)));
  }

  /**
   * Get the bean definition for 'empresaService'.
   */
  public static BeanDefinition getEmpresaServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmpresaService.class);
    beanDefinition.setInstanceSupplier(getEmpresaServiceInstanceSupplier());
    return beanDefinition;
  }
}
