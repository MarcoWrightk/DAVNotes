// Bind properties prefixed with app.datasource to DataSourceProperties
@Bean
@ConfigurationProperties("app.datasource")
public DataSourceProperties dataSourceProperties() {
    return new DataSourceProperties();
}

// Create Hikari DataSource using the bound properties
@Bean
public DataSource dataSource() {
    DataSourceProperties props = dataSourceProperties();
    return props.initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
}

// EntityManagerFactory for JPA
@Bean
public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
    emf.setDataSource(dataSource());
    emf.setPackagesToScan("com.davnotes.model"); // your @Entity package
    emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    emf.setJpaPropertyMap(hibernateProperties());
    emf.setPersistenceUnitName("davnotes-pu");
    return emf;
}

// Transaction manager
@Bean
public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean emf) {
    JpaTransactionManager tm = new JpaTransactionManager();
    tm.setEntityManagerFactory(emf.getObject());
    return tm;
}

private Map<String, Object> hibernateProperties() {
    Map<String, Object> props = new HashMap<>();
    // These can be moved to spring.jpa.* or app.jpa.* in properties file
    props.put("hibernate.hbm2ddl.auto", "update");
    props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
    props.put("hibernate.show_sql", "false");
    return props;
}
