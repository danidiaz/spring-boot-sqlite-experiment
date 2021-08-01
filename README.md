    hlwrap.exe sqlite3.exe personas.sqlite3

    .read create_database.sql

    mvn spring-boot:run

[https://www.baeldung.com/jpa-entity-table-names](https://www.baeldung.com/jpa-entity-table-names)

[.schema TABLENAME](https://stackoverflow.com/a/3330458/1364288)

[PRAGMA table_info([tablename]);](https://stackoverflow.com/a/7679086/1364288)

[Building REST services with Spring](https://spring.io/guides/tutorials/rest/) An official Spring tutorial, very complete.

[Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/). An official Spring guide.

> By default, Spring Boot enables JPA repository support and looks in the package (and its subpackages) where @SpringBootApplication is located. If your configuration has JPA repository interface definitions located in a package that is not visible, you can point out alternate packages by using @EnableJpaRepositories and its type-safe basePackageClasses=MyRepository.class parameter.

[Spring Data JPA | 2021](https://www.youtube.com/watch?v=8SGI_XS5OPw)

    o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
    org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.32.Final
    org.hibernate.cfg.Environment            : HHH000205: Loaded properties from resource hibernate.properties: {hibernate.bytecode.use_reflection_optimizer=false, hibernate.dialect=org.sqlite.hibernate.dialect.SQLiteDialect, hibernate.show_sql=true}
    o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
    org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.sqlite.hibernate.dialect.SQLiteDialect
    org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.sqlite.hibernate.dialect.SQLiteDialect
    o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
    j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
    JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
