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

    com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
    o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
    org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.32.Final
    org.hibernate.cfg.Environment            : HHH000205: Loaded properties from resource hibernate.properties: {hibernate.bytecode.use_reflection_optimizer=false, hibernate.dialect=org.sqlite.hibernate.dialect.SQLiteDialect, hibernate.show_sql=true}
    o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
    org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.sqlite.hibernate.dialect.SQLiteDialect
    org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.sqlite.hibernate.dialect.SQLiteDialect
    o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
    j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
    tor$SharedEntityManagerInvocationHandler : Creating new EntityManager for shared EntityManager invocation
    tor$SharedEntityManagerInvocationHandler : Creating new EntityManager for shared EntityManager invocation
    tor$SharedEntityManagerInvocationHandler : Creating new EntityManager for shared EntityManager invocation
    JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
    o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
    org.danisoft.datitos.DatitosApplication  : Started DatitosApplication in 4.733 seconds (JVM running for 5.216)
    o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
    o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
    o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
    o.j.s.OpenEntityManagerInViewInterceptor : Opening JPA EntityManager in OpenEntityManagerInViewInterceptor
    o.s.orm.jpa.JpaTransactionManager        : Found thread-bound EntityManager [SessionImpl(1818990914<open>)] for JPA transaction
    o.s.orm.jpa.JpaTransactionManager        : Creating new transaction with name [org.danisoft.datitos.PersonService.getPersonName]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT
    o.s.orm.jpa.JpaTransactionManager        : Exposing JPA transaction as JDBC [org.springframework.orm.jpa.vendor.HibernateJpaDialect$HibernateConnectionHandle@2cb4996c]
    o.s.orm.jpa.JpaTransactionManager        : Found thread-bound EntityManager [SessionImpl(1818990914<open>)] for JPA transaction
    o.s.orm.jpa.JpaTransactionManager        : Participating in existing transaction
    erson0_.age as age2_0_0_, person0_.name as name3_0_0_ from persona person0_ where person0_.id_persona=?
    o.s.orm.jpa.JpaTransactionManager        : Initiating transaction commit
    o.s.orm.jpa.JpaTransactionManager        : Committing JPA transaction on EntityManager [SessionImpl(1818990914<open>)]
    o.s.orm.jpa.JpaTransactionManager        : Not closing pre-bound JPA EntityManager after transaction
    o.j.s.OpenEntityManagerInViewInterceptor : Closing JPA EntityManager in OpenEntityManagerInViewInterceptor

