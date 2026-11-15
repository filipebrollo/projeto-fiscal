package br.com.fiscal.fiscalcontrol;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FiscalControlApplication}.
 */
@Generated
public class FiscalControlApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'fiscalControlApplication'.
   */
  public static BeanDefinition getFiscalControlApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FiscalControlApplication.class);
    beanDefinition.setInstanceSupplier(FiscalControlApplication::new);
    return beanDefinition;
  }
}
